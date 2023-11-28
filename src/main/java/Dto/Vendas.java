/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nobre
 */
public class Vendas {
    
    private List<ItemVenda> itens;
    
    public Vendas() {
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(String produto, double precoUnitario, int quantidade) {
        ItemVenda item = new ItemVenda(produto, precoUnitario, quantidade);
        itens.add(item);
    }
    
    public double calcularTotal() {
        double total = 0.0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
    
    public void exibirRecibo() {
        System.out.println("==== Recibo da Venda ====");
        for (ItemVenda item : itens) {
            System.out.println(item);
        }
        System.out.println("=========================");
        System.out.println("Total: R$" + calcularTotal());
    }
    
    public static void main(String[] args) {
        Vendas venda = new Vendas();
        
        venda.adicionarItem("Produto A", 10.0, 2);
        venda.adicionarItem("Produto B", 15.0, 1);
        venda.adicionarItem("Produto C", 8.0, 3);
        
        venda.exibirRecibo();
    }
}

class ItemVenda {
    private String produto;
    private double preco;
    private int quantidade;
    
    public ItemVenda(String produto, double preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public double calcularSubtotal() {
        return preco * quantidade;
    }
    
    @Override
    public String toString() {
        return String.format("%s - R$%.2f x %d = R$%.2f", produto, preco, quantidade, calcularSubtotal());
    }
    
}
