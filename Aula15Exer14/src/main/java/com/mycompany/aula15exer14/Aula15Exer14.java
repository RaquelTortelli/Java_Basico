/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer14;

import static java.time.Clock.system;
import static java.time.Instant.now;
import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer14 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
        //Leitura de dados
        System.out.println("Entre com a primeira nota : ");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();
        
        //Resolução
        double media = (nota1 + nota2)/2;
        
        String aproveitamento = "";
        if(media >= 9 && media < 10) {
            aproveitamento = "A";
        }else if (media >= 7.5 && media < 9) {
            aproveitamento = "B";
        }else if (media >= 6 && media < 7.5) {
            aproveitamento = "C";
        }else if (media >= 4 && media < 6)  {
            aproveitamento = "D";
            
        }else if (media >= 0 && media < 4) {
            aproveitamento = "E";
            
        }
                    
        
      
        System.out.println("Primeira nota: " +nota1);
        System.out.println("Segunda nota: " +nota2);
        System.out.println("Média: " +media);
        System.out.println("Conceito: " +aproveitamento);
                     
        switch(aproveitamento) {
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO");
                break;
            case "D":
            case "E":
                System.out.println("REPROVADO");
                
    }
      
    }
}
