/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor05;

import java.util.Arrays;

/**
 *
 * @author leona
 */
public class Vetor05 {

    public static void main(String[] args) {
       int vet [] = {3,7,6,1,9,4,2};
       for (int v:vet){
           System.out.print(v + " ");
       }
        System.out.println("");
       int p = Arrays.binarySearch(vet, 8); // numero que quero encontrar
        System.out.println("Encontrei o valor na posição " + p);
        
        
        
    }
}
