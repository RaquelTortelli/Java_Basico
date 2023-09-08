/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicaoidade;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class CondicaoIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Em que ano você nasceu? ");
       int nasc = teclado.nextInt();
       int i = 2023 - nasc;
        System.out.println("Sua idade é " +i);
       if (i<16) {
           System.out.println("Não vota!");
       }else {
           if ((i>=16 && i<18) || (i>70)) {
               System.out.println("Opcional");
           }else{
               //System.out.println("Obrigatório");
               javax.swing.JOptionPane.showMessageDialog(null, "Obrigatório");
           }
       }
      
    }
}
