/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class TIposPrimitivos {

    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in); // criei um objeto teclado
       System.out.print("Digite o nome do aluno: ");
       String nome = teclado.nextLine();
       System.out.print("Digite a nota do aluno: ");
       float nota = teclado.nextFloat();
       //float nota = (float) 8.5; outra forma de fazer
        
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        
        
      
        
    }
}
