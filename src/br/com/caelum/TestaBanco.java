package br.com.caelum;

public class TestaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		double saldoAnterior = 0;
		
		for (int i = 0; i < 10; i++) {
			Conta c1 = new ContaCorrente();
			Conta c2 = new ContaPoupanca();
			
			c1.deposita(100 + (i*10));
			c2.deposita(100 + (i*10));
			
			banco.adiciona(c1);
			banco.adiciona(c2);
			
			saldoAnterior += c1.getSaldo() + c2.getSaldo();
		}
		
		AtualizadorDeContas ac = new AtualizadorDeContas(0.05);
		
		System.out.println("Banco do Raí\n");
		
		for(int j = 0; j < banco.pegaTotalDeContas(); j++) {
			ac.roda(banco.pegaConta(j));
		}
		
		System.out.println("\nSaldo Total = R$ " + ac.getSaldoTotal());
	}

}
