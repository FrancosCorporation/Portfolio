package Segundo.Exercicios;

public class Funcionario{
private int id;
private int cpf;
private String nome;
private String rg;
private String salario;

public Funcionario(int id){
this.id = id;
}

public Funcionario(int id, String nome, String salario){
this.nome = nome;
this.id = id;
this.salario = salario;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setNome(int id){
this.id = id;
}

public String getNome(){
return nome;
}

public void setCpf(int cpf){
this.cpf = cpf;
}

public int getCpf(){
return cpf;
}

public void setRg(String rg){
this.rg = rg;
}

public String getRg(){
return rg;
}

public void setSalario(String salario){
this.salario = salario;
}

public String getSalario(){
return salario;
}

public String toString(){
  return "Id: "+id+"\nNome: "+nome+"\nCpf: "+cpf+"\nRg: "+rg+"\nSalario: "+salario;
}
}
