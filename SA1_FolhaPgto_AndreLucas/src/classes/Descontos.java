package classes;

public class Descontos {
	
	//Atributos da classe
	private double INSS;
	private double VT;
	private double VA;
	private double Medico;

	//Construtor padrão
	public Descontos() {
		
	}
	
	//Construtor usando atributos
	public Descontos(double iNSS, double vT, double vA, double medico) {
		super();
		INSS = iNSS;
		VT = vT;
		VA = vA;
		Medico = medico;
	}

	//Getters e Setters
	public double getINSS() {
		return INSS;
	}

	public void setINSS(double d) {
		INSS = d;
	}

	public double getVT() {
		return VT;
	}

	public double setVT(double d) {
		return VT = d;
	}

	public double getVA() {
		return VA;
	}

	public void setVA(double d) {
		VA = d;
	}

	public double getMedico() {
		return Medico;
	}

	public void setMedico(double d) {
		Medico = d;
	}
	
	
}
