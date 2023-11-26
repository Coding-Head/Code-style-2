package com.mycompany.code_style;

import Dao.ProdutoDao;
import Model.Produto;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class CadastroProduto extends javax.swing.JFrame {
    
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
        txtId = new javax.swing.JTextField();
        txtQuantidadeProduto = new javax.swing.JTextField();
        btnCadastroProduto = new javax.swing.JButton();
        txtPrecoProduto1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel1.setText("id:");

        ButtonVoltar.setText("<");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidadeProduto)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeProduto)
                                .addComponent(lblPrecoProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPrecoProduto1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                    .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblNomeProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrecoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuantidadeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdutoActionPerformed
        
        String nome =  txtNomeProduto.getText();
        double preco = Double.parseDouble(txtId.getText());
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
        
        CadastrarProduto(produto);
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
    
    private void CadastrarProduto(Produto produto) {
        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.salvar(produto);
    }
    
    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void ButtonVoltar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltar

    }//GEN-LAST:event_ButtonVoltar

    private void verificarCamposAtivos() {
        TelaProdutos telaProduto = new TelaProdutos();
    }
    
    void colors() {
         // Defina a cor de fundo do JFrame
        this.getContentPane().setBackground(new java.awt.Color(173, 216, 230)); // azul
        // Defina a cor de fundo de alguns componentes
        txtNomeProduto.setBackground(new java.awt.Color(255, 255, 255)); // branco    
        txtId.setBackground(new java.awt.Color(255, 255, 255)); // branco
        txtQuantidadeProduto.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastroProduto.setBackground(new java.awt.Color(143, 192, 220)); 
        //Crie uma borda com uma cor preta
        Border border = BorderFactory.createLineBorder(new java.awt.Color(70, 70, 70));
        
        txtNomeProduto.setBorder(border);
        txtId.setBorder(border);
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
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JButton btnCadastroProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPrecoProduto;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto1;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables

}


