/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor02;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        boolean senhaValida = false;
        String nomeUser;
        String senha;
        
        do {
            System.out.print("Digite seu nome: ");
            nomeUser = scan.next();
           
            System.out.print("Digite sua senha: ");
            senha = scan.next();
            
            if (nomeUser.equalsIgnoreCase(senha)) {
                senhaValida = false;
                System.out.println("Senha igual a usuário, digite novamente!");
            } else {
                senhaValida = true;
                System.out.println("Senha válida");
             }        
        
        } while (!senhaValida);       
    }
}
