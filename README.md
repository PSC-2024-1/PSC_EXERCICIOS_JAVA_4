# PSC_EXERCICIOS_JAVA_4

1. Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números ímpares e a soma dos números pares.

2. Faça um programa que leia um número indeterminado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. Finalize a entrada com valor negativo ou zero.

3. Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
   - a quantidade de pessoas com idade superior a 50 anos;
   - a média das alturas das pessoas com idade entre 10 e 20 anos;
   - a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.

4. Em um campeonato de LOL, enquanto não há a tomada de território, o contador implementado deve contar (que é contabilizado pelo jogo), o número de kills, deaths e assists. Se o número de kills for menor ou igual a 5, ele mostra a mensagem “noob”, se chegar a 20 ou mais “master”. Se o número de deaths chegar a 20 ou mais,  ele mostra a mensagem “Houston, we have a problem”. Se o número de assists chegar a 20 ou mais, é mostrada a mensagem: “team work”. Lembre-se, é uma rotina que continua enquanto não houver um vencedor.
   - Dicas: 
      - há kills, deaths e assists total e da rodada
      - medite na frase: enquanto não há um vencedor, faça…
      - pergunte a cada loop o número de cada medida comentada.
      - você deve perguntar se há um vencedor a cada loop…

5. Crie um programa em Java que implementa um jogo simples de adivinhação. O objetivo do jogo é que o usuário tente adivinhar um número secreto gerado aleatoriamente pelo computador. Este número estará entre 1 e 100, inclusive. Para tornar o jogo interativo e dar feedback ao jogador, o programa deve informar após cada tentativa se o palpite do usuário é muito alto, muito baixo, ou correto. O jogo termina quando o usuário acertar o número, e o programa deve informar o número de tentativas que foram necessárias para chegar à resposta correta. Exemplo:
```
Bem-vindo ao Jogo de Adivinhação!
Estou pensando em um número entre 1 e 100...
Tente adivinhar qual é!
Digite seu palpite: 50
Muito alto. Tente novamente.
Digite seu palpite: 25
Muito baixo. Tente novamente.
Digite seu palpite: 37
Parabéns! Você acertou o número em 3 tentativas!
```

6. Modifique o programa do Jogo de Adivinhação para que após cada tentativa, o programa deve informar ao usuário se o palpite é muito alto, muito baixo, ou correto. Uma vez que o usuário adivinhe o número corretamente, o programa perguntará se ele gostaria de jogar novamente. O usuário pode continuar jogando quantas vezes quiser até que escolha sair do jogo. Dica: use while(true).

7. Crie um programa em Java que exiba formas geométricas na tela. Um menu deve ser exibido com as seguintes opções: retângulo, diagonal superior esquerda, diagonal superior direita, diagonal inferior esquerda, diagonal inferior direita. As imagens devem ser formadas por asteriscos (*) e, a pessoa utilizadora deve informar a quantidade de colunas. Abaixo estão alguns exemplos das formas:
```
a)  *  *  *  * 
    *  *  *  *
    *  *  *  *
    *  *  *  *

b)  *  *  *  * 
    *  *  *  
    *  *  
    *  

c)  *  *  *  * 
    *  *  *  *
          *  *
             *
d)  *   
    *  * 
    *  *  *  
    *  *  *  *

e) 
           * 
        *  *
     *  *  *
  *  *  *  *
```
8. Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro), ou seja, A*B, por intermédio de adições sucessivas. Tanto A quanto B devem ser fornecidos pela pessoa utilizadora do programa.

9. Dados dois países, A com população igual a cinco milhões de pessoas, e taxa de natalidade de três por cento ao ano, e, B, com população igual a sete milhões de pessoas e taxa de natalidade de dois por cento ao ano, escreva um programa em Java que calcule iterativamente e exiba em quantos anos a população de A ultrapassará a população de B.

10. Escreva um programa que: 
   - leia 100 fichas, onde cada ficha contém o número de matrícula e a nota de cada aluno de um determinado curso;
   - determine e imprima as duas maiores notas, juntamente com o número de matrícula do aluno que obteve cada uma delas; 
   - assuma que não exista dois ou mais alunos com a mesma nota;

11. Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material radioativo. Sabendo-se que este perde 25% de sua massa a cada 30 segundos. Criar um programa que calcule iterativamente e imprima o tempo necessário para que a massa deste material se torne menor que 0,10 grama. O programa pode calcular o tempo para várias massas.

12. Seja a seguinte série:
   1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, …
    - Escreva um programa que seja capaz de gerar os N termos dessa série.
    - Esse número N deve ser lido do teclado.
