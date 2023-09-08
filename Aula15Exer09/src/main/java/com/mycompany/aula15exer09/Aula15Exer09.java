/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer09;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer09 {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        
        //Leitura de dados
        System.out.print("Entre com o primeiro número:  ");
        double num1 = scan.nextDouble();
        System.out.print("Entre com o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.print("Entre com o terceiro número: ");
        double num3 = scan.nextDouble();
        
        //resolução
        
                    
        if (num1 <= num2  && num1 <= num3 && num2 <= num3) {
            //num1 é menor
            // num 3 é maior
            //num1 < num2 < num3
            System.out.println(num3 + " - " + num2 + " - " + num1);
            
        } else if (num2 <= num1 && num2<= num3 && num1 <= num3) {
            //num2 é menor
            //num3 é maior
            // num2 < num1 < num3
           System.out.println(num3 + " - " + num1 + " - " + num2);
        }else if (num3 <= num1 && num3<= num2 && num1 <= num2) {
           //num3 é menor
           //num2 é maior
           // num3 < num1 < num2
           System.out.println(num2 + " - " + num1 + " - " + num3);
           
        }else if (num3 <= num1 && num3<= num2 && num1 >= num2)  {
            //num3 é menor
            //num1 é maior
            //num3 < num2 < num1
           System.out.println(num1 + " - " + num2 + " - " + num3); 
        }else if (num2 <= num1 && num2<= num3 && num1 >= num3)  {
            //num2 é menor
            //num1 é maior
            //num2 < num3 < num1
            System.out.println(num1 + " - " + num3 + " - " + num2); 
            
        }else if (num1 <= num2 && num1 <= num3 && num2 >= num3)  {
            //num1 é menor
            //num2 é maior
            //num1<num3<num2
            System.out.println(num2 + " - " + num3 + " - " + num1); 
        }
        
                     
        
      
     
        
    }
}
