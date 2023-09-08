/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer10;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer10 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        //Leitura de dados
        System.out.print("Entre com o salário do colaborador R$: ");
        double sal = scan.nextDouble();
        
        //Resolução
        int percentual = 0;
               
        if (sal <= 280) {
            percentual = 20;
            
        }else if (sal > 280 && sal <= 700)  {
            percentual = 15;
            
        }else if (sal > 700 && sal <= 1500) {
            percentual = 10;
            
        }else if (sal > 1500) {
            percentual = 5;
          
        }
        
            double aumento = (sal/100)*percentual;
            double reajuste = (aumento + sal);
            
            //Saída de dados
            System.out.println("Salário antes do reajuste : R$ " + sal);
            System.out.println("Percentual de aumento aplicado: " + percentual + "%");
            System.out.println("O valor do aumento foi de R$ " + aumento);
            System.out.println("Salário após reajuste: R$ " + reajuste); 
        
        
    }
}
