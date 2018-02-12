package br.com.caelum;

public class Data {
	int dia, mes, ano;
	public static final int JAN = 1;
	public static final int FEV = 2;
	public static final int MAR = 3;
	public static final int ABR = 4;
	public static final int MAI = 5;
	public static final int JUN = 6;
	public static final int JUL = 7;
	public static final int AGO = 8;
	public static final int SET = 9;
	public static final int OUT = 10;
	public static final int NOV = 11;
	public static final int DEZ = 12;
	
	public Data(String data, String formato) {		 
		String[] vetor;
		Data d1 = null;
		
		try {
			switch(formato.toLowerCase()) {
			 	case "ddmmyyyy" :
			 		vetor = data.split("/");
			 		d1 = new Data (Integer.parseInt(vetor[0]), 
			 				Integer.parseInt(vetor[1]), 
			 				Integer.parseInt(vetor[2]));
			 		break;
			 	case "yyyymmdd" :
			 		vetor = data.split("/");
			 		d1 = new Data (Integer.parseInt(vetor[2]), 
			 				Integer.parseInt(vetor[1]), 
			 				Integer.parseInt(vetor[0]));
			 		break;
			 	case "dd-mm-yyyy" :
			 		vetor = data.split("-");
			 		d1 = new Data (Integer.parseInt(vetor[0]), 
			 				Integer.parseInt(vetor[1]), 
			 				Integer.parseInt(vetor[2]));
			 		break;
			 	case "yyyy-mm-dd" :
			 		vetor = data.split("-");
			 		d1 = new Data (Integer.parseInt(vetor[2]), 
			 				Integer.parseInt(vetor[1]), 
			 				Integer.parseInt(vetor[0]));
			 		break;
			 	default:
			 		System.err.println("Formato " + formato + " inválido");
			 		System.exit(0);
			}
			
			if(validaData(d1)) {
				this.dia = d1.dia;
				this.mes = d1.mes;
				this.ano = d1.ano;
			}
			else {
				System.err.println("Data " + data + " inválida");
				System.exit(0);
			}
		}
		catch(NumberFormatException ex) {
			System.err.println("Data " + data + " inválida");
			System.exit(0);
		}
			
	}	

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	private boolean validaData(Data data) {
		boolean tof = false;
		
		if (data != null && data.ano > 1900) {
			switch (data.mes) {
				case Data.JAN:
				case Data.MAR:
				case Data.MAI:
				case Data.JUL:
				case Data.AGO:
				case Data.OUT:
				case Data.DEZ:
					tof = (data.dia >= 1 && data.dia <= 31);
					break;
				case Data.ABR:
				case Data.JUN:
				case Data.SET:
				case Data.NOV:
					tof = (data.dia >= 1 && data.dia <= 30);
					break;
				case Data.FEV:
					tof = (data.dia >= 1 && data.dia <= 29);
					break;
			}
		}
		
		return tof;
		
	}
	
	@Override
	public String toString() {		
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
