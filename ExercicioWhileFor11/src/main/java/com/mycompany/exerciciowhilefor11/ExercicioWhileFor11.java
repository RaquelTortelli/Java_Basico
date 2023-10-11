/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor11;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor11 {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        
        int num1;
        int num2;
        boolean valido = false;
       
        do {
            System.out.println("Digite um número inteiro: ");
            num1 = scan.nextInt();
            if (num1 > 0) {
                valido = true;
            } else {
                System.out.println("Número inválido. Digite um número válido.");
            }
        } while (!valido);
        
        valido = false;
                
        do {
            System.out.println("Digite outro número inteiro: ");
            num2 = scan.nextInt();
            if (num2 > 0) { // entender como identifica numero com virgula50
                valido = true;
            } else {
                System.out.println("Número inválido. Digite um número válido.");
            }
        } while (!valido);
        
       int soma = 0; 
       if (num1 < num2) {
           
           for (int i = num1 + 1 ; i <  num2 ; i++ ) {
               soma += i;
               System.out.println(i); 
           }
       } else {   
            for (int i = num2 + 1; i < num1; i++)   {
                soma += i; 
                System.out.println(i);   
            }
              
       }
       System.out.println("A soma do intervalo dos números é de " +soma);
    }
}
