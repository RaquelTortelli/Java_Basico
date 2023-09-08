/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciocinco;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioCinco {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a medida em metros: ");
        double medida = scan.nextFloat();
        
        double cm = (medida * 100);
        System.out.println("Essa medida de " + medida + " será o equivalente à " + cm + " centimentos.");
        
        
        
    }
}
