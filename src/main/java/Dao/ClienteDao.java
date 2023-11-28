/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Interface.IGenericDao;
import Model.Cliente;
import Repository.DatabaseConector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ClienteDao implements IGenericDao<Cliente> {

    private Connection conn;
    
    /**
     *  Requisição de conexão com banco de dados
     */
    public ClienteDao() {
        conn = new DatabaseConector().dbConn();
    }
    
    /**
     * Responsável por persistir as informações recebidas pela instância 
     * de Cliente na base de dados.
     * @param cliente 
     */
    @Override
    public void salvar(Cliente cliente) {
        try{
            String sql = "INSERT INTO Cliente (nome, cpf, email) VALUES (?, ?, ?)";
           
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf()); 
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Responsável por atualizar as os campos NOME e EMAIL de um determinado cliente
     * com base no ID que é obtido da instância de Cliente recebida por parâmetro.
     * @param cliente 
     */
    @Override
    public void atualizar(Cliente cliente) {
        try{
            String sql = "UPDATE Cliente SET nome = ?, cpf = ?, email = ? WHERE id = ?";
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, cliente.getNome());
                preparedStatement.setString(2, cliente.getCpf());
                preparedStatement.setString(3, cliente.getEmail());
                preparedStatement.setLong(4, cliente.getId());
                preparedStatement.executeUpdate();
            }
       }catch(SQLException e) {
           e.printStackTrace();
       }
    }

    /**
     * Por meio do ID recebido como um valor inteiro por parâmetro, é responsável 
     * por encontrar um CLIENTE na base de dados e excluí-lo.
     * @param id 
     */
    @Override
    public void excluir(int id) {
        try{
            String sql = "DELETE FROM Cliente WHERE id = ?";
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setLong(1, id);
                preparedStatement.executeUpdate();
            }
       }catch(SQLException e) {
           e.printStackTrace();
       }
    }

    /**
     * Através do ID recebido como um valor inteiro por parâmetro, 
     * será responsável por encontrar o CLIENTE com mesmo ID e retorná-lo.
     * @param id
     * @return instância de Cliente com mesmo ID recebido por parâmetro.
     */
    @Override
    public Cliente buscarPorId(int id) {
        try{
            String sql = "SELECT * FROM Cliente WHERE id = ?";
            Cliente cliente = new Cliente();
            
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                
                preparedStatement.setLong(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                
                if (resultSet.next()) {
                    cliente.setId(resultSet.getLong("id"));
                    cliente.setNome(resultSet.getString("nome"));
                    cliente.setCpf(resultSet.getString("cpf"));
                    cliente.setEmail(resultSet.getString("email"));
                    return cliente;     
                }   
                
            }
       }catch(SQLException e) {
           e.printStackTrace();
       }
        
       return null;
    }

    /**
     * Será responsável por retornar uma lista contendo todos 
     * os CLIENTES cadastrados na base de dados.
     * @return Coleção ordenada (List) contendo todos as instâncias de Cliente.
     */
    @Override
    public List<Cliente> buscarTodos() {
       List<Cliente> clientes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Cliente";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                
                    ResultSet resultSet = preparedStatement.executeQuery();
                    
                    while(resultSet.next()) {
                        Cliente cliente = new Cliente();
                        cliente.setId(resultSet.getLong("id"));
                        cliente.setNome(resultSet.getString("nome"));
                        cliente.setCpf(resultSet.getString("cpf"));
                        cliente.setEmail(resultSet.getString("email"));
                        clientes.add(cliente);     
                    } 
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
    
    /**
     * Responsável por filtrar todos os CLIENTES que possuírem
     * o valor da variável pesquisa no campo nome.
     * @param pesquisa
     * @return Coleção ordenada de instâncias de CLIENTES.
     */
    @Override
    public List<Cliente> search(String pesquisa) {
       List<Cliente> clientes = new ArrayList();
        
        try{
            String sql = "SELECT * FROM Cliente WHERE nome LIKE '%" + pesquisa + "%'";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
                  
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(resultSet.getLong("id"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setCpf(resultSet.getString("cpf"));
                cliente.setEmail(resultSet.getString("email"));
                clientes.add(cliente);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
        return clientes;
    }
    
}
