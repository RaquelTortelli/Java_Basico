/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comandoenquanto;

/**
 *
 * @author leona
 */
public class ComandoEnquanto {

    public static void main(String[] args) {
        int cc = 0;
        while (cc<10) {
            cc++;
            if (cc == 2 || cc ==3 || cc == 4) {
                continue; // interromple fluxo natural e retorna pro enquanto
            }
            if (cc == 7) {
                break; // ele interrompe e sai fora do laço
            }
            System.out.println("Cambalhota " + cc);
                        
        }
    }
}
