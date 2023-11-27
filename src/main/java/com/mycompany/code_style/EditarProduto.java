/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.code_style;

import Dao.ProdutoDao;
import Model.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class EditarProduto extends javax.swing.JFrame {

    /**
     * Creates new form EditarProduto
     */
    public EditarProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputEnviar = new javax.swing.JButton();
        inputNome = new javax.swing.JTextField();
        InputQuantidade = new javax.swing.JTextField();
        InputId = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        preço = new javax.swing.JLabel();
        quantidadeLabel = new javax.swing.JLabel();
        IdLabel = new javax.swing.JLabel();
        precoLabel = new javax.swing.JLabel();
        precoInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputEnviar.setText("Enviar");
        inputEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEnviar(evt);
            }
        });

        nomeLabel.setText("Nome:");

        preço.setToolTipText("");

        quantidadeLabel.setText("Quantidade:");

        IdLabel.setText("Id:");

        precoLabel.setText("Preço:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(preço)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IdLabel)
                    .addComponent(nomeLabel)
                    .addComponent(inputNome)
                    .addComponent(quantidadeLabel)
                    .addComponent(inputEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(InputQuantidade)
                    .addComponent(InputId)
                    .addComponent(precoLabel)
                    .addComponent(precoInput))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(precoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(precoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preço)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(quantidadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(inputEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputEnviar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnviar
        String nome =  inputNome.getText();
        double preco = Double.parseDouble(precoInput.getText());
        int quantidade = Integer.parseInt(InputQuantidade.getText());
        int id = Integer.parseInt(InputId.getText());
        
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
        
        produto.setId(id);
        
        JOptionPane.showConfirmDialog(null, produto.UpdateProduto());
        
        UpdateProduto(produto);
    }//GEN-LAST:event_inputEnviar

     private void UpdateProduto(Produto produto) {
        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.atualizar(produto);
    }
    
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
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdLabel;
    private javax.swing.JTextField InputId;
    private javax.swing.JTextField InputQuantidade;
    private javax.swing.JButton inputEnviar;
    private javax.swing.JTextField inputNome;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField precoInput;
    private javax.swing.JLabel precoLabel;
    private javax.swing.JLabel preço;
    private javax.swing.JLabel quantidadeLabel;
    // End of variables declaration//GEN-END:variables
}