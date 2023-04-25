/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questao1;

/**
 *
 * @author Thiago
 */
import java.util.Scanner;
public class Questao1 {
   
    public static void main(String[] args) { 
       int convidados;
       int beta = 350;
       int alpha = 220;
       int cadeiras;
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Quantidade de convidados?");
       convidados = entrada.nextInt();
       
       if (convidados > 0 && convidados <= alpha){
           System.out.print("Alfa é o mais adequado");
           if(convidados > 150){
               cadeiras = convidados - 150;
               System.out.print("serão necessario mais "+ cadeiras + " cadeiras");
           }
       } else if(convidados > alpha && convidados <= 350) {
           System.out.print("beta é o mais adequado");
       } else {
           System.out.print("Numero de Convidados inválido.\n");
       }
    }
}
