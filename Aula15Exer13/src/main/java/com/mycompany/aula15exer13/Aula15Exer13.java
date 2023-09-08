/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer13;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer13 {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
        System.out.println("Entre com um número (1 - 7): ");
        int diaSemana = scan.nextInt();
        switch(diaSemana) {
            case 1: 
                System.out.println("Domingo"); 
                break;
            case 2: 
                System.out.println("Sábado");
                break;
            case 3: 
                System.out.println("Segunda");
                break;
            case 4: 
                System.out.println("Terça");
                break;
            case 5: 
                System.out.println("Quarta");
                break;
            case 6: 
                System.out.println("Quinta");
                break;
            case 7: 
                System.out.println("Sexta"); 
                break;
            default: 
                System.out.println("Não é um dia da semana válido");
                  
         
       
        }
       
        
     
     
        
        
    }
}
