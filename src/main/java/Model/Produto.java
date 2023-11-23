/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author gusta
 */
public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;
    
    public Produto() {
        
    }
    
    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /**
     * @return the name
     */
    public String getName() {
        return nome;
    }

    /**
     * @param name the name to set
     */
    public void setName(String nome) {
        this.nome = nome;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return preco;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double preco) {
        this.preco = preco;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantidade;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
       return "Cadastro de produto{" + "Nome=" + this.nome + ", Preço=" + this.preco + "Quantidade="+ this.quantidade + '}';
    }

}
