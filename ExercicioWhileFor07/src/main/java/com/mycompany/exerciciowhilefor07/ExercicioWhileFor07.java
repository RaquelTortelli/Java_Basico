/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor07;

import static java.time.Instant.now;
import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor07 {

    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);  
         
         int num;
         int maior = Integer.MIN_VALUE;
         
         for (int i = 0; i < 5 ; i++) {
             System.out.println("Digite um número(int): ");
             num = scan.nextInt();
             
             if (num > maior) {
                 maior = num;
                 
             }
         } 
       
         System.out.println("O maior numero digitado foi " + maior);
    }
}
