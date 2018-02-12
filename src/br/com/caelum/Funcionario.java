package br.com.caelum;

public class Funcionario {
	private String nome;
	private String departamento;
	private String RG;
	private Data dataAdmissao;
	private double salario;
	private boolean estaNaEmpresa;
	
	public Funcionario(String nome, String departamento, String rG, String dataAdmissao, double salario) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		RG = rG;
		this.dataAdmissao = new Data(dataAdmissao, "ddmmyyyy");
		admite(salario);	
	}
	
	public void admite(double salario) {
		this.estaNaEmpresa = true;
		this.salario = salario;
	}
	
	public void demite () {
		this.estaNaEmpresa = false;
	}
	
	public boolean estaNaEmpresa() {
		return estaNaEmpresa;
	}

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	public double calculaGanhoAnual() {
		return this.salario * 13.3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getDataAdmissao() {
		return dataAdmissao.toString();
	}

	public double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		return "\n\nNome = " + this.nome 
				+ "\nDepartamento = " + this.departamento
				+ "\nData de Admissão = " + this.dataAdmissao 
				+ "\nSalario = " + this.salario;
	}
}
