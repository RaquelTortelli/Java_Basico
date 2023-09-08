/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer15;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer15 {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
        System.out.println("Entre com o lado 1: ");
        int lado1 = scan.nextInt();
        System.out.println("Entre com o lado 2: ");
        int lado2 = scan.nextInt();
        System.out.println("Entre com o lado 3: ");
        int lado3 = scan.nextInt();
        
        if ((((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2+lado3) > lado1))) {
            
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
            }else if (lado1==lado2 || lado1==lado3 || lado2==lado3){
                System.out.println("Triângulo Isósceles");
            }else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Triângulo Escalenno");
            }
            
            
       }else { 
            System.out.println("Não forma um triângulo");
        }
        
        
    }
}
