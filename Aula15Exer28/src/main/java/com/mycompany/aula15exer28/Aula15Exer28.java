/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula15exer28;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Aula15Exer28 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
        System.out.println("Entre com um tipo da carne FD - Filpe Duplo / A - Alcatra / P - Picanha): ");
        String tipoCarne = scan.next().toUpperCase();
        System.out.println("Entre com a quantidade (Kg): ");
        double qtdadeCarne = scan.nextDouble();
        
        String descricaoTipoCarne = "";
        double fileDuploAte5 = 4.90;
        double fileDuploAcima5 = 5.8;
        double alcatraAte5 = 5.9;
        double alcatraAcima5 = 6.8;
        double picanhaAte5 = 6.9;
        double picanhaAcima5 = 7.8;
        double valorTotal = 0;
        double valorComDesconto = 0;
        
        switch(tipoCarne) {
            case "FD": 
                if (qtdadeCarne <= 5) {
                    valorTotal = qtdadeCarne*fileDuploAte5;
                } else {
                    valorTotal = qtdadeCarne*fileDuploAcima5;
                }
                descricaoTipoCarne = "Filé duplo";
                break;
            case "A":
                if (qtdadeCarne <=5){
                    valorTotal = qtdadeCarne*alcatraAte5;
                } else {
                    valorTotal = qtdadeCarne*alcatraAcima5;
                }
                descricaoTipoCarne = "Alcatra";
                break;
            case "P":
                if (qtdadeCarne <= 5) {
                    valorTotal = qtdadeCarne*picanhaAte5;
                } else { 
                    valorTotal = qtdadeCarne*picanhaAcima5;
                }
                descricaoTipoCarne = "Picanha";
                break;
        }
        
        valorComDesconto = valorTotal;
        
        System.out.println("Forma de Pagamento: Cartão (C) ou Dinheiro (D)");
        String formaPagamento = scan.next();

        double desconto = 0;
        String descricaoFormaPagamento = "Dinheiro";
        if (formaPagamento.equalsIgnoreCase("C"))  {
            desconto = 5;
            valorComDesconto = valorTotal - (valorTotal * (desconto/100));
            descricaoFormaPagamento = "Cartão";
        }

        System.out.println(" ---- CUPOM FISCAL-----------");
        System.out.println("INFORMAÇÕES DE COMPRA:");
        System.out.println("Tipo de carne escolhida " + descricaoTipoCarne);
        System.out.println("Quantidade de carne desejada: " + qtdadeCarne);
        System.out.println("Preço Total: R$ "+ valorTotal);
        System.out.println("Forma de Pagamento "+ descricaoFormaPagamento);
        System.out.println("Valor do desconto R$ " + (valorTotal - valorComDesconto));
        System.out.println("Valor a pagar: R$ " + valorComDesconto);
    }
}
