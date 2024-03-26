/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que leia um número indeterminado de valores 
        e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. 
        Finalize a entrada com valor negativo ou zero.*/
        Scanner input = new Scanner(System.in);
        int numero;
        
        while (true) {
            System.out.print("Digite um número (ou um negativo para sair): ");
            numero = input.nextInt();
            if (numero <= 0) {
                break;
            }

            System.out.println("Número: " + numero);
            System.out.println("Quadrado: " + Math.pow(numero, 2));
            System.out.println("Cubo: " + Math.pow(numero, 3));
            System.out.println("Raiz Quadrada: " + Math.sqrt(numero));
        }
    }

}
