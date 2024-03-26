/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex06;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Modifique o programa do Jogo de Adivinhação para que após cada 
        tentativa, o programa deve informar ao usuário se o palpite é muito 
        alto, muito baixo, ou correto. Uma vez que o usuário adivinhe o número 
        corretamente, o programa perguntará se ele gostaria de jogar novamente.
        O usuário pode continuar jogando quantas vezes quiser até que escolha
        sair do jogo. Dica: use while(true).*/

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto, palpite;
        while (true) {
            numeroSecreto = random.nextInt(100) + 1;
            System.out.println("\nBem-vindo ao Jogo de Adivinhação!");
            System.out.println("Estou pensando em um número entre 1 e 100.");

            while (true) {
                System.out.print("Faça seu palpite: ");
                palpite = scanner.nextInt();

                if (palpite < numeroSecreto) {
                    System.out.println("Seu palpite é muito baixo.");
                } else if (palpite > numeroSecreto) {
                    System.out.println("Seu palpite é muito alto.");
                } else {
                    System.out.println("Parabéns! Você acertou o número!");
                    break; // Sai do loop interno, usuário acertou o número
                }
            }

            System.out.print("Você gostaria de jogar novamente? (sim/nao): ");
            String resposta = scanner.next().trim().toLowerCase();

            if (!resposta.equals("sim")) {
                System.out.println("Obrigado por jogar! Até a próxima.");
                break; // Sai do loop principal, termina o jogo
            }
        }
    }
}
