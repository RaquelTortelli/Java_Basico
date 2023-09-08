/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodomain;

/**
 *
 * @author leona
 */
public class MetodoMain {
   static void soma (int a, int b){  //esse metodo não é estático igual main então tem que transformar, colocando static ele vai fazer parte apenas da classe, nao faz parte de um instanciamento de objeto
        int s = a + b;
        System.out.println("A Soma é " + s);
        
    }
    public static void main(String[] args) {  //VOID PROCEDIMENTO QUE NAO RETORNA VALOR / MAIN METODO/ROTINA que vai receber um argumento, vetor de string
        System.out.println("Começou o programa");
        soma(5,2); // o procedimento la de cima só é executado qdo chamado
        
    }
}
