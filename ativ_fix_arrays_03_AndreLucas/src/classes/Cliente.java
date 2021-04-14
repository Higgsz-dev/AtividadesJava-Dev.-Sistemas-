package classes;

import java.util.ArrayList;

public class Cliente {
	
	private String Nome;
	private int Cpf;
	private String Cidade;
	private String Bairro;
	private String Rua;
	private int Numero;
	private int Telefone;
	private String Email;
	private String Tipo;
	private double Saldo;
	
	//Metodo construtor
	public Cliente() {
		
	}
	
	//Metodo Construtor
	public Cliente(String nome, int cpf, String cidade, String bairro, String rua, int numero, int telefone, String email, String tipo, Double saldo) {
		super();
		Nome = nome;
		Cpf = cpf;
		Cidade = cidade;
		Bairro = bairro;
		Rua = rua;
		Numero = numero;
		Telefone = telefone;
		Email = email;
		Tipo = tipo;
	}
	
	//Getter e Setters
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getCpf() {
		return Cpf;
	}
	public void setCpf(int cpf) {
		Cpf = cpf;
	}
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

	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	//Arraylist para armazenar os cliente
	ArrayList listCliente = new ArrayList();
	ArrayList listClienteEspecial = new ArrayList();
	ArrayList listClienteDevedor = new ArrayList();
	
	//Metodo para adicionar clientes a lista
	public void cadastroCliente(Cliente cliente) {
		listCliente.add(cliente);
		System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
	}
	public void cadastroClienteEspecial(Cliente cliente) {
		listClienteEspecial.add(cliente);
	}
	public void cadastroClienteDevedor(Cliente cliente) {
		listClienteDevedor.add(cliente);
	}
	
	//Metodo para mostrar dados
	public void Exibeclientes() {
		for(int i=0; i<listCliente.size(); i++) {
			if(listCliente.get(i) instanceof Cliente) {
				Cliente cliente = (Cliente) listCliente.get(i);
				System.out.println("Nome do cliente: "+cliente.getNome());
				System.out.println("CPF do cliente: "+cliente.getCpf());
				System.out.println("===ENDEREÇO===");
				System.out.println("Cidade: "+cliente.getCidade());
				System.out.println("Bairro: "+cliente.getBairro());
				System.out.println("Rua: "+cliente.getRua());
				System.out.println("Numero: "+cliente.getNumero());
				System.out.println("==CONTATO===");
				System.out.println("Telefone: "+cliente.getTelefone());
				System.out.println("Email: "+cliente.getEmail());
				System.out.println("===INFORMAÇÕES SOBRE===");
				System.out.println("Tipo do cliente: "+cliente.getTipo());
				System.out.println("Saldo: "+cliente.getSaldo());
				System.out.println("");
			}else if(listCliente.get(i) instanceof ClienteEspecial) {
				ClienteEspecial especial = (ClienteEspecial) listCliente.get(i);
				System.out.println("Nome do cliente: "+especial.getNome());
				System.out.println("CPF do cliente: "+especial.getCpf());
				System.out.println("===ENDEREÇO===");
				System.out.println("Cidade: "+especial.getCidade());
				System.out.println("Bairro: "+especial.getBairro());
				System.out.println("Rua: "+especial.getRua());
				System.out.println("Numero: "+especial.getNumero());
				System.out.println("==CONTATO===");
				System.out.println("Telefone: "+especial.getTelefone());
				System.out.println("Email: "+especial.getEmail());
				System.out.println("===INFORMAÇÕES SOBRE===");
				System.out.println("Tipo do cliente: "+especial.getTipo());
				System.out.println("Saldo: "+especial.getSaldo());
				System.out.println("Limite especial: "+especial.getSaldo());
				System.out.println("");
			}else if(listCliente.get(i) instanceof ClienteDevedor) {
				ClienteDevedor devedor = (ClienteDevedor) listCliente.get(i);
				System.out.println("Nome do cliente: "+devedor.getNome());
				System.out.println("CPF do cliente: "+devedor.getCpf());
				System.out.println("===ENDEREÇO===");
				System.out.println("Cidade: "+devedor.getCidade());
				System.out.println("Bairro: "+devedor.getBairro());
				System.out.println("Rua: "+devedor.getRua());
				System.out.println("Numero: "+devedor.getNumero());
				System.out.println("==CONTATO===");
				System.out.println("Telefone: "+devedor.getTelefone());
				System.out.println("Email: "+devedor.getEmail());
				System.out.println("===INFORMAÇÕES SOBRE===");
				System.out.println("Tipo do cliente: "+devedor.getTipo());
				System.out.println("Saldo: "+devedor.getSaldo());
				System.out.println("Divida: "+devedor.getDivida());
				System.out.println(" ");
			}
		}
	}
	

}
