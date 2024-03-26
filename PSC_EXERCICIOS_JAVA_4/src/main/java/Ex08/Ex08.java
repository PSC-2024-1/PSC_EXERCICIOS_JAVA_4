/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex08;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa em Java que calcule o produto de A (número real)
        por B (número inteiro), ou seja, A*B, por intermédio de adições sucessivas.
        Tanto A quanto B devem ser fornecidos pela pessoa utilizadora do programa.*/
        Scanner scanner = new Scanner(System.in);
        double a, resultado = 0;
        int b;
        System.out.print("Digite o número real A: ");
        a = scanner.nextDouble();
        System.out.print("Digite o número inteiro B: ");
        b = scanner.nextInt();
       
        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        System.out.println("Produto de " + a + " por " + b + " através de adições sucessivas é: " + resultado);

    }

}
