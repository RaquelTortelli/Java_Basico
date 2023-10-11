/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysexerc03;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ArraysExerc03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int [15];
        int[] vetorB = new int [15];
          
        for (int i = 0; i < vetorA.length; i++ ) {
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i]*vetorA[i];
        }     
        
         System.out.print("Vetor A = " );
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B = " );
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }    
            
    }
}
