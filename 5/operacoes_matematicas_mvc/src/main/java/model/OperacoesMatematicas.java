package model;

public class OperacoesMatematicas {

	private int numero1, numero2, numero3;
	
	public OperacoesMatematicas(int numero1, int numero2, int numero3) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
	}

	public int getSum() {
		return numero1+numero2+numero3;
	}
	
	public int getSubtraction() {
		return numero1-numero2-numero3;
	}
	
	public int getMultiplication() {
		return numero1*numero2*numero3;
	}
	
	public int getDivision() {
		return numero1/numero2/numero3;
	}
	
	public int getRest() {
		return numero1%numero2%numero3;
	}
	
	
}
