/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysexer16b;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ArraysExer16B {

    public static void main(String[] args) {
   
       Scanner scan = new Scanner(System.in);
       
       int[] vetorA = new int [5];
           
       
       for (int i = 0 ; i < vetorA.length ; i++ ) {
           System.out.print ("Posição " + i +  " Entre com um número: ");
           vetorA[i] = scan.nextInt();                       
              
       }
        
       int somaMenor15 = 0;
       int igual15 = 0;
       int somaMaior15 = 0;
       int qtdMaior15 =0;
       double media;
       
       for (int i = 0 ; i < vetorA.length ; i++ ) {
           if (vetorA[i] == 15 ) {
                  igual15 ++;
           }else if (vetorA[i] <  15) {
                  somaMenor15 += vetorA[i];                      
           }else {
                 qtdMaior15 ++;
                 somaMaior15 += vetorA[i];
           }  
       }  
       
        System.out.print("Vetor A = ");
        for (int i=0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        
        System.out.println("Qtd números == 15: " + igual15);
        System.out.println("Soma números < 15: " + somaMenor15);
        System.out.println("Soma número > 15:  " + somaMaior15);
        System.out.println("Média números > 15: " + somaMaior15/qtdMaior15);
    }
}
