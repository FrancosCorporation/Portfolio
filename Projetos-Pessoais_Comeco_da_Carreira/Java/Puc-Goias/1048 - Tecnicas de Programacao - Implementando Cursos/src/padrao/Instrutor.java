package padrao;

public class Instrutor{
    private String nomeInstrutor;
    
    public Instrutor(String nome) {
    	this.nomeInstrutor = nome;
    }

	public String getNomeInstrutor() {
		return nomeInstrutor;
	}

	public void setNomeInstrutor(String nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}
	
	public void imprimi() {
		System.out.println("Nome do instrutor: "+getNomeInstrutor());
	}
    
}
