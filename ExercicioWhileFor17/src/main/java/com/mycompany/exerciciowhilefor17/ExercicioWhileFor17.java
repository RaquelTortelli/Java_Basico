/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor17;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número: ");
        int num = scan.nextInt();
        
        System.out.println(num + "! = ");
        
        int fatorial = 1;
        for (int i = num; i > 0 ; i --) {
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado: " +fatorial);
    }
    
}
