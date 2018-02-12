package br.com.caelum;

public class Conta {
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
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
