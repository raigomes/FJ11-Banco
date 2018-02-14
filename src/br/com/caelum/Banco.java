package br.com.caelum;

public class Banco {
	private Conta[] contas;
	private int numContas;
	
	public Banco() {
		// TODO Auto-generated constructor stub
		this.contas = new Conta[10];
		this.numContas = 0;
	}
	
	public void adiciona(Conta c) {
		numContas++;
		
		if (numContas == contas.length) {
			Conta[] aux = new Conta[contas.length + 10];
			
			for(int i = 0; i < contas.length; i++)
				aux[i] = contas[i];
			
			contas = aux;
		}
			
		contas[numContas-1] = c;
		
	}
	
	public Conta pegaConta(int x) {
		try {
			return contas[x];
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("Conta inválida");
			System.exit(0);
			return null;
		}
	}
	
	public int pegaTotalDeContas() {
		return this.numContas;
	}
}
