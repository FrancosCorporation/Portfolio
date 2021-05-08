package padrao;

public class Curso{
private String nomeCurso;
private String cargaHoraria;
private Aluno alunos[];
private Instrutor instrutor[];

public Curso(String nome, String carga) {
	this.nomeCurso = nome;
	this.cargaHoraria = carga;
	this.alunos = new Aluno[4];
	this.instrutor = new Instrutor[1];
}
public Instrutor[] getInstrutor() {
	return instrutor;
}
public void setInstrutor(Instrutor[] instrutor) {
	this.instrutor = instrutor;
}
public Aluno[] getAlunos() {
	return alunos;
}
public void setAlunos(Aluno[] alunos) {
	this.alunos = alunos;
}
public String getNomeCurso() {
	return nomeCurso;
}
public void setNomeCurso(String nomeCurso) {
	this.nomeCurso = nomeCurso;
}
public String getCargaHoraria() {
	return cargaHoraria;
}
public void setCargaHoraria(String cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
}

public void imprimi() {
	if(instrutor[0]!=null) {
		System.out.println("Nome do Curso: "+getNomeCurso()+"\nCarga Horaria: "+getCargaHoraria()+"\n"+"\nNome do Instrutor: "+instrutor[0].getNomeInstrutor());
		
	}
	for (int j = 0; j < instrutor.length; j++) {
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i]==null) {
				break;
			}
			System.out.println("Nome do Aluno: "+alunos[i].getNomeAluno()+"\nMatricula: "+alunos[i].getMatricula());
		}
	}
	
	
}
}
