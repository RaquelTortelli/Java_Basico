/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor08;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor08 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);  
        
        int num;
        double soma = 0;
        double media = 0; 
        for (int i = 0; i < 5; i++ ) {
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            soma += num;                   
              
        }
        
        media = soma/5;
        System.out.println("A soma dos números digitados foi de: " +soma);
        System.out.println("A média dos números digitados foi de: " +media);
       
        
    }
        
    }

