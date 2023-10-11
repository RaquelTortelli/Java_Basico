/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor12;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor12 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        
        int num;
        int result;
        
        System.out.println("Digite um número de um a 10: ");
        num = scan.nextInt();
        System.out.println("Taboada do " +num);
                
         for (int cont = 1; cont <= 10 ; cont++) {
            result = num * cont;
            System.out.println(+ num + " x " + cont + " = " + result );
        }
        
        
    }
}
