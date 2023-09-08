/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciomedia;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ExercicioMedia {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
     
        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextFloat();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scan.nextFloat();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scan.nextFloat();
        System.out.print("Digite a quarta nota: ");
        double nota4 = scan.nextFloat();
       
        double media = ((nota1 + nota2 + nota3 + nota4) / 4);
        
        System.out.print("A média das notas é: " +media);
        
     
        
    }
}
