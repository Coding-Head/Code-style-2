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
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class VendaDao {
    
    private Connection conn;

    public VendaDao(Connection conn) {
        this.conn = conn;
    }

    public void inserirVenda(Venda venda) {
        try {
            String sql = "INSERT INTO Venda (TotalDaVenda, ClienteID, ProdutoID) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, venda.getTotalDaVenda());
            statement.setInt(5, venda.getClientId());
            statement.setInt(6, venda.getProdutoId());

            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error inserting sale data: " + e.getMessage());
        }
    }

    public List<Venda> listarVendas() {
        List<Venda> vendas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM Venda";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Venda venda = new Venda();
                venda.setId(resultSet.getInt("id"));
                venda.setTotalDaVenda(resultSet.getInt("TotalDaVenda"));
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
