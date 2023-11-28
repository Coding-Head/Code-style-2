/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConector {

    private Connection conn;

    public DatabaseConector() {
        this.conn = dbConn();
        criarTabelas();
    }

    public void criarTabelas() {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS Produto ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(255),"
                    + "preco DOUBLE, "
                    + "quantidade INT NOT NULL)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();

            sql = "CREATE TABLE IF NOT EXISTS Cliente ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(255),"
                    + "cpf VARCHAR(35),"
                    + "email VARCHAR(255))";

            statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();

            sql = "CREATE TABLE IF NOT EXISTS Venda("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "TotalDaVenda INT,"
                    + "ClienteID INT,"  // Foreign key reference to Cliente table
                    + "ProdutoID INT,"  // Foreign key reference to Produto table
                    + "FOREIGN KEY (ClienteID) REFERENCES Cliente(id),"
                    + "FOREIGN KEY (ProdutoID) REFERENCES Produto(id))";

            statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed" + e.getMessage());
        }
    }

    public Connection dbConn() {
        try {

            String url = "jdbc:mysql://localhost:3306/?user=root&password=252525";
            Connection connection = DriverManager.getConnection(url);

            String dbName = "code_style";
            String createDbSql = "CREATE DATABASE IF NOT EXISTS " + dbName;

            connection.prepareStatement(createDbSql).executeUpdate();

            url = "jdbc:mysql://localhost:3306/" + dbName + "?user=root&password=252525";
            connection = DriverManager.getConnection(url);
            
            return connection;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados: " + e.getMessage());
            throw new RuntimeException("Erro na conexão com o banco de dados.", e);
        }
    }
}
