/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer12;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Qual valor da sua hora: R$ ");
        double valorHora = scan.nextDouble();
        System.out.print("Quantas horas você trabalha no mês: ");
         double horaMes = scan.nextDouble();
        
         //Resolução
        double salBruto = (valorHora * horaMes);
        double percentualIR = 0;
        
        if (salBruto <= 900) {
            percentualIR = 0;
                        
        }else if (salBruto > 900 && salBruto <= 1500) {
            percentualIR = 5;
        
        }else if (salBruto > 1500 && salBruto <= 2500) {
            percentualIR = 10;
                           
        }else if (salBruto > 2500) {
            percentualIR = 20;           
        }
        
        double ir = (salBruto/100) * percentualIR;
        double inss = (salBruto/100) * 10;
        double fgts = (salBruto/100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salBruto - totalDescontos;
        
        
        System.out.println("Salário Bruto: ( " + valorHora + " * " + horaMes + "):" +salBruto);
        System.out.println("(-) IR (" + percentualIR + "%): " + ir);
        System.out.println("(-) INSS (10%): " + inss);
        System.out.println("(-) FGTS (11%): " +fgts);
        System.out.println("Total de Descontos: " +totalDescontos);
        System.out.println("Salários Líquido: " +salarioLiquido);
        
              
        
         
          
        
    }
}
