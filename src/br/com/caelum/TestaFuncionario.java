package br.com.caelum;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ze", "TI", "12.345.678-9", "22/10/2015", 3200);
		
		System.out.println(f1);
		
		f1.recebeAumento(500);
		
		System.out.println(f1);
		System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
	}
	
}
