package Exercicioslista5;
import java.util.Scanner;

public class Exercicio5_4{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int i, soma;

        i=2;
        soma=1;
        //Soma o resultado + os numeros em ordem crescente de 0 a 10
        while(i<=10){
            soma=soma+i;
            if (i>=2 && i<=9) {
            System.out.println(+soma+" Esta foi a soma com o numero: " +i);
            }
            if (i==10) {
            	System.out.println("este programa acabou");
            }
            i++;
        }
        //Imprimi a soma total
        System.out.print("Soma total: "+soma);
 
}}