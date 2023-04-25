/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questao4;

/**
 *
 * @author Thiago
 */
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] convidados = new String[15];
        int contador = 0;

        while (true) {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Pesquisar");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = entrada.nextInt();

            if (opcao == 1) {
                if (contador == 15) {
                    System.out.println("Máximo de cadastros atingido");
                } else {
                    System.out.print("Informe o nome do hóspede: ");
                    convidados[contador] = entrada.next();
                    contador++;
                }
            } else if (opcao == 2) {
                System.out.print("Informe o nome do hóspede: ");
                String name = entrada.next();
                int indice = -1;
                for (int i = 0; i < contador; i++) {
                    if (convidados[i].equals(name)) {
                        indice = i;
                        
                    }
                }
                if (indice != -1) {
                    System.out.println("Hóspede " + name + " foi encontrado no índice " + indice);
                } else {
                    System.out.println("Hóspede não encontrado");
                }
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
