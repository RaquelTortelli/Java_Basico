/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor14;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor14 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
       int qtdepares = 0;
       int qtdeimpar = 0;
       
       for (int i = 0; i < 10 ; i++) {
           
           System.out.println("Digite um número inteiro: ");
           int num = scan.nextInt();
           
           if (num % 2 == 0) {
               qtdepares++;
               
           } else {
               qtdeimpar++;
           }
       }
        System.out.println("A quantidade de pares digitados foi de: " +qtdepares);
        System.out.println("A quantidade de ímpares digitados foi de: " +qtdeimpar);
    }
}
