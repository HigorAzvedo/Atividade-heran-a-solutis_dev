/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.heranca.heranca;

/**
 *
 * @author higor
 */
public class Heranca {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Empresa XYZ", "Rua A, 123", "1111-2222", 50000, 20000);
        System.out.println("Saldo do Fornecedor: " + fornecedor.obterSaldo());

       
        Empregado empregado = new Empregado("João", "Rua B, 456", "3333-4444", 1, 3000, 10);
        System.out.println("Salário do Empregado: " + empregado.calcularSalario());

        
        Administrador administrador = new Administrador("Maria", "Rua C, 789", "5555-6666", 2, 5000, 15, 1000);
        System.out.println("Salário do Administrador: " + administrador.calcularSalario());

        Operario operario = new Operario("Carlos", "Rua D, 101", "7777-8888", 3, 2000, 5, 15000, 2);
        System.out.println("Salário do Operário: " + operario.calcularSalario());

        Vendedor vendedor = new Vendedor("Ana", "Rua E, 202", "9999-0000", 4, 2500, 7, 20000, 5);
        System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());
    }
}
