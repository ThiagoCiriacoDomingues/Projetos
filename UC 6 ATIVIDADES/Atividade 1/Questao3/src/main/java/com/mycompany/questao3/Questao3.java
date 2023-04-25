/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questao3;

/**
 *
 * @author Thiago
 */
import java.util.Scanner;
public class Questao3 {
   
    public static void main(String[] args) {
      int idade, cont4 = 0, cont80 = 0;
        String nome;
        double diaria, tot = 0.0;
        
       Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da diaria: R$ ");
        diaria = entrada.nextDouble();
        
        do{
            System.out.print("\nInforme seu nome: ");
            entrada.nextLine();
            nome = entrada.nextLine();
            if(!"PARE".equals(nome)){
                System.out.print("\nInforme a idade: ");
                idade = entrada.nextInt();
                if(idade <= 4){
                    cont4++;
                    System.out.println("\nPossui gratuidade");
                
               } else if(idade >= 80){
                   cont80++;
                     System.out.println("\nPaga meia.");
                     tot += diaria / 2;
               }
                
            }
		
        }while(!"PARE".equals(nome)); 
        tot += diaria;
        System.out.println("\n\nTotal de hospedagens: R$"+tot+" ; "+cont4+ ",gratuidade ;" +cont80+" Paga meia." );
        
    }}
