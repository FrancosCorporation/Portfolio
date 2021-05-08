package ListasTestes;
import java.util.Scanner;

public class Novo {

	public static void main(String [] args ) {

	//Declaracao de Variaveis
	int n1, result;
	String rosca;
	Scanner leia = new Scanner (System.in);
	
	
	System.out.print ("Este programa te perguntara algumas coisas (responda com sim ou nao) !!\n ");
	System.out.print ("Voce gosta de rosquinha ?");
	rosca = leia.nextLine();

	if(rosca.contentEquals("Sim") | rosca.contentEquals("sim")) {
	System.out.println("Se voce quer rosquinha voce tera ");
	}
	else  {
		System.out.println("como pode recusar uma rosquinha?  ");
		}
	
}
	
}
