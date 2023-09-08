/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase03;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class SwitchCase03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Entre com um dia da semana (1-7): ");
        int diaSemana = scan.nextInt();
       
        switch(diaSemana) {
            case 2:   
            case 3: 
            case 4: 
            case 5: 
            case 6: System.out.println("Dia útil"); break;
            case 1:  
            case 7: System.out.println("Fim de semana"); break;
            default: System.out.println("Nao é um dia da semana válido.");
    }
    }
    
}
