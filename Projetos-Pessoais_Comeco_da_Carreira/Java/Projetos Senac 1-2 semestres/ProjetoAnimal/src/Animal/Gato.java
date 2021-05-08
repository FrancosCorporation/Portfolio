package Animal;

public class Gato extends Animal{
	
	public String mia() {
		String m = "miando";
		return m;
	}

	@Override
	public String toString() {
		return super.toString()+ "Gato mia=" + mia();
	}

}
