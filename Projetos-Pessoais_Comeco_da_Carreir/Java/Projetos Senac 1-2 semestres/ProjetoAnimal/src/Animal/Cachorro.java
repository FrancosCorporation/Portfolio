package Animal;

public class Cachorro extends Animal {
	public String late(String n) {
		return n;
		
	}

	public String toString(String n) {
		return super.toString() + ", Cachorro late =" + late(n);
	}
}
