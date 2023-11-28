/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Venda;
import Repository.DatabaseConector;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class VendaDao {
    
    private Connection conn;

    /**
     *  Requisição de conexão com banco de dados
     */
    public VendaDao() {
        this.conn = new DatabaseConector().dbConn();
    }

    /**
     * É responsável por registrar uma nova venda na base de dados, os valores
     * que serão persistidos são obtidos da instância de VENDAS recebida por parâmetro.
     * @param venda 
     */
    public void inserirVenda(Venda venda) {
        try {
            String sql = "INSERT INTO Venda (quantidade, ClienteID, ProdutoID) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, venda.getQuantidade());
            statement.setInt(2, venda.getClientId());
            statement.setInt(3, venda.getProdutoId());

            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error inserting sale data: " + e.getMessage());
        }
    }

    /**
     * Método responsável por consultar todas as vendas registradas
     * na base de dados e retorná-las com sucesso.
     * @return Coleção ordenada contendo todas as instâncias de Venda encontradas.
     */
    public List<Venda> listarVendas() {
        List<Venda> vendas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM Venda";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Venda venda = new Venda();
                venda.setId(resultSet.getInt("id"));
                venda.setQuantidade(resultSet.getInt("quantidade"));
                venda.setClientId(resultSet.getInt("ClienteID"));
                venda.setProdutoId(resultSet.getInt("ProdutoID"));

                vendas.add(venda);
            }

            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error retrieving sale data: " + e.getMessage());
        }

        return vendas;
    }
}
