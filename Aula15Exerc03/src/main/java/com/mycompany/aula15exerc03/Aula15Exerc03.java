/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exerc03;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exerc03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com uma letra (F ou M): ");
        
        String input = scan.next();
        
        /* se fizer isso
        if (input == "f" {
            System.out.ptint("F - feminino")
        {else if (input == "m"){
           System.out.ptint("M - masculino")
        }else {
           System.out.ptint("sexo invalido")
                
         Não FUNCIONA, String é uma classe em Java e qdo cria 
        string cria objeto. Com objeto nao utilizamos operador de igualdade
        */
        
        if (input.equalsIgnoreCase("f")) {
            System.out.println("F - Feminino");
            
       }else if (letra.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
       }else {
            System.out.println("Sexo Inválido");
       }
        
        
    }
}
