package Exemplos1.testes;

import Exemplos1.classes.*;

public class TesteCurso {

	public static void main(String[] args) {


		Curso novoCurso = new Curso(10, "Portugues");
		
		Curso novoCurso2 = new Curso();
		novoCurso2.setCodigo(100);
		novoCurso2.setNome("Matematica");
		
		System.out.println(novoCurso);
		System.out.println(novoCurso2);
		
	

	}

}
