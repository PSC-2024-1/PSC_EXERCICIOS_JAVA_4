/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex11;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Na usina de Angra dos Reis, os técnicos analisam a perda de massa de
        um material radioativo. Sabendo-se que este perde 25% de sua massa a 
        cada 30 segundos. Criar um programa que calcule iterativamente e imprima 
        o tempo necessário para que a massa deste material se torne menor que
        0,10 grama. O programa pode calcular o tempo para várias massas.*/
        Scanner input = new Scanner(System.in);
        double massaInicial, massa;
        int tempoTotal = 0;

        System.out.print("Digite a massa inicial do material em gramas: ");
        massaInicial = input.nextDouble();
        massa = massaInicial;

        while (massa >= 0.10) {
            massa *= 0.75; // Perde 25% da massa a cada 30 segundos
            tempoTotal += 30; // Incrementa o tempo total a cada iteração
        }

        System.out.println("Tempo necessário para que a massa do material se torne menor que 0,10 gramas: " + tempoTotal + " segundos.");

    }

}
