package Exercicioslista5;
import java.util.Scanner;

public class Exercicio5_5{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int jogador1, jogador2, i;

        //Entra com os valores do jogador 1 e 2

        System.out.println("########### JOGADOR 1 ###########");
        System.out.print("Escolha um numero entre 1 e 10: ");
        jogador1 = in.nextInt();
        while (jogador1 >10 | jogador1 <=0) {
    		System.out.println("Voce digitou um numero invalido, tente novamente outro numero:");
    		jogador1 = in.nextInt();
    		
        }

        System.out.println("\n########### JOGADOR 2 ###########");
        System.out.print("Tente acertar o numero escolhido entre 1 a 10: ");
        jogador2 = in.nextInt();
        while (jogador2 >10 | jogador2 <=0) {
    		System.out.println("Voce digitou um numero invalido, tente novamente outro numero:");
    		jogador2 = in.nextInt();
        }
      

        //i=1 pois o jogador 2 ja fez uma tentativa acima
        i=1;

        //while pois enquanto o numero que o jogador 2 colocar for diferente
        //do numero escolhido pelo jogador 1 ele vai fazendo a pergunta e a
        //variavel i vai somando as tentativas
        while(jogador1!=jogador2){
        System.out.print("\nVoce errou, tente novamente outro numero: ");
       jogador2 = in.nextInt();
       i++;
       while (jogador2 >10 | jogador2 <=0) {
   		System.out.println("Voce digitou um numero invalido, tente novamente outro numero:");
   		jogador2 = in.nextInt();
         i++;
       }}
        System.out.print("\nAcertou o numero "+ jogador1 + " em "+ i + " tentativas");
        } 
}