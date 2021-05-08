package testando;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class classe_principal {
	public static void main(String[] args) {
		
		GregorianCalendar oi = new GregorianCalendar();
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(fmt.format(oi.getTime()));
	}
}
