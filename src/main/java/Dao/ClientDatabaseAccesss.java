/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Repository.DatabaseConector;
import Dto.ClienteDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClientDatabaseAccesss {

    private Connection conn;
    
    /**
     * Este método verificará no banco de dados se a senha e usuário 
     * recebidas através da instância de ClientDto (data) está correta 
     * e então autentificará o usuário.
     * @param data instância de ClientDto
     * @return ResultSet contendo as informações.
     */
    public ResultSet clientAuthentication(ClienteDto data) {
        conn = new DatabaseConector().dbConn();
        
        
        try {
            String sql = "select * from client where client_name = ? and client_password = ?";
            
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
