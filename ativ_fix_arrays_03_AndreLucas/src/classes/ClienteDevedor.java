package classes;

public class ClienteDevedor extends Cliente{

	private double Divida;
	
	//Construtor
	public ClienteDevedor() {
		
	}
	
	//Construtor
	public ClienteDevedor(String nome, int cpf, String cidade, String bairro, String rua, int numero, int telefone,
			String email, String tipo, Double saldo, double divida) {
		super(nome, cpf, cidade, bairro, rua, numero, telefone, email, tipo, saldo);
		Divida = divida;
	}

	//Getters e Setters
	public double getDivida() {
		return Divida;
	}
	public void setDivida(double divida) {
		Divida = divida;
	}
	
}
