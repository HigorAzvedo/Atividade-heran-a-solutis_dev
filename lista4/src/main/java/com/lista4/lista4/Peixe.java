/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lista4.lista4;

/**
 *
 * @author higor
 */
public class Peixe extends AnimalMarinhoAB {
    private int comidaIngerida;
    private int distanciaNadada;
    private int horasDormidas;

    public Peixe(String nome, int idade, double altura, double peso) {
        super(nome, "Peixe", idade, "Aquático", altura, peso);
        this.comidaIngerida = 0;
        this.distanciaNadada = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaIngerida += 1;
        System.out.println(nome + " está comendo. Comida ingerida: " + comidaIngerida);
    }

    @Override
    public void moverse() {
        nadar();  // Chama o método nadar ao invés de se mover de forma genérica
    }

    @Override
    public void dormir() {
        horasDormidas += 2;
        System.out.println(nome + " está dormindo. Horas dormidas: " + horasDormidas + " horas.");
    }

    @Override
    public void nadar() {
        distanciaNadada += 20;
        System.out.println(nome + " está nadando. Distância nadada: " + distanciaNadada + " metros.");
    }
}