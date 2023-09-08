/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer16;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo número: ");
        int num2 = scan.nextInt();
        
        System.out.println("Entre com a operação (+ - / *): ");
        String operacao = scan.next();
        
        double resultado = 0;
        boolean valida = true;
        
        switch(operacao) {
            case "+": 
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                resultado = num1/num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            default:
                System.out.println("Operação inválida");
                valida = false;
        }
       
        if (valida) {  //flag
            System.out.println("Resultado: " + resultado);


            if(resultado >=0) {
                System.out.println("Resultado positivo");
            }else {
                System.out.println("Resultado negativo");
            }

            if(resultado % 2 == 0) {
                System.out.println("Resultado PAR");
            }else {
                System.out.println("Resultado IMPAR");
            }
        }   
    }
}
