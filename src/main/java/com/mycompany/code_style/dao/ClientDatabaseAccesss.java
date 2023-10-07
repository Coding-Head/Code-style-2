/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.code_style.dao;

import com.mycompany.code_style.dto.ClienteDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClientDatabaseAccesss {

    private Connection conn;
    
    public ResultSet clientAuthentication(ClienteDto data) {
        conn = new DatabaseConector().dbConn();
        
        try {
            String sql = "select * from client where client_name = ? and client_passowrd = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, data.getEmail());
            pstm.setString(2, data.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error getting client information" + e.getMessage()
            );
            return null;
        }
    }
}
