package Principal;

import Animal.Cachorro;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.setNome("Anubs");
		dog.setRaca("Pastor Belga");
		dog.late("Sim");
System.out.println(dog.toString(dog.late(" Sim")));
	}

}
