/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.code_style;

import Dao.ProdutoDao;
import Dao.VendaDao;
import Model.Produto;
import Model.Venda;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author gusta
 */
public class TelaDeCompra extends javax.swing.JFrame {

    private VendaDao vendaDao = new VendaDao();
    private ProdutoDao produtoDao = new ProdutoDao();
    
    /**
     * Creates new form TelaDeCompra
     */
    public TelaDeCompra() {
        initComponents();
        CadastroColors();
        consultarProduto();
    }

    private void CadastroColors() {

        // Defina a cor de fundo do JFrame
        this.getContentPane().setBackground(new java.awt.Color(173, 216, 230)); // azul
        // Defina a cor de fundo de alguns componentes
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255)); // branco
        fielPesquisar.setBackground(new java.awt.Color(255, 255, 255)); // branco
        qntInput.setBackground(new java.awt.Color(255, 255, 255)); // branco
        tblDeCompra.setBackground(new java.awt.Color(173, 216, 230)); // azul
        btnConfirmar.setBackground(new java.awt.Color(143, 192, 220)); // Azul medio-claro
        
        //Crie uma borda com uma cor preta
        Border border = BorderFactory.createLineBorder(new java.awt.Color(70, 70, 70));
        // Aplique a borda aos componentes desejados
       
        jScrollPane1.setBorder(border);
        fielPesquisar.setBorder(border);
        btnConfirmar.setBorder(border);
        qntInput.setBorder(border);
        tblDeCompra.setBorder(border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fielPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeCompra = new javax.swing.JTable();
        qntInput = new javax.swing.JSpinner();
        btnConfirmar = new javax.swing.JButton();
        ButtonPesquisar = new javax.swing.JButton();
        codProdutoInput = new javax.swing.JTextField();
        codClienteInput = new javax.swing.JTextField();
        CodProdutoLabel = new javax.swing.JLabel();
        QuantidadeLabel = new javax.swing.JLabel();
        codClienteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compra");

        fielPesquisar.setText("Pesquisar");

        tblDeCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "PREÇO", "QUANTIDADE"
            }
        ));
        tblDeCompra.setToolTipText("");
        tblDeCompra.setShowGrid(true);
        tblDeCompra.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tblDeCompra);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar(evt);
            }
        });

        ButtonPesquisar.setText("🔎");
        ButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarActionPerformed(evt);
            }
        });

        CodProdutoLabel.setText("Cod. Produto");

        QuantidadeLabel.setText("Quantidade");

        codClienteLabel.setText("Cod.Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fielPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codProdutoInput)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CodProdutoLabel)
                                .addGap(0, 70, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codClienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codClienteLabel))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuantidadeLabel)
                            .addComponent(qntInput, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fielPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodProdutoLabel)
                    .addComponent(QuantidadeLabel)
                    .addComponent(codClienteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qntInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codProdutoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codClienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar
        adicioanrProduto();
    }//GEN-LAST:event_btnConfirmar

    private void ButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarActionPerformed
        String nome = fielPesquisar.getText();
        Search(nome);
    }//GEN-LAST:event_ButtonPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCompra().setVisible(true);
            }
        });
    }
    
    private void adicioanrProduto(){
       
        int quantidade = (Integer) qntInput.getValue();
        int codClienteId = Integer.parseInt(codClienteInput.getText());
        int codProdId =  Integer.parseInt(codProdutoInput.getText());
        
        
        int quantidadeDisponivel = produtoDao.obterQuantidade(codProdId);
        if (quantidade > quantidadeDisponivel){ 
            JOptionPane.showMessageDialog(null, "quantidade cadastrado é invalido");
            return;
        }  
        
        if (isVendaValid(codClienteId)) {
            JOptionPane.showMessageDialog(null, "codClienteId cadastrado é invalido");
            return;
        }
        
        if (isVendaValid(codProdId)) {
            JOptionPane.showMessageDialog(null, "codProdId cadastrada é invalida");
            return;
        }
        
        Venda venda = new Venda(
                quantidade,
                codClienteId,
                codProdId
        );
        
        JOptionPane.showConfirmDialog(null, venda.toString());
        
        vendaDao.inserirVenda(venda);
    }
   
    boolean isVendaValid(int value) {
        return value < 0;
    }
    
    private void consultarProduto() {
        List<Produto> produtos = produtoDao.buscarTodos();

        // Limpar dados da tabela
        DefaultTableModel model = (DefaultTableModel) tblDeCompra.getModel();
        model.setRowCount(0);

        // Preencher a tabela com os resultados
        for (Produto produto : produtos) {
            model.addRow(new Object[]{
                produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade()
            });
        }
    }
    
    private void Search(String pesquisa) {
        ProdutoDao produtoDao = new ProdutoDao();
        List<Produto> produtos = produtoDao.search(pesquisa);

        // Limpar dados da tabela
        DefaultTableModel model = (DefaultTableModel) tblDeCompra.getModel();
        model.setRowCount(0);

        for (Produto produto : produtos) {
            model.addRow(new Object[]{
                produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPesquisar;
    private javax.swing.JLabel CodProdutoLabel;
    private javax.swing.JLabel QuantidadeLabel;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTextField codClienteInput;
    private javax.swing.JLabel codClienteLabel;
    private javax.swing.JTextField codProdutoInput;
    private javax.swing.JTextField fielPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner qntInput;
    private javax.swing.JTable tblDeCompra;
    // End of variables declaration//GEN-END:variables
}
