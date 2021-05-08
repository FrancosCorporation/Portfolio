package ClasseAbrastrataComImplements;

public class Triatleta extends Pessoa implements Ciclistas, Nadadores, Corredores{
  public Triatleta(String nome) {
	  this.setNome(nome);
  }
  public void correrDeBicicleta() {
	  System.out.println(this.getNome()+"Estou Correndo de Bicicleta.. ");
  }
@Override
public void aquecer() {
	System.out.println(this.getNome()+"Estou Aquecendo..");
	
}
@Override
public void alongar() {
	System.out.println(this.getNome()+"Estou Alongando..");
	
}
@Override
public void competir() {
	System.out.println(this.getNome()+"Estou Competindo..");
	
}
@Override
public void correr() {
	System.out.println(this.getNome()+"Estou Correndo..");
	
}
@Override
public void nadar() {
	System.out.println(this.getNome()+"Estou Nadando..");
	
}
}
