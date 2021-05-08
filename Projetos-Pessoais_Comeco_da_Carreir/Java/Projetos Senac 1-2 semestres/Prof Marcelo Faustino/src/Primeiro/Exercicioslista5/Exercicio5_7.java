package Exercicioslista5;
import java.util.Scanner;

public class Exercicio5_7{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String nome;
        int cpf, dependentes, i, cont_cad;
        
        System.out.print("Digite a quantidade de cadastros que deseja fazer: ");
        cont_cad = in.nextInt();

        i=0;
        while(i<cont_cad){
            System.out.print("\nDigite o nome do contribuinte: ");
            nome = in.next();
            System.out.print("Digite o CPF: ");
            cpf = in.nextInt();
            System.out.print("Digite a renda anual: R$ ");
            Double renda_anual = in.nextDouble();
            System.out.print("Digite a quantidade de dependentes: ");
            dependentes = in.nextInt();

            //Primeiro calculo
            Double desconto;
            desconto = dependentes*110.00;

            //Segundo calculo
            Double renda_liquida;
            renda_liquida = renda_anual-desconto;

            //Terceiro calculo
            Double aliquota;
            aliquota=0.0;
            
            System.out.println("\nNome: "+nome);
            System.out.println("CPF: "+cpf);
            System.out.println("Renda anual: R$ "+renda_anual);
            System.out.println("Quantidade de dependentes: "+dependentes);

            if(renda_liquida<=900.00){
                //Caso seja isento
                System.out.println("Valor da contribuicao: Isento");
            }else if(renda_liquida<=5000.00){
                aliquota = (renda_liquida*5)/100;
            }else if(renda_liquida<=10000.00){
                aliquota = (renda_liquida*10)/100;
            }else if(renda_liquida>=10000.01){
                aliquota = (renda_liquida*15)/100;
            }            
            if(renda_liquida>900.00){
                //Caso nao seja isento
                System.out.println("Valor de contribuicao: R$ "+aliquota);
            }
            i++;
        }


    }
}