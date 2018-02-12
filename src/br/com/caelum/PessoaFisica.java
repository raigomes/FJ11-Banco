package br.com.caelum;

public class PessoaFisica {
	private String cpf;

	public PessoaFisica(String cpf) {
		super();
		
		if(valida(cpf))
			this.cpf = cpf;
		else {
			System.err.println("CPF inválido");
			System.exit(0);
		}
			
	}

	private boolean valida(String cpf) {
		// TODO Auto-generated method stub
		return (cpf.length() == 11);
	}
	
	
}
