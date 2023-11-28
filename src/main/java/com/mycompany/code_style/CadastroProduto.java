package com.mycompany.code_style;

import Dao.ProdutoDao;
import Model.Produto;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class CadastroProduto extends javax.swing.JFrame {
    
    private ProdutoDao produtoDao = new ProdutoDao();
    
    public CadastroProduto() {
        initComponents();
        colors();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeProduto = new javax.swing.JLabel();
        lblPrecoProduto = new javax.swing.JLabel();
        lblQuantidadeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtQuantidadeProduto = new javax.swing.JTextField();
        btnCadastroProduto = new javax.swing.JButton();
        inputPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastre um novo produto");

        lblNomeProduto.setText("Nome:");

        lblPrecoProduto.setText("Preço:");

        lblQuantidadeProduto.setText("Quantidade:");

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        btnCadastroProduto.setText("Cadastrar");
        btnCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblQuantidadeProduto)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecoProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblNomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPrecoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQuantidadeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdutoActionPerformed

        String nome =  txtNomeProduto.getText();
        double preco = Double.parseDouble(inputPreco.getText());
        int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
        
        if (!isProductNameValid(nome)){ 
            JOptionPane.showMessageDialog(null, "Nome cadastrado é invalido");
            return;
        }  
        
        if (!isProductPriceValid(preco)) {
            JOptionPane.showMessageDialog(null, "Preço cadastrado é invalido");
            return;
        }
        
        if (!isProductQuantityValid(quantidade)) {
            JOptionPane.showMessageDialog(null, "Quantidade cadastrada é invalida");
            return;
        }
            
        Produto produto = new Produto(
                nome,
                preco,
                quantidade
        );
              
        JOptionPane.showConfirmDialog(null, produto.toString());
        
        produtoDao.salvar(produto);
    }//GEN-LAST:event_btnCadastroProdutoActionPerformed

    boolean isProductNameValid(String name) {
        if (!name.isEmpty() && name.matches("^[a-zA-Z\\s]*$"))
            return true;
        
        return false;
    }
    
    boolean isProductPriceValid(Double price) {
        if (price > 0)
            return true;
        
        return false;
    }
    
    boolean isProductQuantityValid(int qtd) {
        if (qtd > 0 && qtd < 1000) {
            return true;
        }
        return false;
    }
    
    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    void colors() {
         // Defina a cor de fundo do JFrame
        this.getContentPane().setBackground(new java.awt.Color(173, 216, 230)); // azul
        // Defina a cor de fundo de alguns componentes
        txtNomeProduto.setBackground(new java.awt.Color(255, 255, 255)); // branco    
        txtQuantidadeProduto.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastroProduto.setBackground(new java.awt.Color(143, 192, 220)); 
        //Crie uma borda com uma cor preta
        Border border = BorderFactory.createLineBorder(new java.awt.Color(70, 70, 70));
        
        txtNomeProduto.setBorder(border);
        txtQuantidadeProduto.setBorder(border);
        btnCadastroProduto.setBorder(border);
    }
    
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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroProduto;
    private javax.swing.JTextField inputPreco;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPrecoProduto;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables

}


