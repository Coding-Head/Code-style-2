/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
public class Venda {
    
    private int IdVenda;
    private double TotalDaVenda;
    private double QtdVendida;
    private String MtdPagamento;
    private String EstadoVenda;
    
    public Venda(){
}
    public Venda(int IdVenda,double TotalDaVenda, double QtdVendida, String MtdPagamento,String EstadoVenda){
        this.TotalDaVenda = TotalDaVenda;
        this.QtdVendida = QtdVendida;
        this.MtdPagamento = MtdPagamento;
        this.EstadoVenda = EstadoVenda;
    }

    public int getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }

    public double getTotalDaVenda() {
        return TotalDaVenda;
    }

    public void setTotalDaVenda(double TotalDaVenda) {
        this.TotalDaVenda = TotalDaVenda;
    }

    public double getQtdVendida() {
        return QtdVendida;
    }

    public void setQtdVendida(double QtdVendida) {
        this.QtdVendida = QtdVendida;
    }

    public String getMtdPagamento() {
        return MtdPagamento;
    }

    public void setMtdPagamento(String MtdPagamento) {
        this.MtdPagamento = MtdPagamento;
    }

    public String getEstadoVenda() {
        return EstadoVenda;
    }

    public void setEstadoVenda(String EstadoVenda) {
        this.EstadoVenda = EstadoVenda;
    }
    
}
