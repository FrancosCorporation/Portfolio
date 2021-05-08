package Exercicioslista5;
import java.util.Scanner;

public class Exercicio5_3{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int i=100;
        
        //IMPRIMI DE 1 a 100
        while(i>=1){
            if(i%2==0){
                System.out.print("\n"+i);
            }
            i--;
        }
    }
}