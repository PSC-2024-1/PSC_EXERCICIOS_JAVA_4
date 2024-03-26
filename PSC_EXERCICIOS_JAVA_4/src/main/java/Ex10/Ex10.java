/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex10;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que: 
             - leia 100 fichas, onde cada ficha contém o número de matrícula e a
            nota de cada aluno de um determinado curso;
             - determine e imprima as duas maiores notas, juntamente com o número de matrícula do aluno que obteve cada uma delas; 
             - assuma que não exista dois ou mais alunos com a mesma nota;*/

        Scanner input = new Scanner(System.in);
        double nota, maiorNota = -1, segundaMaiorNota = -1;
        int matricula, matriculaMaiorNota = 0, matriculaSegundaMaiorNota = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite o número de matrícula do aluno " + i + " : ");
            matricula = input.nextInt();
            System.out.print("Digite a nota do aluno " + i + " : ");
            nota = input.nextDouble();

            if (nota > maiorNota) {
                segundaMaiorNota = maiorNota;
                matriculaSegundaMaiorNota = matriculaMaiorNota;
                maiorNota = nota;
                matriculaMaiorNota = matricula;
            } else if (nota > segundaMaiorNota) {
                segundaMaiorNota = nota;
                matriculaSegundaMaiorNota = matricula;
            }
        }

        System.out.println("Maior nota: " + maiorNota + ", Matrícula: " + matriculaMaiorNota);
        System.out.println("Segunda maior nota: " + segundaMaiorNota + ", Matrícula: " + matriculaSegundaMaiorNota);

    }

}
