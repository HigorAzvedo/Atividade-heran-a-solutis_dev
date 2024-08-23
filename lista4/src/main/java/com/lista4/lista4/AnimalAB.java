/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lista4.lista4;

/**
 *
 * @author higor
 */
public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected int quantidadePatas;
    protected double altura;
    protected double peso;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
        this.altura = altura;
        this.peso = peso;
    }

    public abstract void comer();
    public abstract void moverse();
    public abstract void dormir();
}
