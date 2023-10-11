/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysexerc12;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ArraysExerc12 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        int [] vetorA = new int [5];
        
        int soma = 0;
        
        for (int i = 0; i < vetorA.length; i++)  {
            System.out.print ("Posição " + i +  " Entre com um número: ");
            vetorA[i] = scan.nextInt();                   
            soma += vetorA[i];
        }           
        
        
        System.out.print("Vetor A = " );
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        System.out.println(" A soma dos números digitados foi de  " + soma);
        
        
        
        
    }
}
