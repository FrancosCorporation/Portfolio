package ListasTestes;
import java.util.Scanner;

public class Exer8{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num_peca, i, aprovado, reprovado;
        String qualidade;

        i=0;
        aprovado=0;
        reprovado=0;
        while(i<5){
            System.out.print("\nDigite o numero da peca: ");
            num_peca = in.nextInt();
            System.out.print("Digite se a peca foi aprovada ou reprovada: ");
            qualidade = in.next();

            if(qualidade.equalsIgnoreCase("aprovado") || qualidade.equalsIgnoreCase("aprovada")){
                aprovado++;
            }else if(qualidade.equalsIgnoreCase("reprovado") || qualidade.equalsIgnoreCase("reprovada")){
                System.out.print("\nPeca: "+num_peca+" Reprovada");
                reprovado++;
            }
            i++;
        }

        System.out.print("\nPecas Aprovadas: "+aprovado+"\nPecas Reprovadas: "+reprovado);

    }
}