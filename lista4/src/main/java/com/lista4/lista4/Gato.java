/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lista4.lista4;

/**
 *
 * @author higor
 */
public class Gato extends AnimalTerrestreAB {
    private int comidaIngerida;
    private int distanciaPercorrida;
    private int horasDormidas;

    public Gato(String nome, int idade, double altura, double peso) {
        super(nome, "Gato", idade, "Doméstico", 4, altura, peso);
        this.comidaIngerida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaIngerida += 1;
        System.out.println(nome + " está comendo. Comida ingerida: " + comidaIngerida);
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 5;
        System.out.println(nome + " está se movendo. Distância percorrida: " + distanciaPercorrida + " metros.");
    }

    @Override
    public void dormir() {
        horasDormidas += 12;
        System.out.println(nome + " está dormindo. Horas dormidas: " + horasDormidas + " horas.");
    }
}
