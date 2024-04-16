/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    public static void main(String[] args) {
        /*Crie um programa que lê vários números inteiros e positivos
        e imprima o produto dos números ímpares e a soma dos números pares.*/

        Scanner input = new Scanner(System.in);
        int produtoImpares = 1;
        int somaPares = 0;
        int cont = 0;
        while (true) {
            System.out.print("Digite um número inteiro e positivo (ou um negativo para sair): ");
            int numero = input.nextInt();
            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                produtoImpares *= numero;
            }
            cont++;
        }
        if (cont > 0) {
            System.out.println("Produto dos números ímpares: " + produtoImpares);
            System.out.println("Soma dos números pares: " + somaPares);
        }
    }
}
