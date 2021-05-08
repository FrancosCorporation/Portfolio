import java.util.Scanner;

public class Exer7{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    String sexo;
    int numHomem=0, numMulher=0;
    float maiorAlt=0, menorAlt=9999, altura;
    float medAltMulher=0;

    for(int i=0; i<10; i++){
        System.out.print("\nDigite o sexo da pessoa (M/F): ");
        sexo = in.next();
        System.out.print("Digite a altura da pessoa: ");
        altura = in.nextFloat();

        if(altura>maiorAlt){
            maiorAlt=altura;
        }
        if(altura<menorAlt){
            menorAlt=altura;
        }
        if(sexo.equalsIgnoreCase("F")){
            medAltMulher=medAltMulher+altura;
            numMulher++;
        }
        if(sexo.equalsIgnoreCase("M")){
            numHomem++;
        }

    }
    medAltMulher=medAltMulher/numMulher;
    System.out.printf("\nA maior altura do grupo é: %.2f metros", maiorAlt);
    System.out.printf("\nA menor altura do grupo é: %.2f metros", menorAlt);
    System.out.printf("\nA média de altura das mulheres é: %.2f metros", medAltMulher);
    System.out.printf("\nO número de homens é de %d", numHomem);
    
    
    }
}
