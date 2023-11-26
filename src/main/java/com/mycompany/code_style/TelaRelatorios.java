/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.code_style;

public class TelaRelatorios extends javax.swing.JFrame {

 
    public TelaRelatorios() {
        initComponents();
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAnalitico = new javax.swing.JButton();
        btnSintetico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatórios");

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setPreferredSize(new java.awt.Dimension(764, 431));

        btnAnalitico.setBackground(new java.awt.Color(29, 40, 66));
        btnAnalitico.setFont(btnAnalitico.getFont().deriveFont(btnAnalitico.getFont().getStyle() | java.awt.Font.BOLD, btnAnalitico.getFont().getSize()-2));
        btnAnalitico.setText("RELATÓRIOS ANALITICOS");
        btnAnalitico.setActionCommand("Produtos");
        btnAnalitico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaliticoActionPerformed(evt);
            }
        });

        btnSintetico.setBackground(new java.awt.Color(29, 40, 66));
        btnSintetico.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnSintetico.setText("RELATÓRIOS SINTETICOS");
        btnSintetico.setActionCommand("Clientes");
        btnSintetico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinteticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(btnSintetico, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalitico, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btnSintetico, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaliticoActionPerformed
        // TODO add your handling code here:
        
        Relatorio_analitico analitico = new Relatorio_analitico();
        analitico.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnAnaliticoActionPerformed

    private void btnSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinteticoActionPerformed
        // TODO add your handling code here:
        
        Relatorio_sintetico sintetico = new Relatorio_sintetico();
        sintetico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSinteticoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalitico;
    private javax.swing.JButton btnSintetico;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
