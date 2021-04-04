package classes;

public class Funcionario extends Descontos{

	//Atributos da classe
	private String Nome;
	private String Cargo;
	private int CargaHoraria;
	private double Salario;
	private float ValorDia;
	private boolean Trabalhou;
	private int DiasTrab;
	private double Result;
	private int Intervalo;
	private Endereco endereco;
	
	//Construtor Padrão
	public Funcionario() {
		super();
	}

	//Construtor com Atributos e herança
	public Funcionario(int iNSS, int vT, int vA, int medico, String nome, String cargo, int cargaHoraria,
			double salario, float valorDia, boolean trabalhou, int diastrab, int intervalo, Endereco endereco) {
		super(iNSS, vT, vA, medico);
		Nome = nome;
		Cargo = cargo;
		CargaHoraria = cargaHoraria;
		Salario = salario;
		ValorDia = valorDia;
		Trabalhou = trabalhou;
		DiasTrab = diastrab;
		Intervalo = intervalo;
		this.endereco = endereco;
	}

	//Getters e Setters
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public int getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public float getValorDia() {
		return ValorDia;
	}

	public void setValorDia(float valorDia) {
		ValorDia = valorDia;
	}

	public boolean isTrabalhou() {
		return Trabalhou;
	}

	public int getDiasTrab() {
		return DiasTrab;
	}

	public void setDiasTrab(int diasTrab) {
		DiasTrab = diasTrab;
	}

	public void setTrabalhou(boolean trabalhou) {
		Trabalhou = trabalhou;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
		

	public int getIntervalo() {
		return Intervalo;
	}

	public void setIntervalo(int intervalo) {
		Intervalo = intervalo;
	}

	//Metood para mostrar dados 
	public String exibirDados() {
		return  " "+
				"\n======Folha de Pagamento======"+
				"\nNome: "+this.getNome()+
				"\nCargo: "+this.getCargo()+
				"\nCaraga Horaria esperada: "+this.getCargaHoraria()+
				"\nSalário: "+this.getSalario()+
				"\nDias trabalhados: "+this.getDiasTrab()+
				"\n======Descontos======"+
				"\nINSS: "+this.getINSS()+
				"\nVale Transporte: "+this.getVT()+
				"\nVale Aliemntação: "+this.getVA()+
				"\nMédico: "+this.getMedico()+
				"\n======Salário Líquido======"+
				"\nR$ ";
	}
	
	//Metodo para efetuar descontos no salario
		public double descontos(double result) {
			return 
					result = this.getSalario()-(this.getINSS()+this.getVT()+this.getVA()+this.getMedico());
		}
}
