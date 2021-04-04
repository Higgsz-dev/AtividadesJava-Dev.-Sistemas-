package classes;

public class Endereco {

	//Atributos da classe
	private String Cidade;
	private String Bairro;
	private String Rua;
	private int Numero;
	private String Complemento;
	
	//Construtor padrão
	public Endereco() {
		
	}

	//Construtor usando atributos
	public Endereco(String cidade, String bairro, String rua, int numero, String complemento) {
		super();
		Cidade = cidade;
		Bairro = bairro;
		Rua = rua;
		Numero = numero;
		Complemento = complemento;
	}

	//Getters e Setters
	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	
	
	
}
