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
    
     /**
     *  Requisição de conexão com banco de dados
     */
    public ProdutoDao() {
         this.conn = new DatabaseConector().dbConn();
    }
    
    /**
     * Responsável por persistir as informações recebidas pela instância
     * de Produto na base de dados.
     * @param produto 
     */
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
     
    /**
     * Responsável por verificar a quantidade (estoque) de um determinado
     * produto com base no valor inteiro ID recebido por parâmetro.
     * @param produtoId
     * @return Inteiro indicando quantidade em estoque.
     */
    public int obterQuantidade(int produtoId) {
        int quantidade = 0;
        
        try{
            String sql = "SELECT quantidade FROM produto WHERE id = " + produtoId;

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery(sql);

            // Verifica se há resultados e obtém a quantidade
            if (result.next()) {
                quantidade = result.getInt("quantidade");
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
        return quantidade;
    }

    /**
     * É responsávo por encontrar um produto através do ID e atualizá-lo
     * com as informações recebidas através da instância de Produto recebida por 
     * parâmetro.
     * @param produto 
     */
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
    
    /**
     * Irá encontrar um produto que possua o ID correspondente ao valor inteiro
     * recebido por parâmetro e será responsável por excluí-lo da base de dados.
     * @param id 
     */
    @Override
    public void excluir(int id) {
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

    /**
     * Será responsável por encontrar o produto que possua o ID correspondente
     * ao valor inteiro recebido por parâmetro e retorná-lo com sucesso.
     * @param id 
     * @return instância de Produto com ID correspondente.
     */
    @Override
    public Produto buscarPorId(int id) {
        try{
            String sql = "SELECT * FROM Produto WHERE id = ?";
            Produto produto = new Produto();
            
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                
                preparedStatement.setInt(1, id);
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

    /**
     * É reponsável por buscar todos os PRODUTOS e seus devidos campos registrados 
     * na base de dados e retorná-los com sucesso.
     * @return Coleção ordenada contendo todas as instâncias de Produto.
     */
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
    
    /**
     * Responsável por buscar na base de dados todos os produtos que possuam
     * o campo NOME correspondentes à variável pesquisa.
     * @param pesquis
     * @return Coleção crdenada contendo instâncias de Produto que 
     * atendam ao requisito.
     */
    @Override
    public List<Produto> search(String pesquisa) {
        List<Produto> produtos = new ArrayList();
        
        try{
              String sql = "SELECT * FROM produto WHERE nome LIKE '%" + pesquisa + "%'";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
                  
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Produto produto = new Produto();
                produto.setId(resultSet.getLong("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setPreco(resultSet.getDouble("preco"));
                produto.setQuantidade(resultSet.getInt("quantidade"));
                produtos.add(produto);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
        return produtos;
    }
}
