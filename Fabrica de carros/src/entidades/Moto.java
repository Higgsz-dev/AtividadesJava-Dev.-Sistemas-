package entidades;

public class Moto extends Veiculo{
	
	private String nome;
	private int ocupantes;
	
	public Moto() {
		super();
	}

	public Moto(String cor, String ano, String modelo, String placa, String nome, int ocupantes) {
		super(cor, ano, modelo, placa);
		this.nome = nome;
		this.ocupantes = ocupantes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getOcupantes() {
		return ocupantes;
	}

	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}
	
	
	
}
