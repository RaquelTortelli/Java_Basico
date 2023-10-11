/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysexerc11;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ArraysExerc11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int [] vetorA = new int [10];
        
        int somapar = 0;
        
        for (int i = 0; i < vetorA.length; i++)  {
            System.out.print ("Posição " + i +  " Entre com um número: ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 == 0) {
                somapar++;
            }           
        }
        
        System.out.print("Vetor A = " );
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Você digitou " +somapar + " números pares. ");
        
    }
}
