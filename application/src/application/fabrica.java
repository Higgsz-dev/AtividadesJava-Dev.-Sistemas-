package application;

import java.util.Scanner;

public class fabrica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro();
		
		System.out.print("Nome do carro: ");
		carro.nome = sc.nextLine();
		System.out.print("Cor do carro: ");
		carro.cor = sc.nextLine();
		System.out.print("Modelo do carro: ");
		carro.modelo = sc.nextLine();
		System.out.print("Motoriza��o do carro: ");
		carro.motorizacao = sc.nextLine();
		System.out.print("Numero de chassi: ");
		carro.numChassi = sc.nextInt();

		System.out.println();
		System.out.println("Informa��es do carro: " + carro);
		
		
		sc.close();
	}

}
