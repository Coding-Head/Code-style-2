/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.code_style.dto;

public class ClienteDto {

    private String nome;
    private String cpf;
    private String endereco;
    private String sexo;
    private String email;
    private String senha;

    public ClienteDto() {
        
    }
    
    public ClienteDto(String nome, String cpf, String endereco, String sexo, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
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
    public void setName(String name) {
        this.nome = name;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the address
     */
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the gender
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the gender to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the password to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
