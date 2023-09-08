/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodofuncao;

/**
 *
 * @author leona
 */
public class MetodoFuncao { //metodo que retorna valor e meu proprio codigo escolhe a nelhor maneira
    static int soma (int a, int b){  //esse metodo não é estático igual main então tem que transformar, colocando static ele vai fazer parte apenas da classe, nao faz parte de um instanciamento de objeto
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int sm = soma(5,2);
        System.out.println("A soma vale " +sm);
        
    }
}
