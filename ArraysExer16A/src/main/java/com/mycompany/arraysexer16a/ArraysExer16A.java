/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysexer16a;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ArraysExer16A {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int[] vetorA = new int [10];
       
      
       
       for (int i = 0 ; i < vetorA[i] ; i++ ) {
           System.out.print ("Posição " + i +  " Entre com um número: ");
           vetorA[i] = scan.nextInt();                       
              
       }
       
       int somaMenor15 = 0;
       int igual15 = 0;
       double somaMaior15 = 0;
       double qtdMaior15 =0;
       double media;
       
       for (int i = 0 ; i < vetorA [i] ; i++ ) {
           if (vetorA[i] == 15 ) {
                  igual15 += vetorA[i];
           }else if (vetorA[i] <  15) {
                  igual15 += vetorA[i];                      
           }else {
                  somaMaior15 += vetorA[i];
                  qtdMaior15 ++;
           }
       }
        
      
      
    }
}
