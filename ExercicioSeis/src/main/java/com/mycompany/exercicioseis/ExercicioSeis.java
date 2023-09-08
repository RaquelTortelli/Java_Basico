/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioseis;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioSeis {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         System.out.print("Entre com o raio do circculo: ");
         double raio = scan.nextDouble();
         
         //valor de PI ja está na classe Math
         double area = Math.PI * Math.pow(raio, 2); //função potencia. Classes utilitarias
         
         System.out.println("A área do ciculo é " +area);
    }
}
