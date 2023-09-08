/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacaostring;

/**
 *
 * @author leona
 */
public class ComparacaoString {

    public static void main(String[] args) {
       String nome1 = "Gustavo";
       String nome2 = "Gustavo";
       String nome3 = new String("Gustavo");
       String res;
       //res = (nome1==nome2)?"igual":"diferente";//aqyu objetos são igual mas n3 nao é igual, so tem o mesmo conteudo
       res = (nome1.equals(nome3))?"igual":"diferente"; // verifica se o consteudo de um objeto é igual
        System.out.println(res);
    }
}
