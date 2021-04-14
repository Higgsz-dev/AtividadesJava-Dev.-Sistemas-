package classes;

public class ClienteEspecial extends Cliente{
	
	private double SaldoEspecial;


	//Contrutor padrão
	public ClienteEspecial() {
		
	}
	
	//Construtor
	public ClienteEspecial(String nome, int cpf, String cidade, String bairro, String rua, int numero, int telefone,
			String email, String tipo, Double saldo, double saldoEspecial) {
		super(nome, cpf, cidade, bairro, rua, numero, telefone, email, tipo, saldo);
		SaldoEspecial = saldoEspecial;
	}
	
	//Getters e Setters
	public double getSaldoEspecial() {
		return SaldoEspecial;
	}
	public void setSaldoEspecial(double saldoEspecial) {
		SaldoEspecial = saldoEspecial;
	}
	
}
