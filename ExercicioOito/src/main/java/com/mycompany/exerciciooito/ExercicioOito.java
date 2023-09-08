/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciooito;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioOito {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quanto você ganha por hora: ");
        double valorhora = scan.nextDouble();
        
        System.out.print("Quantas horas você trabalha por mês: ");
        double horasmes = scan.nextDouble();
        
        //calculo salário
        double sal = valorhora*horasmes;
        
        System.out.println("O total do seu salário mensal será de R$ " +sal);
        
        
        
        
                
        
        
    }
}
