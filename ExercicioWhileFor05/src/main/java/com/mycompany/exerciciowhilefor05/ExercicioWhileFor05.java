/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor05;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double popA;
        double popB;
        double taxaA;
        double taxaB;
                
        boolean valido = false;
        
        do {
            System.out.println("Entre com a População A: ");
            popA = scan.nextDouble();
            
            if (popA > 0) {
                valido = true;                
            } else {
                System.out.println("População A precisa ser maior que zero. ");
            }                    
                    
        } while (!valido);
        
      
       valido = false;
        
        do {
            System.out.println("Entre com a População B: ");
            popB = scan.nextDouble();
            
            if (popB > 0) {
                valido = true;                
            } else {
                System.out.println("População B  precisa ser maior que zero. ");
            }                    
                    
        } while (!valido);
        
       valido = false;
       
       do {
            System.out.println("Entre com a taxa de crescimento da População A: ");
            taxaA = scan.nextDouble();
            
            if (taxaA > 0) {
                valido = true;                
            } else {
                System.out.println("A taxa de crescimento precisa ser maior que zero. ");
            }                    
                    
        } while (!valido);
        
        valido = false;      
        
        do {
            System.out.println("Entre com a taxa de crescimento da População B: ");
            taxaB = scan.nextDouble();
            
            if (taxaB > 0) {
                valido = true;                
            } else {
                System.out.println("A taxa de crescimento precisa ser maior que zero. ");
            }                    
                    
        } while (!valido);
        
       
        int cont = 0;
               
        while (popA <= popB) {
           popA += (popA/100) * taxaA;
           popB += (popB/100) * taxaB;
        cont++;
        }
                            
        System.out.println("População A: " +popA);
        System.out.println("População B: " +popB);
        System.out.println("Qtd anos: " + cont);
        
        
    }
}
