/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex07;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa em Java que exiba formas geométricas na tela.
        Um menu deve ser exibido com as seguintes opções: retângulo, diagonal 
        superior esquerda, diagonal superior direita, diagonal inferior esquerda,
        diagonal inferior direita. As imagens devem ser formadas por asteriscos
        (*) e, a pessoa utilizadora deve informar a quantidade de colunas. 
         */
        Scanner input = new Scanner(System.in);
        int colunas, opcao;

        while (true) {
            System.out.println("Escolha uma forma para desenhar:");
            System.out.println("1. Retângulo");
            System.out.println("2. Diagonal Superior Esquerda");
            System.out.println("3. Diagonal Superior Direita");
            System.out.println("4. Diagonal Inferior Esquerda");
            System.out.println("5. Diagonal Inferior Direita");
            System.out.println("6. Sair");
            System.out.print("Digite sua opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // desenha Retângulo
                    System.out.print("Digite a quantidade de colunas: ");
                    colunas = input.nextInt();
                    for (int i = 0; i < colunas; i++) {
                        for (int j = 0; j < colunas; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2: // desenha Diagonal Superior Esquerda
                    System.out.print("Digite a quantidade de colunas: ");
                    colunas = input.nextInt();
                    for (int i = 0; i < colunas; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3: // desenha Diagonal Superior Direita
                    System.out.print("Digite a quantidade de colunas: ");
                    colunas = input.nextInt();
                    for (int i = 0; i < colunas; i++) {
                        for (int j = 0; j < colunas; j++) {
                            if (j < i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:// desenha Diagonal Inferior Esquerda
                    System.out.print("Digite a quantidade de colunas: ");
                    colunas = input.nextInt();
                    for (int i = colunas; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    break;
                case 5:// desenha Diagonal Inferior Direita
                    System.out.print("Digite a quantidade de colunas: ");
                    colunas = input.nextInt();
                    for (int i = colunas; i > 0; i--) {
                        for (int j = 0; j < colunas; j++) {
                            if (j < colunas - i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Até mais!");
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }
    }

}
