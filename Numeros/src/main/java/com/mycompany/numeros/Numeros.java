/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeros;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Numeros {

    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner (System.in);
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s = s + n;
            System.out.print("Quer continuar? [S/N]: ");
            resp = teclado.next();
            
            
        }while (resp.equals("S"));
        System.out.print("A soma de todos os valores é " +s);
        
    }
}
