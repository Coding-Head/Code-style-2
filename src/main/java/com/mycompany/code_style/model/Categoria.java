package com.mycompany.code_style.model;

public class Categoria {
    private String nome;
    private String descricao;
    
    public Categoria() {
        
    }
    
    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getName(){
        return nome;
    }
    
    public void setDescription(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}
