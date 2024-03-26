/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex09;

/**
 *
 * @author rafaelamoreira
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dados dois países, A com população igual a cinco milhões de pessoas, 
    e taxa de natalidade de três por cento ao ano, e, B, com população igual a 
    sete milhões de pessoas e taxa de natalidade de dois por cento ao ano, 
    escreva um programa em Java que calcule iterativamente e exiba em quantos 
    anos a população de A ultrapassará a população de B.*/
        double populacaoA = 5000000, populacaoB = 7000000;
        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += (populacaoA * 0.03);
            populacaoB += (populacaoB * 0.02);
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população de A ultrapasse ou iguale a população de B.");

    }

}
