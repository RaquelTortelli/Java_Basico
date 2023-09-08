/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer06;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Leitura de dados
        System.out.println("Entre com o primeiro número: ");
        double n1 = scan.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double n2 = scan.nextDouble();
        System.out.println("Entre com o terceiro número");
        double n3 = scan.nextDouble();
        
        
        //Resolução
        if (n1 >= n2  && n1 >= n3) {
            System.out.println("Maior número " + n1);
            
        } else if (n2 >= n1 && n2>= n3) {
           System.out.println("Maior número " + n2);
        }else 
            System.out.println("Maior número " + n3);
           
        
        //Resolução Leo
        
        
    }
}
