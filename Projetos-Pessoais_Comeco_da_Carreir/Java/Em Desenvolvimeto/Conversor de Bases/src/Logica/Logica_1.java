package Logica;

import FrontEnd.NewFrontEnd;

public class Logica_1 extends NewFrontEnd {
	private String binario;
	private String hexadecimal;
	private int hexa;
	private String octal;

	public String getBinario() {
		return binario;
	}

	public void setBinario(String f) {
		this.binario = f;
	}

	public String getHexadecimal() {
		return hexadecimal;
	}

	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}

	public int getDecimal() {
		return hexa;
	}

	public void setDecimal(int decimal) {
		this.hexa = decimal;
	}

	public String getOctal() {
		return octal;
	}

	public void setOctal(String octal) {
		this.octal = octal;
	}

	// as funcoes nada mais fazem do que receber um valor e setar nos seus devidos
	// gets e sets
	// e fazem as conversoes para binario hexadecimal octal e decimal a partir de
	// uma delas
	public void funcaoBinarioResto(String n) {
		int binario = Integer.parseInt(n, 2);
		String hexa = Integer.toHexString(binario);
		String octal = Integer.toOctalString(binario);
		setDecimal(binario);
		setHexadecimal(hexa);
		setOctal(octal);

	}

	public void funcaoOctalResto(String n) {
		int octal = Integer.parseInt(n, 8);
		String hexa = Integer.toHexString(octal);
		String binario = Integer.toBinaryString(octal);
		setBinario(binario);
		setHexadecimal(hexa);
		setDecimal(octal);
	}

	public void funcaoDecimalResto(String n) {
		int decimal = Integer.parseInt(n);
		String hexa = Integer.toHexString(decimal);
		String binario = Integer.toBinaryString(decimal);
		String octal = Integer.toOctalString(decimal);
		setBinario(binario);
		setHexadecimal(hexa);
		setOctal(octal);

	}

	public void funcaoHexadecimalResto(String n) {
		int hexa = Integer.parseInt(n, 16);
		String binario = Integer.toBinaryString(hexa);
		String octal = Integer.toOctalString(hexa);
		setDecimal(hexa);
		setBinario(binario);
		setOctal(octal);

	}

}
