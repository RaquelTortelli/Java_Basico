/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testefuncao02;

/**
 *
 * @author leona
 */
public class Operacoes {
    
    public static String contador (int i, int f) { //qdo statico posso fazer chamada sem instanciar nenhum objeto
        String s = "";
        for (int c = i; c <= f; c++) {
            s += c + " ";
        //static  torna o metodo estatico. nao preciso transformar em obj pra utilizar
        //void nao retorna valor
        //args é um vetor de string
        }
        return s;
    }
}
