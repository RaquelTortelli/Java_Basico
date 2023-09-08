/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leituradadosteclado;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class LeituraDadosTeclado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine(); //ler a linha inteira
        System.out.println("Seu nome completo é " +nomeCompleto);
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = scan.next(); //ler um dado especifico
        System.out.println("seu primeiro nome é " +primeiroNome); */
        
        /*System.out.print("Digite a sua idade ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é " +idade); //esse ainda não corrige algo digitado errado
        
        System.out.print("Digite a sua altura ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é " + altura);*/
        
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinhos de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        
        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro Nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " +qtdFilhos);
        System.out.println("Altura" + altura);
        System.out.println("Tem bichinho de estimação? " + temPet);
        
        
        
    }
}
