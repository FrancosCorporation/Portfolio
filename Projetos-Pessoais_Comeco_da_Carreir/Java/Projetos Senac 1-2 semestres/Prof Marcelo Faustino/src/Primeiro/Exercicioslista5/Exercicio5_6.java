package Exercicioslista5;
import java.util.Scanner;

public class Exercicio5_6{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String nome, descicao, frequencia;
        Float nota_minima;
        int i, cont_cad;

        System.out.print("Informe a quantidade de cadastros: ");
        cont_cad = in.nextInt();

        i=0;
        while(i<cont_cad){
            //Cadastra as materias
            System.out.print("\nInforme o nome da materia: ");
            nome = in.next();
            System.out.print("Informe a descricao da materia: ");
            descicao = in.next();
            System.out.print("Informe a frequencia minima: ");
            frequencia = in.next();
            System.out.print("Informe a nota minima para aprovacao: ");
            nota_minima = in.nextFloat();

            //Imprimi as materias cadastradas
            System.out.println("\nNome: "+nome);
            System.out.println("Descricao: "+descicao);
            System.out.println("Frequencia minima: "+frequencia);
            System.out.println("Nota minima: "+nota_minima);            
        i++;
        }
    }
}