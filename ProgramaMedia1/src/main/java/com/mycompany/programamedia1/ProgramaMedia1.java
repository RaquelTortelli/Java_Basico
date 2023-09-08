/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programamedia1;
import java.util.Scanner;
/**
 *
 * @author leona1987
 * 
 */
public class ProgramaMedia1 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in); // qdo uso new eu crio um objeto
        System.out.print("Qual seu ano de nascimento: ");
        int nasc = t.nextInt();
        int i = 2023 - nasc;
        System.out.println("Sua idade é " +i);
        if (i>=18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
        
    }
}
