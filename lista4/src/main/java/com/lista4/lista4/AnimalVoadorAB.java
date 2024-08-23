/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lista4.lista4;

/**
 *
 * @author higor
 */
public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAssas;
    protected double envergaduraAssa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadeAssas, double envergaduraAssa, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, 2, altura, peso);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
    }

    public abstract void voar();
}
