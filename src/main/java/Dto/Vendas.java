/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nobre
 */
public class Vendas {
    
    private long id;
    private ClienteDto cliente;
    private LoginDto login;
    private double totalDaVenda;
    private double valorPago;
    private double desconto;
    private double troco;
    private LocalDateTime dataHora;
    private LocalDateTime ultimaAtualizacao;

    public Vendas() {
    }

    public Vendas(long id, ClienteDto cliente, LoginDto login, double totalDaVenda, double valorPago, double desconto, double troco, LocalDateTime dataHora, LocalDateTime ultimaAtualizacao) {
        this.id = id;
        this.cliente = cliente;
        this.login = login;
        this.totalDaVenda = totalDaVenda;
        this.valorPago = valorPago;
        this.desconto = desconto;
        this.troco = troco;
        this.dataHora = dataHora;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ClienteDto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }

    public LoginDto getLogin() {
        return login;
    }

    public void setLogin(LoginDto login) {
        this.login = login;
    }

    public double getTotalDaVenda() {
        return totalDaVenda;
    }

    public void setTotalDaVenda(double totalDaVenda) {
        this.totalDaVenda = totalDaVenda;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    
    
    
    
    
    
}
    