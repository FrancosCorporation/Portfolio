package Financeiro;

public class CamaroteSuperior extends Vip{

	@Override
	public String toString() {
		return super.getDinheiro()+" + "+ super.getValorExtra()+" = "+(super.getDinheiro()+super.getValorExtra());
	}

}
