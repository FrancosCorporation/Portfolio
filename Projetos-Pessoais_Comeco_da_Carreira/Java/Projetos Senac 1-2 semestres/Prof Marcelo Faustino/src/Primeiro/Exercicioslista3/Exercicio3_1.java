package Exercicioslista3;
import java.util.Scanner;
public class Exercicio3_1 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float n1, turma1, n2, turma2, n3, turma3, media;
		String nome1, nome2, nome3, disc1, disc2, disc3 ;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa ira colocar a ordem arentimetica das notas insira as informacoes desejadas.\n ");
	//aluno 1	
		System.out.print("Digite aqui o nome do 1 aluno: ");
		nome1 = leia.nextLine();
		System.out.print("Digite aqui a nota do 1 aluno: ");
		n1 = leia.nextFloat();
		System.out.print("Digite aqui a disciplina do 1 aluno: ");
		disc1 = leia.next();
		System.out.print("Digite aqui a turma do 1 aluno: ");
		turma1 = leia.nextFloat();
		
		
	//aluno 2	
		System.out.print("Digite aqui o nome do 2 aluno: ");
		nome2 = leia.next();
		System.out.print("Digite aqui a nota do 2 aluno: ");
		n2 = leia.nextFloat();
		System.out.print("Digite aqui a disciplina do 2 aluno: ");
		disc2 = leia.next();
		System.out.print("Digite aqui a turma do 2 aluno: ");
		turma2 = leia.nextFloat();
	
	//aluno 3	
		System.out.print("Digite aqui o nome do 3 aluno: ");
		nome3 = leia.next();
		System.out.print("Digite aqui a nota do 3 aluno: ");
		n3 = leia.nextFloat();
		System.out.print("Digite aqui a disciplina do 3 aluno: ");
		disc3 = leia.next();
		System.out.print("Digite aqui a turma do 3 aluno: ");
		turma3 = leia.nextFloat();
		
	// calculo
		
		media = ((n1+n2+n3)/3);
		
		
		
		System.out.print("A media aritmetica e: "+media);
	// dados dos alunos	
		System.out.println("\n O nome do 1 e: " +nome1+ "\n Nota: " +n1+ "\n Disciplina: " +disc1+ "\n Turma: "+turma1 );
		System.out.println("\n O nome do 2 e: " +nome2+ "\n Nota: " +n2+ "\n Disciplina: " +disc2+ "\n Turma: "+turma2 );
		System.out.println("\n O nome do 3 e: " +nome3+ "\n Nota: " +n3+ "\n Disciplina: " +disc3+ "\n Turma: "+turma3 );

	}

}
