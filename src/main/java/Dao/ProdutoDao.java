package Dao;

import Interface.IGenericDao;
import Repository.DatabaseConector;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao implements IGenericDao<Produto> {
    
    private Connection conn;
    
    public ProdutoDao() {
         this.conn = new DatabaseConector().dbConn();
    }
    
    @Override
    public void salvar(Produto produto) {
        try{
            String sql = "INSERT INTO produto (nome, preco, quantidade) VALUES (?, ?, ?)";
           
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setDouble(2, produto.getPreco());
            preparedStatement.setInt(3, produto.getQuantidade());  
            preparedStatement.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Produto produto) {
       try{
            String sql = "UPDATE Produto SET nome = ?, preco = ?, quantidade = ? WHERE id = ?";
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, produto.getNome());
                preparedStatement.setDouble(2, produto.getPreco());
                preparedStatement.setInt(3, produto.getQuantidade());
                preparedStatement.setLong(4, produto.getId());
                preparedStatement.executeUpdate();
            }
       }catch(SQLException e) {
           e.printStackTrace();
       }
    }

    @Override
    public void excluir(Long id) {
        try{
            String sql = "DELETE FROM Produto WHERE id = ?";
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setLong(1, id);
                preparedStatement.executeUpdate();
            }
       }catch(SQLException e) {
           e.printStackTrace();
       }
    }

    @Override
    public Produto buscarPorId(Long id) {
        try{
            String sql = "SELECT * FROM Produto WHERE id = ?";
            Produto produto = new Produto();
            
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                
                preparedStatement.setLong(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                
                if (resultSet.next()) {
                    produto.setId(resultSet.getLong("id"));
                    produto.setNome(resultSet.getString("nome"));
                    produto.setPreco(resultSet.getDouble("preco"));
                    produto.setQuantidade(resultSet.getInt("quantidade"));
                    return produto;     
                }   
                
            }
       }catch(SQLException e) {
           e.printStackTrace();
       }
        
       return null;
    }

    @Override
    public List<Produto> buscarTodos() {
        List<Produto> produtos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM produto";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                
                    ResultSet resultSet = preparedStatement.executeQuery();
                    
                    while(resultSet.next()) {
                        Produto produto = new Produto();
                        produto.setId(resultSet.getLong("id"));
                        produto.setNome(resultSet.getString("nome"));
                        produto.setPreco(resultSet.getDouble("preco"));
                        produto.setQuantidade(resultSet.getInt("quantidade"));
                        produtos.add(produto);     
                    } 
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
}
