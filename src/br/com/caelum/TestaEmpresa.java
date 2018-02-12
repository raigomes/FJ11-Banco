package br.com.caelum;

public class TestaEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa e1 = new Empresa("Accenture", "123.456.789-0001");
		
		for(int i = 0; i < 10; i++) {
			Funcionario f = new Funcionario("Funcionario "+i, "TI", "12.345.678-"+i, "22/10/2015", 900*(i+1));
			e1.adiciona(f);
		}
		
		e1.adiciona(new Funcionario("Zé", "RH", "", "12/02/2018", 2000));
		
		e1.mostraEmpregados();
	}

}
