/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer08;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Leitura de dados
        System.out.print("Entre com o preço do primeiro produto R$:  ");
        double preco1 = scan.nextDouble();
        System.out.print("Entre com o preço do segundo produto R$: ");
        double preco2 = scan.nextDouble();
        System.out.print("Entre com o preço do terceiro produto R$: ");
        double preco3 = scan.nextDouble();
        
        //Resolução
        if (preco1 <= preco2 && preco1 <= preco3) {
            System.out.println("Você deve comprar o primeiro produto de valor R$" +preco1);
        
        }else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("Você deve comprar o segundo produto de valor R$" +preco2);
        }else {
            System.out.println("Você deve comprar o terceiro produto de valor R$" +preco3);
        }
    }
}
