package com.mycompany.code_style;

import Dao.ProdutoDao;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import Model.Produto;
import javax.swing.JOptionPane;

public class TelaProdutos extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Produtos
     */
    private ProdutoDao produtoDao = new ProdutoDao();
    
    public TelaProdutos() {
        initComponents();
        CadastroColors();
        consultarProduto();
    }

    private void CadastroColors() {

        // Defina a cor de fundo do JFrame
        this.getContentPane().setBackground(new java.awt.Color(173, 216, 230)); // azul
        // Defina a cor de fundo de alguns componentes
        inputPesquisar.setBackground(new java.awt.Color(255, 255, 255)); // branco
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255)); // branco
        ProdutosLista.setBackground(new java.awt.Color(255, 255, 255)); // branco    

        //Crie uma borda com uma cor preta
        Border border = BorderFactory.createLineBorder(new java.awt.Color(70, 70, 70));
        // Aplique a borda aos componentes desejados

        inputPesquisar.setBorder(border);
        jScrollPane1.setBorder(border);
        ProdutosLista.setBorder(border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ProdutosLista = new javax.swing.JTable();
        inputPesquisar = new javax.swing.JTextField();
        PesquisarButton = new javax.swing.JButton();
        Adicionar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        ButtonPesquisarSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setBackground(new java.awt.Color(153, 255, 255));

        ProdutosLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "PRICE", "QUANTIDADE"
            }
        ));
        jScrollPane1.setViewportView(ProdutosLista);

        inputPesquisar.setText("Pesquisar...");
        inputPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPesquisarActionPerformed(evt);
            }
        });

        PesquisarButton.setText("Pesquisar");
        PesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesquisar(evt);
            }
        });

        Adicionar.setText("Adicionar");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adicionar(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update(evt);
            }
        });

        ButtonPesquisarSearch.setText("🔎");
        ButtonPesquisarSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarSearch(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputPesquisar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PesquisarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(ButtonPesquisarSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesquisarSearch))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PesquisarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pesquisar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesquisar
        consultarProduto();
    }//GEN-LAST:event_Pesquisar

    private void Adicionar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adicionar
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.setVisible(true);
        Update.setEnabled(false);
        Excluir.setEnabled(false);
    }//GEN-LAST:event_Adicionar

    private void Update(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update
        EditarProduto editarProduto = new EditarProduto();
        editarProduto.setVisible(true);
        Adicionar.setEnabled(false);
        Excluir.setEnabled(false);
    }//GEN-LAST:event_Update

    private void Excluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir
        int linhaSelecionada = ProdutosLista.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) ProdutosLista.getModel();
        int idExcluir = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
        produtoDao.excluir(idExcluir);
        JOptionPane.showMessageDialog(rootPane, "Sucesso");
    }//GEN-LAST:event_Excluir

    private void ButtonPesquisarSearch(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarSearch
        String nome = inputPesquisar.getText();
        Search(nome);
    }//GEN-LAST:event_ButtonPesquisarSearch

    private void inputPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPesquisarActionPerformed

    private void consultarProduto() {
        ProdutoDao produtoDao = new ProdutoDao();
        List<Produto> produtos = produtoDao.buscarTodos();

        // Limpar dados da tabela
        DefaultTableModel model = (DefaultTableModel) ProdutosLista.getModel();
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
        DefaultTableModel model = (DefaultTableModel) ProdutosLista.getModel();
        model.setRowCount(0);

        for (Produto produto : produtos) {
            model.addRow(new Object[]{
                produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade()
            });
        }
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Adicionar;
    private javax.swing.JButton ButtonPesquisarSearch;
    public javax.swing.JButton Excluir;
    private javax.swing.JButton PesquisarButton;
    private javax.swing.JTable ProdutosLista;
    public javax.swing.JButton Update;
    private javax.swing.JTextField inputPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

//