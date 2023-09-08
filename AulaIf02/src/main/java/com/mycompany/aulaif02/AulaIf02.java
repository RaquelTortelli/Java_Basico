/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulaif02;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class AulaIf02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // barato <= 10
        //10 < valor < 15 - pedir desconto
        // 15 <= valor < 17 - pesquisar mais
        // >= 17 - muito caro
        
        System.out.print("Entre com o preço do item: ");
        double valor = scan.nextDouble();
        
        if  (valor <=10)   {
            System.out.println("Está barato, pode comprar");
       
            
        }else if (valor>10 && valor <15){
            System.out.println("Você pode pedir desconto");
        }else if (valor >=15 && valor <17) {
            System.out.println("Você pode pesquisar mais");
                    
        }else { //valor >=17
             System.out.println("Muito caro!");
        }
        
        
        
        
        
    }
}
