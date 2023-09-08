/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer01;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Leitura de dados
        System.out.println("Entre com um número inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo número: ");
        int num2 = scan.nextInt();
        
        //Cálculo
        if (num1 > num2) {
            System.out.println("O maior número é " +num1);
            
            
        }else  {
            System.out.println("O maior número é " +num2);
            
        }
             
             
        
        
    }
}
