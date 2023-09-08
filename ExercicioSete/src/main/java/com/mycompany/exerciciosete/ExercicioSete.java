/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosete;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioSete {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o tamnho do lado do quadrado");
        double lado = scan.nextDouble();
        
        //area = lado*lado
        double area = Math.pow(lado, 2);
        
        System.out.println("A área do quadrado é " +area);
        System.out.println("O dobro da área do quadrado é " + (area*2));
        
        
        
        
        
    }
}
