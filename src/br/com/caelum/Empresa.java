package br.com.caelum;

public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private static int numEmpregados = 0;
	
	public Empresa(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.empregados = new Funcionario[10];
	}	
	
	public void adiciona (Funcionario f) {
		numEmpregados++;
		
		if(numEmpregados == empregados.length) {
			Funcionario[] aux = new Funcionario[empregados.length + 10];
			
			for(int i = 0; i < empregados.length; i++) {
				aux[i] = empregados[i];
			}
			
			empregados = aux;
		}
				
		empregados[numEmpregados-1] = f;		
	}
	
	public void mostraEmpregados() {
		System.out.println(this);
	}
	
	public boolean contem(Funcionario f) {
		for(int i = 0; i < empregados.length; i++) {
			if(empregados[i] == f)
				return true;
		}
		
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}

	public static int getNumEmpregados() {
		return numEmpregados;
	}
	
	@Override
	public String toString() {
		String answer = "Empresa " + this.nome 
				+ "\nCnpj: " + this.cnpj
				+ "\nNumero de Funcionários: " + Empresa.numEmpregados;
		
		for(int i = 0; i < numEmpregados; i++) {
			answer += "\n" + empregados[i].toString();
		}
		
		return answer;
	}
}
