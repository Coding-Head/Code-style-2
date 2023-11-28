/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Venda {
    
    private int id;
    private double TotalDaVenda;
    private int ClientId;
    private int ProdutoID;
    
    public Venda(){
}
    public Venda(double TotalDaVenda, int clientId, int produtoId){
        this.TotalDaVenda = TotalDaVenda;
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

    public double getTotalDaVenda() {
        return TotalDaVenda;
    }

    public void setTotalDaVenda(double TotalDaVenda) {
        this.TotalDaVenda = TotalDaVenda;
    }  
}
