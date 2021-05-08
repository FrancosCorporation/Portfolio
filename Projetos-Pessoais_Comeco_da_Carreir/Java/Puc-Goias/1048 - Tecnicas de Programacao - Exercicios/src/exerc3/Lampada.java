package exerc3;

public class Lampada {
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Lampada(boolean status) {
		if(status==true) {
		this.status = "A lampada Esta Acessa !!";
		}
		else
			this.status = "A lampada Esta Apagada !!!";
	}
}
