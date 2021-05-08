package Exercicioslista5;
import java.util.Scanner;

public class Exercicio5_8{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num_peca, i, aprovado, reprovado;
        String qualidade;

        i=0;
        num_peca=0;
        aprovado=0;
        reprovado=0;
        
        
        while(i<400){
            System.out.print("\nDigite o numero da peca: ");
            num_peca = in.nextInt();
            System.out.print("Digite se a peca foi aprovada ou reprovada: ");
            qualidade = in.next();

            if(qualidade.equals("aprovado") || qualidade.contentEquals("aprovada") || qualidade.contentEquals("Aprovados") || qualidade.contentEquals("Aprovadas") || qualidade.contentEquals("Aprovado") || qualidade.contentEquals("Aprovada")|| qualidade.contentEquals("aprovados") || qualidade.contentEquals("aprovadas")){
                aprovado = aprovado + num_peca;
            }else if (qualidade.contentEquals("Reprovado") || qualidade.contentEquals("Reprovados") || qualidade.contentEquals("reprovado") || qualidade.contentEquals("reprovados") || qualidade.contentEquals("Reprovada") || qualidade.contentEquals("Reprovadas")|| qualidade.contentEquals("reprovadas") || qualidade.contentEquals("reprovada")){
                System.out.print("\nPeca: "+num_peca+" Reprovada");
                reprovado = reprovado + num_peca;
            }
            i= num_peca + i;
        }

        System.out.print("\nPecas Aprovadas: "+aprovado+"\nPecas Reprovadas: "+reprovado);

    }
}