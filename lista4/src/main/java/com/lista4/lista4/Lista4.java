/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lista4.lista4;

/**
 *
 * @author higor
 */
public class Lista4 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Nick", 5, 0.5, 20.0);
        cachorro.comer();
        cachorro.moverse();
        cachorro.dormir();

        Gato gato = new Gato("Miau", 3, 0.3, 5.0);
        gato.comer();
        gato.moverse();
        gato.dormir();

        Elefante elefante = new Elefante("Dumbo", 10, 3.0, 5000.0);
        elefante.comer();
        elefante.moverse();
        elefante.dormir();
        
        Leao leao = new Leao("Simba", 8, 1.2, 190.0);
        leao.comer();
        leao.moverse();
        leao.dormir();

        Peixe peixe = new Peixe("Nemo", 2, 0.1, 0.5);
        peixe.comer();
        peixe.moverse();
        peixe.dormir();

    }
}
