/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questao5;

/**
 *
 * @author Thiago
 */
import java.util.Scanner;


public class Questao5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] andar1 = new String[4];
        String[] andar2 = new String[4];
        String[] andar3 = new String[4];
        String[] andar4 = new String[4];
        char menu = 'S';
        String ocupado = "OCUPADO";
 
        while(menu == 'S'){
       
        System.out.println("\t___Mudar o STATUS do quarto para OCUPADO___");            
        System.out.print("\nAndar numero: ");
        int andar = sc.nextInt();
            System.out.print("\nQuarto numero: ");
            int quarto = sc.nextInt();
        
        for (int i=1; i<4; i++){           
            if (andar == 1){
                if(andar1[quarto] == ocupado){
                    System.out.println("Este quarto já está ocupado.");break;
                } else{
                andar1[quarto] = ocupado;
                System.out.println("Quarto " + quarto + " alterado para OCUPADO");break;
            }}                  
            if (andar == 2){
                if(andar2[quarto] == ocupado){
                    System.out.println("Este quarto já está ocupado.");break;
                } else{
                andar2[quarto] = ocupado;
                System.out.println("Quarto " + quarto + " alterado para OCUPADO");break;
            }}              
            if (andar == 3){
                if(andar3[quarto] == ocupado){
                    System.out.println("Este quarto já está ocupado.");break;
                } else{
                andar3[quarto] = ocupado;
                System.out.println("Quarto " + quarto + " alterado para OCUPADO");break;
            } }            
            if (andar == 4){
                if(andar4[quarto] == ocupado){
                    System.out.println("Este quarto já está ocupado.");break;
                } else{
                andar4[quarto] = ocupado;
                System.out.println("Quarto " + quarto + " alterado para OCUPADO");break;
            } }                               
        }
            System.out.print("\nDesejar mudar o status de outro quarto? S ou N: ");
            menu = sc.next().charAt(0);
        
        }
        
        System.out.println();
        System.out.println("ANDAR 1 - Inferior");
        for (int i=1; i<4; i++){
        System.out.println((andar1[i] != null) ? "Quarto "  + i + ": OCUPADO" : "Quarto "  + i + ": LIVRE");}
        
        System.out.println();
        System.out.println("ANDAR 2");
        for (int i=1; i<4; i++){
        System.out.println((andar2[i] != null) ? "Quarto "  + i + ": OCUPADO" : "Quarto "  + i + ": LIVRE");}
        
        System.out.println();
        System.out.println("ANDAR 3");
        for (int i=1; i<4; i++){
        System.out.println((andar3[i] != null) ? "Quarto "  + i + ": OCUPADO" : "Quarto "  + i + ": LIVRE");}
        
        System.out.println();
        System.out.println("ANDAR 4 - Superior");
        for (int i=1; i<4; i++){
        System.out.println((andar4[i] != null) ? "Quarto "  + i + ": OCUPADO" : "Quarto "  + i + ": LIVRE");}
        
    
    sc.close();
    }
 
    
}