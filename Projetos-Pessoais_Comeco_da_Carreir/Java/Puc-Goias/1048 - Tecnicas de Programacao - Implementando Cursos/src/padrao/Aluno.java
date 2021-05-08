package padrao;

public class Aluno {
    private String nomeAluno;
    private String matricula;
    
    
    public Aluno(String nome, String matricula) {
    	this.nomeAluno = nome;
    	this.matricula = matricula;
    }
    
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void imprimi() {
		System.out.println("Nome do Aluno: "+getNomeAluno()+"\nMatricula: "+getMatricula());
	}
    

}
