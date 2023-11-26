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
                    + "preco DOUBLE);";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();

            sql = "CREATE TABLE IF NOT EXISTS Cliente ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(255),"
                    + "cpf VARCHAR(15),"
                    + "endereco VARCHAR(50),"
                    + "sexo VARCHAR(25),"
                    + "email VARCHAR(90),"
                    + "senha VARCHAR(30));";

            statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();

            sql = "CREATE TABLE IF NOT EXISTS Categoria ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(60),"
                    + "descricao VARCHAR(120));";

            statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();

            sql = "CREATE TABLE IF NOT EXISTS Login("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "email VARCHAR(80),"
                    + "senha VARCHAR(30));";

            statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();

            sql = "CREATE TABLE IF NOT EXISTS Cadastro("
                    + "idCadastro INT PRIMARY KEY AUTO_INCREMENT,"
                    + "nome VARCHAR(50),"
                    + "cpf VARCHAR(15),"
                    + "idade INT NOT NULL,"
                    + "endereco VARCHAR(45),"
                    + "sexo CHAR(20),"
                    + "email VARCHAR(40),"
                    + "senha VARCHAR(30));";

            statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();

            sql = "CREATE TABLE IF NOT EXISTS Cadastro("
                    + "idCadastro INT PRIMARY KEY AUTO_INCREMENT,"
                    + "nome VARCHAR(50),"
                    + "cpf VARCHAR(15),"
                    + "idade INT NOT NULL,"
                    + "endereco VARCHAR(45),"
                    + "sexo CHAR(20),"
                    + "email VARCHAR(40),"
                    + "senha VARCHAR(30));";

            statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();

            sql = "CREATE TABLE IF NOT EXISTS Venda("
                    + "idVenda INT PRIMARY KEY AUTO_INCREMENT,"
                    + "TotalDaVenda int,"
                    + "QtdVendida int,"
                    + "MtdPagamento int,"
                    + "EstadoVenda varchar(25));";
            
            statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed" + e.getMessage());
        }
    }

    public Connection dbConn() {
        try {

            String url = "jdbc:mysql://localhost:3306/?user=root&password=";
            Connection connection = DriverManager.getConnection(url);

            String dbName = "code_style";
            String createDbSql = "CREATE DATABASE IF NOT EXISTS " + dbName;

            connection.prepareStatement(createDbSql).executeUpdate();

            url = "jdbc:mysql://localhost:3306/" + dbName + "?user=root&password=";
            connection = DriverManager.getConnection(url);
            return connection;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados: " + e.getMessage());
            throw new RuntimeException("Erro na conexão com o banco de dados.", e);
        }
    }
}
