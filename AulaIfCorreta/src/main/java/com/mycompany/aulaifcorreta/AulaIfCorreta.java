/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulaifcorreta;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class AulaIfCorreta {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com sua idade: ");
        
        int idade = scan.nextInt();
       
        //relacionais e lógicios são bem utilizados com condicionais
        if(idade>=18){
            System.out.println("Você é maior de idade");
            
        }else {
            System.out.println("Não é maior de idade");
            
           
        }
    }
}
