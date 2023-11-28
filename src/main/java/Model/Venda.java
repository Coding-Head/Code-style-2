/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Venda {
    
    private int id;
    private int quantidade;
    private int ClientId;
    private int ProdutoID;
    
    public Venda(){
}
    public Venda(int quantidade, int clientId, int produtoId){
        this.quantidade = quantidade;
        this.ClientId = clientId;
        this.ProdutoID = produtoId;
    }
    
    public int getClientId() {
        return ClientId;
    }

     public void setClientId(int produtoID) {
        this.ProdutoID = produtoID;
    }
    
    public int getProdutoId() {
        return ProdutoID;
    }
     
    public void setProdutoId(int produtoID) {
        this.ProdutoID = produtoID;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int IdVenda) {
        this.id = IdVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }  
    
    
    @Override
    public String toString() {
       return "Venda de produto{" + "Quantidade=" + this.quantidade + ", Preço=" + this.ClientId + "Quantidade="+ this.ProdutoID + '}';
    }
}
