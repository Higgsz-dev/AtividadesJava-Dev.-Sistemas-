package aplicacao;

import java.util.Scanner;

import classes.Cliente;
import classes.ClienteDevedor;
import classes.ClienteEspecial;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Cliente cliente = new Cliente();
		ClienteEspecial clienteEspecial = new ClienteEspecial();
		ClienteDevedor clienteDevedor = new ClienteDevedor();
		
		System.out.println("======CADASTRO DE CLIENTES======");
		System.out.println("=======SELECIONE A OP��O========");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Cadastrar Cliente Especial");
		System.out.println("3 - Cadastrar Cliente Devedor");
		System.out.println("4 - Sair do sistema");
		System.out.println();
		System.out.print("Digite a op��o desejada: ");
		int opcao = scan.nextInt();
		
		while (opcao < 4) {
			//Bloco da Op��o 1
			if(opcao ==1 ) {
				System.out.print("Digita a quantidade de clientes que s�o cadastrados: ");
				int qtdCadastro = scan.nextInt();
				for(int i = 0; i<qtdCadastro; i++) {
					System.out.println("Digite o nome do cliente: ");
					cliente.setNome(scan.next());
					System.out.println("Digite o CPF: ");
					cliente.setCpf(scan.nextInt());
					System.out.println("Digite a cidade: ");
					cliente.setCidade(scan.next());
					System.out.println("Digite o bairro: ");
					cliente.setBairro(scan.next());
					System.out.println("Digite a rua: ");
					cliente.setRua(scan.next());
					System.out.println("Digite o n�mero da resid�ncia: ");
					cliente.setNumero(scan.nextInt());
					System.out.println("Digite o telefone: ");
					cliente.setTelefone(scan.nextInt());
					System.out.println("Digite o email: ");
					cliente.setEmail(scan.next());
					cliente.setTipo("Comum");
					System.out.println("Digite o saldo: ");
					cliente.setSaldo(scan.nextDouble());
					cliente.cadastroCliente(cliente);
					
					System.out.println("======CADASTRO DE CLIENTES======");
					System.out.println("=======SELECIONE A OP��O========");
					System.out.println("1 - Cadastrar Cliente");
					System.out.println("2 - Cadastrar Cliente Especial");
					System.out.println("3 - Cadastrar Cliente Devedor");
					System.out.println("4 - Sair do sistema");
					System.out.println();
					System.out.print("Digite a op��o desejada: ");
					opcao = scan.nextInt();
				}
			}
			
			//Bloco op��o 2
			if(opcao ==2 ) {
				System.out.print("Digita a quantidade de clientes que s�o cadastrados: ");
				int qtdCadastro = scan.nextInt();
				for(int i = 0; i<qtdCadastro; i++) {
					System.out.println("Digite o nome do cliente: ");
					clienteEspecial.setNome(scan.next());
					System.out.println("Digite o CPF: ");
					clienteEspecial.setCpf(scan.nextInt());
					System.out.println("Digite a cidade: ");
					clienteEspecial.setCidade(scan.next());
					System.out.println("Digite o bairro: ");
					clienteEspecial.setBairro(scan.next());
					System.out.println("Digite a rua: ");
					clienteEspecial.setRua(scan.next());
					System.out.println("Digite o n�mero da resid�ncia: ");
					clienteEspecial.setNumero(scan.nextInt());
					System.out.println("Digite o telefone: ");
					clienteEspecial.setTelefone(scan.nextInt());
					System.out.println("Digite o email: ");
					clienteEspecial.setEmail(scan.next());
					clienteEspecial.setTipo("Especial");
					System.out.println("Digite o saldo: ");
					clienteEspecial.setSaldo(scan.nextDouble());
					System.out.println("Digite o saldo especial: ");
					clienteEspecial.setSaldoEspecial(scan.nextDouble());
					cliente.cadastroCliente(clienteEspecial);
				}
			}
		}
		
	}

}
