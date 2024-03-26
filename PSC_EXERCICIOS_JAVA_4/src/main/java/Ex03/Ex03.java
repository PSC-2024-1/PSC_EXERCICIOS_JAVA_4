/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
            a) a quantidade de pessoas com idade superior a 50 anos;
            b) a média das alturas das pessoas com idade entre 10 e 20 anos;
            c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.
         */
        Scanner input = new Scanner(System.in);
        int pessoasMais50 = 0, contadorAlturas = 0, pessoasMenos40kg = 0, idade;
        double somaAlturas = 0, altura, peso, mediaAlturas, porcentagemMenos40kg;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = input.nextInt();
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            altura = input.nextDouble();
            System.out.print("Digite o peso da pessoa " + i + " (em kg): ");
            peso = input.nextDouble();

            if (idade > 50) {
                pessoasMais50++;
            }
            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                contadorAlturas++;
            }
            if (peso < 40) {
                pessoasMenos40kg++;
            }
        }

        mediaAlturas = contadorAlturas > 0 ? somaAlturas / contadorAlturas : 0;
        porcentagemMenos40kg = (pessoasMenos40kg / 10.0) * 100;

        System.out.println("Pessoas com mais de 50 anos: " + pessoasMais50);
        System.out.println("Média das alturas das pessoas entre 10 e 20 anos: " + mediaAlturas);
        System.out.println("Porcentagem de pessoas com menos de 40kg: " + porcentagemMenos40kg + "%");

    }

}
