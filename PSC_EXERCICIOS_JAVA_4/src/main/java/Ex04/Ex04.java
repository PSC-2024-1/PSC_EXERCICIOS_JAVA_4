/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex04;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Em um campeonato de LOL, enquanto não há a tomada de território, 
        o contador implementado deve contar (que é contabilizado pelo jogo),
        o número de kills, deaths e assists. Se o número de kills for 
        menor ou igual a 5, ele mostra a mensagem “noob”, se chegar a 
        20 ou mais “master”. Se o número de deaths chegar a 20 ou mais,
        ele mostra a mensagem “Houston, we have a problem”.
        Se o número de assists chegar a 20 ou mais, é mostrada a mensagem:
        “team work”. Lembre-se, é uma rotina que continua enquanto não houver 
        um vencedor.
        Dicas: 
        há kills, deaths e assists total e da rodada
        medite na frase: enquanto não há um vencedor, faça…
        pergunte a cada loop o número de cada medida comentada.
        você deve perguntar se há um vencedor a cada loop…
         */

        Scanner input = new Scanner(System.in);
        int kills, deaths, assists, killsTotal = 0, deathsTotal = 0, assistsTotal = 0;
        while (true) {
            System.out.println("Há um vencedor? (sim/não)");
            String vencedor = input.next();
            if (vencedor.equalsIgnoreCase("sim")) {
                break;
            }

            System.out.print("Número de kills na rodada: ");
            kills = input.nextInt();
            killsTotal+= kills;
            System.out.print("Número de deaths na rodada: ");
            deaths = input.nextInt();
            deathsTotal += deaths;
            System.out.print("Número de assists na rodada: ");
            assists = input.nextInt();
            assistsTotal += assists;
            
            if (kills <= 5) {
                System.out.println("noob");
            } else if (kills >= 20) {
                System.out.println("master");
            }

            if (deaths >= 20) {
                System.out.println("Houston, we have a problem");
            }

            if (assists >= 20) {
                System.out.println("team work");
            }
       
        }
        
        System.out.println("Total de kills: " + killsTotal);
        System.out.println("Total de deaths: " + deathsTotal);
        System.out.println("Total de assists: " + assistsTotal);
        
    }

}
