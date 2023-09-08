/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer04;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer04 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        //Leitura de dados
        System.out.println("Entre com uma letra");
        
        //Verificação de dados
        
        String letra = scan.next();
        
        /*
        if (letra.equalsIgnoreCase ("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.print("Letra informada é VOGAL");
            
                    
        }else {
            System.out.println("Letra informada é CONSOANTE");
            
        }*/
      
        //outra forma de resolver, aqui utiliza o Equals não o equalsignorecase
      if(letra.length() > 1){
          System.out.println("Não é uma letra válida");
    } else {
         switch(letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": 
            case "A":
            case "E":
            case "I":
            case "O":
            case "U": System.out.println("Vogal"); break;
            default: System.out.println("Consoante");
                      
              }
       
            
        }
     
        
        
    }
}
