package br.com.caelum;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		super();
		this.selic = selic;
	}
	
	public void roda(Conta c) {
		System.out.println("Saldo Anterior: R$ " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo Final: R$ " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
}
