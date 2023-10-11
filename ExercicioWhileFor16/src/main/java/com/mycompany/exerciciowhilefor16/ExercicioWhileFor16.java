/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciowhilefor16;

/**
 *
 * @author leona
 */
public class ExercicioWhileFor16 {

    public static void main(String[] args) {
                 
        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;
        
        System.out.println(primeiro);
        System.out.println(segundo);
        
       while (proximo <= 500) {
           
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.println(proximo);
        }
        
        
    }
}
