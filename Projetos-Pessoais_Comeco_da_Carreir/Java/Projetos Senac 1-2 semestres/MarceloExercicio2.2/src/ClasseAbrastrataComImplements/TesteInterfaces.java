package ClasseAbrastrataComImplements;

import java.sql.Date;

public class TesteInterfaces {

	public static void main(String[] args) {
		Triatleta tri = new Triatleta("Joao Antonio, ");
		
		tri.setDataNascimento(new Date(119,0,2));
		tri.setEndereco("Rua 2");
		tri.aquecer();
		tri.alongar();
		tri.andar();
		tri.competir();
		tri.correrDeBicicleta();
		tri.nadar();
		System.out.println(tri.getDataNascimento());
		System.out.println(tri.getEndereco());

	}

}
