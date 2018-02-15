package br.com.caelum;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.deposita(1000);
		cp.deposita(1000);
		
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
