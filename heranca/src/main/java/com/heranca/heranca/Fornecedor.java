/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.heranca.heranca;

/**
 *
 * @author higor
 */
public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    // Construtor padrão
    public Fornecedor() {
        super();
    }

    // Construtor com todos os atributos
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    // Getters e Setters
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    // Método para obter saldo
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
}
