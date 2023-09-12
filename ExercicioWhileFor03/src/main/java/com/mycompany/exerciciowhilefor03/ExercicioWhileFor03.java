/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor03;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);    
        
        String nomeUser;
        String estadoCivil;
        double idade;
        double salario;
        String sexo;
        boolean nomeUserValido = false;
        boolean idadeValida = false;
        boolean salarioValido = false;
        boolean sexoValido = false;
        boolean estadoCivilValido = false;
        
     do {   
         System.out.println("Digite seu nome ");
         nomeUser = scan.next();
         
         if (nomeUser.length() > 3) {
             nomeUserValido = true;
         } else {
             nomeUserValido = false;
             System.out.println("Nome precisa de no mínimo 3 caracteres.");
        }
     } while (!nomeUserValido);
     
     do {
         System.out.println("Digite sua idade: ");
         idade = scan.nextDouble();
        
         if (idade >= 0 && idade <= 150) {
            idadeValida = true;           
         } else { 
            idadeValida = false;
            System.out.println("Idade inválida, tente novamente");
        }
     } while (!idadeValida);    
     
    do {
        System.out.println("Salário R$: ");
        salario = scan.nextDouble();
        
        if (salario > 0) {
            salarioValido = true;            
        } else {
            salarioValido = false;
            System.out.println("Salário inválido, tente novamente");
        }
    } while (!salarioValido);

    do {
        System.out.println("Sexo (M/F): ");
        sexo = scan.next().toUpperCase();
        
        switch (sexo) {
            case "M":
                sexoValido = true;
            break;
            case "F":
                sexoValido = true;
            break;
            default: 
                sexoValido = false;
                System.out.println("Opção inválida. Digitar M ou F");
            
        }    
        
    } while(!sexoValido);
    
    do {
        System.out.println("Estado Civil (s, c, v. d): ");
        estadoCivil = scan.next().toUpperCase();
        
        switch(estadoCivil) {
            case "S":
                estadoCivilValido = true;
                System.out.println("Solteiro");
            break;
            case "C":
                System.out.println("Casado");
                estadoCivilValido = true;
            break;
            case "V":
                System.out.println("Viuvo");
                estadoCivilValido = true;
             break;
            case "D":
                System.out.println("Divorciado");
                estadoCivilValido = true;
            break;
            default: 
                System.out.println("Resposta inválida");
                estadoCivilValido = false;
            break;           
            
        }
    } while (!estadoCivilValido);      
    
    }
     
}
