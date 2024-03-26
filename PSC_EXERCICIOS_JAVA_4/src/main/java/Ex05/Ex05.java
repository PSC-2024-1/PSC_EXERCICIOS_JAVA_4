/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa em Java que implementa um jogo simples de adivinhação.
        O objetivo do jogo é que o usuário tente adivinhar um número secreto
        gerado aleatoriamente pelo computador. Este número estará entre 1 e 100,
        inclusive. Para tornar o jogo interativo e dar feedback ao jogador,
        o programa deve informar após cada tentativa se o palpite do usuário é 
        muito alto, muito baixo, ou correto. O jogo termina quando o usuário
        acertar o número, e o programa deve informar o número de tentativas que 
        foram necessárias para chegar à resposta correta*/
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int chute, tentativas = 0, numeroParaAdivinhar;
        numeroParaAdivinhar = random.nextInt(100) + 1; // Números entre 1 e 100
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100...");
        System.out.println("Tente adivinhar qual é!");

        do {
            System.out.print("Digite seu palpite: ");
            chute = input.nextInt();
            tentativas++;

            if (chute < numeroParaAdivinhar) {
                System.out.println("Muito baixo. Tente novamente.");
            } else if (chute > numeroParaAdivinhar) {
                System.out.println("Muito alto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
            }
        } while (chute != numeroParaAdivinhar);
    }

}
