/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lista4.lista4;

/**
 *
 * @author higor
 */
public class Leao extends AnimalTerrestreAB {
    private int comidaIngerida;
    private int distanciaPercorrida;
    private int horasDormidas;

    public Leao(String nome, int idade, double altura, double peso) {
        super(nome, "Leão", idade, "Selva", 4, altura, peso);
        this.comidaIngerida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaIngerida += 20;
        System.out.println(nome + " está comendo. Comida ingerida: " + comidaIngerida + " quilos.");
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 15;
        System.out.println(nome + " está se movendo. Distância percorrida: " + distanciaPercorrida + " metros.");
    }

    @Override
    public void dormir() {
        horasDormidas += 10;
        System.out.println(nome + " está dormindo. Horas dormidas: " + horasDormidas + " horas.");
    }
}