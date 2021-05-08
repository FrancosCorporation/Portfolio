package ExemplosCapitulo11;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class DividindoPorZero {

	
	public static int divisao(int numerador, int denominador) throws ArithmeticException{
		
		
		return numerador/denominador;
		
	}
	public static void main(String args[]) {
		boolean continuar;
		do {
		try {
		JOptionPane.showMessageDialog(null, "Este programa ira fazer uma divisão.");
		int numerador= Integer.parseInt(JOptionPane.showInputDialog("Insira o numerador"));
		int denominador= Integer.parseInt(JOptionPane.showInputDialog("Insira o denominador"));
		JOptionPane.showMessageDialog(null, "O resultado foi: "+divisao(numerador, denominador));
		continuar=false;
		}
		catch(InputMismatchException e) {
			JOptionPane.showMessageDialog(null, "Voce digitou uma letra.");
		    continuar=true;
		}
		catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Divisão invalida, verifique os numeros para que não tenha inserido 0.");
		    continuar=true;}
		catch (NumberFormatException e) {
			if(e.getCause()==null)
			JOptionPane.showMessageDialog(null, "Voce nao inseriu nada.");
		    continuar=true;}
		/*if(e.("^[a-Z]"))
			JOptionPane.showMessageDialog(null, "Voce digitou letras. Insira numeros.");
		    continuar=true;} */
		    
		    
		catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			    continuar=true;}
		finally {
			JOptionPane.showMessageDialog(null, "Eu sou o uso do Bloco finally. hehe.");
		}
		}while(continuar);
		
		}
}
