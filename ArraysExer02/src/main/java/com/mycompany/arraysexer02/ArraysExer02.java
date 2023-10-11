/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysexer02;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ArraysExer02 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int [8];
        int[] vetorB = new int [8];
        
        for (int i = 0; i < vetorA.length; i++ ) {
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i]*2;
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
