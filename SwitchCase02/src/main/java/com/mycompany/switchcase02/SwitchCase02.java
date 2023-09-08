/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase02;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class SwitchCase02 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
        System.out.print("Entre com um número: ");
       int diaSemana = scan.nextInt();
       
        switch(diaSemana) {
            case 1: System.out.println("Domingo"); break; //funciona como quebra. como se fechasse parenteses
            case 2: System.out.println("Segunda");  break;  
            case 3: System.out.println("Terça");  break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta");break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Nao é um dia da semana válido.");
        }
       
       
        
        
    }
}
