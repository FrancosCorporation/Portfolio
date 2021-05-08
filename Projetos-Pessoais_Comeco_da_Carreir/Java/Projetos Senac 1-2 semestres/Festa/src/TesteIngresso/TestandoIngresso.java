package TesteIngresso;

import Financeiro.CamaroteSuperior;
import Financeiro.Vip;

public class TestandoIngresso {
public static void main (String[]args) {
	Vip ingrss1= new Vip();
	ingrss1.setDinheiro(150);
	ingrss1.setValorExtra(200);
	CamaroteSuperior camarotevip = new CamaroteSuperior();
	camarotevip.setDinheiro(1000);
	camarotevip.setValorExtra(500);
	System.out.println(camarotevip.toString());
}
}
