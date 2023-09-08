/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer22;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de morangos (Kg): ");
        double qtdeMorango = scan.nextDouble();
        System.out.println("Entre com a quantidade de maças (Kg): ");
        double qtdeMaca = scan.nextDouble();
        
        double precoMorangoAte5 = 2.5;
        double precoMacaAte5 = 1.80;
        double precoMorangoAcima5 = 2.20;
        double precoMacaAcima5 = 1.50;
        double valorPagarMorangos = 0;
        double valorPagarMaca = 0;
      
        if (qtdeMorango <= 5) {
            valorPagarMorangos = (qtdeMorango*precoMorangoAte5);
          
        } else {
            valorPagarMorangos = (qtdeMorango*precoMorangoAcima5);
        }       
       
        if (qtdeMaca <= 5) {
            valorPagarMaca = (qtdeMaca*precoMacaAte5);
          
        } else {
            valorPagarMaca = (qtdeMaca*precoMacaAcima5);
        }       
        
        double qtdeTotal = qtdeMorango + qtdeMaca;
        double valorTotal = valorPagarMorangos + valorPagarMaca;
        double desconto = 0;
        
        if ((qtdeTotal >= 8) || (valorTotal > 25)) {
            desconto = 0.1;
            valorTotal = valorTotal-(valorTotal * desconto);
        }
        
        System.out.println("O valor a ser pago é de R$ "+valorTotal);
    }
}
