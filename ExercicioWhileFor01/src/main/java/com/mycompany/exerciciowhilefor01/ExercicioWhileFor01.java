/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor01;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor01 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
              
       boolean notaValida = false;
        
        
       do { 
            System.out.println("Entre com uma nota (0 - 10) : ");
            double nota = scan.nextDouble();
            
            if (nota >= 0 && nota <= 10) {
            notaValida = true;
            System.out.println("Você digitou a nota: " + nota);
            } else {
            notaValida = false;
            System.out.println("Nota inválida, digite novamente.");
            }   
                
       } while (!notaValida);                      
     
        
    }
}
