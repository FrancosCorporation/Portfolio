package padrao;

public class Principal {

	public static void main(String[] args) {
		Instrutor instrutorJava[] = new Instrutor[1];
		Instrutor instrutorAndroid[] = new Instrutor[1];
		Aluno alunoJava[] = new Aluno[4];
		Aluno alunoAmbos[] = new Aluno[2];
		Aluno alunoAndroid[] = new Aluno[4];
		Curso cursos[] = new Curso[3];
		
		alunoAmbos[0] = new Aluno("Ana", "1001");
		alunoAmbos[1] = new Aluno("Jose", "1002");
		alunoJava[0] = alunoAndroid[0]= alunoAmbos[0];
		alunoAndroid[1] = alunoJava[1]= alunoAmbos[1] ;
		
		instrutorJava[0] = new Instrutor("Felipe");
		alunoJava[2] = new Aluno("Nelson", "1003");
		alunoJava[3] = new Aluno("Jaqueline", "1004");
		cursos[0] = new Curso("Java", "30H");
		cursos[0].setAlunos(alunoJava);
		cursos[0].setInstrutor(instrutorJava);

		instrutorAndroid[0] = new Instrutor("Ivan");
		alunoAndroid[2] = new Aluno("Thais", "1005");
		alunoAndroid[3] = new Aluno("Jhon", "1006");
		cursos[1] = new Curso("Android", "20H");
		cursos[1].setAlunos(alunoAndroid);
		cursos[1].setInstrutor(instrutorAndroid);
		
		cursos[2] = new Curso("", "");
		cursos[2].setAlunos(alunoAmbos);

		cursos[0].imprimi();
		System.out.println("\n");
		cursos[1].imprimi();

		System.out.println("\nAlunos de Ambos os cursos: ");
		cursos[2].imprimi();
	}

}
