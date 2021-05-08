package teste;

public class CriandoFelinos {
	
	class Animal{
		public void eat() {
			System.out.println("Animal come.");
		}
	}
	class Felino extends Animal{
		public void eat() {
			System.out.println("Felino come.");
		}
		public void hunts() {
			System.out.println("Felino caça.");
		}
	}
	class Gato extends Animal{
		public void eat() {
			System.out.println("Gato come.");
		}
	}
public static class Dispatch{
	public static void main(String[] args) {
	Felino a = new Felino();
	Gato g = new Gato();
	
	a.eat();
	a.hunts();
	g.eat();
	g.hunts();
   
	}

}
}