package veiculos;

public class Moto extends Veiculo {

	private String tipo;
	private int motorizacao;
	private String modelo;
	
	public Moto() {
		super();
	}

	public Moto(String cor, String nome, int numChassi, int ano, String tipo, int motorizacao, String modelo) {
		super(cor, nome, numChassi, ano);
		this.tipo = tipo;
		this.motorizacao = motorizacao;
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(int motorizacao) {
		this.motorizacao = motorizacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String exibirDados(){
		return "Nome: "+this.getNome()+
				"\nCor: "+this.getCor()+
				"\nNúmero do Chassi: "+this.getNumChassi()+
				"\nAno: "+this.getAno()+
				"\nTipo: "+this.getTipo()+
				"\nMotorização: "+this.getMotorizacao()+
				"\nModelo: "+this.getModelo();
	}
}
