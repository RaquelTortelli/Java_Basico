/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testetipos;

/**
 *
 * @author leona
 */
public class TesteTipos {

    public static void main(String[] args) {
        /*int idade = 30;
        String valor = Integer.toString(idade); // classe involocro e metodo to string
        System.out.println(valor);*/
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor); //converter parte inteira do valor
        System.out.printf("%.3f",idade);
        
        
        
    }
}
