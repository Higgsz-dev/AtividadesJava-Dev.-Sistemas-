package application;

public class Carro {

	public String nome;
	public String cor;
	public String modelo;
	public String motorizacao;
	public int numChassi;
	
	public String toString() {
		return nome
				+ "Cor: " + cor
				+ "Modelo: " + modelo
				+ "Motoriza��o: "+ motorizacao
				+ "Num chassi: "+ numChassi;
		

	}

}
