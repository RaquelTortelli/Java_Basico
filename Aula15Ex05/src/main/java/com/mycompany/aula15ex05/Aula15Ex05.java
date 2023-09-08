/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15ex05;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Ex05 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    
    //Leitura de dados
        System.out.println("Entre com a primeira nota: ");
        double n1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double n2 = scan.nextDouble();
        
    //Resolucão
    double media = (n1 + n2)/2;
     
    if (media >= 7)  {
        if (media == 10) {
            System.out.println("APROVADO COM DISTINÇÃO");
        }
        else {
            System.out.println("APROVADO");
        }  
    }else if (media < 7) {
        System.out.println("REPROVADO");
        
           
    }
   
    
    
    
        
        
        
    }
}
