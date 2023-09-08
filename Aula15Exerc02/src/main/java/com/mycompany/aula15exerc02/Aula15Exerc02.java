/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exerc02;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exerc02 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         //Leitura de dados
         System.out.println("Entre com um valor: ");
         double valor = scan.nextDouble();
         
         //Resolução do problema e divulgação dados
         if (valor >= 0) {
             System.out.println("O valor " + valor + " informado é positivo.");
                                
         }else{
             System.out.println("O valor " + valor + " informado é negativo " );
         }
         
    }
}
