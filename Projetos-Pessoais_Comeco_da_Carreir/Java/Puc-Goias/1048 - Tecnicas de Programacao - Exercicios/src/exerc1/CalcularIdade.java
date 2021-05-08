package exerc1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class CalcularIdade {
 private Date dataAtual;
 
 public static void main(String [] args) {
	Pessoa p1= new Pessoa();
	p1.returnDate(p1);
   try {
	int idade = p1.retornaIdade(p1.getDataNascimento());
	JFrame telainfo = new JFrame();
	telainfo.setSize(200, 200);
	JTextPane txt= new JTextPane();
	txt.setText("Nome: "+p1.getNome()+"\nIdade: "+idade+" Anos.\nAltura: "+p1.getAltura()+"\nData Nsc: "+p1.getDataNascimento());
	telainfo.add(txt);
	telainfo.setVisible(true);
	telainfo.setLocationRelativeTo(null);
	telainfo.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent  e) {
			System.exit(0);
		}
	});
} catch (IOException e) {
	e.printStackTrace();
}
	 
 }
	
	
}
