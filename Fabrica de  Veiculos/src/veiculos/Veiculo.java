package veiculos;

public class Veiculo {
	private String Cor;
	private String nome;
	private int numChassi;
	private int ano;
	
	public Veiculo() {
	}

	public Veiculo(String Cor, String nome, int numChassi, int ano) {
		super();
		this.Cor = Cor;
		this.nome = nome;
		this.numChassi = numChassi;
		this.ano = ano;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String Cor) {
		this.Cor = Cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumChassi() {
		return numChassi;
	}

	public void setNumChassi(int numChassi) {
		this.numChassi = numChassi;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void venderVeiculo(Veiculo veiculo) {
	}

}
