/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor06;

import java.util.Arrays;

/**
 *
 * @author leona
 */
public class Vetor06 {

    public static void main(String[] args) {
        int v []= new int[20];
        Arrays.fill(v,0); // todos elementos vão ser preenchidos com esse numero
        for (int valor : v){ // funcao for it pra mostrar vetor
            System.out.print(valor + " ");
        }
    }
}
