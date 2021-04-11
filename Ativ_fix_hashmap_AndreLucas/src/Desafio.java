import java.util.HashMap;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nomeAluno = new Scanner(System.in);
		HashMap<Integer, String> chamada = new HashMap<Integer, String>();
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o nome: ");
			String nome = nomeAluno.nextLine();
			chamada.put(i, nome);
		}
		
		for (Integer i: chamada.keySet()) {
			System.out.println("Número: "+i+" Nome: "+ chamada.get(i));
		}
	}

}
