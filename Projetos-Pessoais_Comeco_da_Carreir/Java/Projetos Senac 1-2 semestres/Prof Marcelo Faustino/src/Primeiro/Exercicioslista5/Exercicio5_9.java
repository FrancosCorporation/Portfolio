package Exercicioslista5;
import java.util.Scanner;

public class Exercicio5_9 {

public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int matricula, i, m,aprovado = 0,reprovado = 0;
    float outra = 0,totalfreq,nota1, menor=10,maior = -99999,total,soma = 0, count, nota2 , nota3,frequencia, calc = 0;
    String qualidade;

    m=1;
    
    while(m<=70){
        System.out.print("\nDigite a matricula do aluno "+m+" : ");
		matricula = in.nextInt();
		System.out.print("\nDigite a primeira nota do aluno "+m+" : ");
		nota1 = in.nextInt();
		while (nota1 >10 | nota1 <0) {
    		System.out.println("Voce digitou um numero de nota invalido, digite um numero entre 0 e 10: ");
    		nota1 = in.nextInt();  }     
		System.out.print("\nDigite a segunda nota do aluno "+m+" : ");
		nota2 = in.nextInt();
		while (nota2 >10 | nota2 <0) {
    		System.out.println("Voce digitou um numero de nota invalido, digite um numero entre 0 e 10: ");
    		nota2 = in.nextInt();} 
		System.out.print("\nDigite a terceira nota do aluno "+m+" : ");
		nota3 = in.nextInt();
		while (nota3 >10 | nota3 <0) {
    		System.out.println("Voce digitou um numero de nota invalido, digite um numero entre 0 e 10: ");
    		nota3 = in.nextInt();}
		System.out.print("\nDigite a frequencia com ate 32 aulas do aluno "+m+" : ");
		frequencia = in.nextInt();
		while (frequencia >32 | nota3 <0) {
    		System.out.println("Voce digitou um numero de dias invalido, digite um numero entre 0 e 32: ");
    		frequencia = in.nextInt();}
		calc=((nota1+nota2+nota3)/3);
		outra= calc+outra;
		System.out.print("\nA matricula do aluno e: "+matricula);
		System.out.print("\nA media do aluno foi: "+calc);
		if (frequencia >25 & calc >=7) {
		System.out.print("\nO aluno foi Aprovado !!");
		aprovado = aprovado+1;}
		else {
		System.out.print("\nO aluno foi Reprovado !!");
		reprovado = reprovado+1;}
		if (calc>maior) {
			maior=calc;
		if (calc<menor) {
				menor=calc;
			}}
			m++;}
    m--;
    soma = (outra/m);
	
   System.out.print("\n\nA media de toda a turma foi "+soma);
	System.out.print("\nA maior media foi: "+maior);
	System.out.print("\nA menor media foi: "+menor);
	System.out.print("\nO numero de Aprovados foram : "+aprovado);
	System.out.print("\nO numero de Reprovados foram : "+reprovado);
}}