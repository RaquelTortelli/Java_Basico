/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoreslogico;

/**
 *
 * @author leona
 */
public class OperadoresLogico {

    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 2;
        
        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        boolean resultado2 = (valor1 ==1) || (valor2==2);
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);
        System.out.println("valor1  é 1 OR valor 2 é 2 - resultado: " + resultado2);
        
        //logicos são sempre usados com relacionais
        /*
        boolean verdadeiro = true;
        boolean falso = false;
        
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);*/
        
        int resultado = 1 + 1 - 1 + 1 * 1 / 1 ;
        System.out.println(resultado);
        
        
    }
}
