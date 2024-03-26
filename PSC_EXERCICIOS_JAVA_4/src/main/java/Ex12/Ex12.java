/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex12;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Seja a seguinte série:
            1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, …
            - Escreva um programa que seja capaz de gerar os N termos dessa série.
            - Esse número N deve ser lido do teclado.*/
        Scanner input = new Scanner(System.in);
        int n, termo1 = 1, termo2 = 4, termo3 = 4, cont = 0;

        System.out.print("Quantos termos da série você deseja gerar? ");
        n = input.nextInt();

        do {

            if (cont < n) {
                System.out.print(termo1 + " ");
                termo1++;
                cont++;
            }
            if (cont < n) {
                System.out.print(termo2 + " ");
                termo2++;
                cont++;
            }
            if (cont < n) {
                System.out.print(termo3 + " ");
                termo3++;
                cont++;
            }

        } while (cont < n);

    }

}
