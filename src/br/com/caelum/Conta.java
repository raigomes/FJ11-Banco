package br.com.caelum;

public abstract class Conta {
	protected double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		if(this.saldo - valor > 0)
			this.saldo -= valor;
		else
			System.err.println("Saldo insuficiente!");
	}
	
	public abstract void atualiza(double taxaSelic);
	
	public double getSaldo() {
		return saldo;
	}
}
