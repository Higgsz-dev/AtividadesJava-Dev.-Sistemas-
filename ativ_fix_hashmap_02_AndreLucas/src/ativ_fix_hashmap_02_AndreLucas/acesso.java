package ativ_fix_hashmap_02_AndreLucas;

import java.util.HashMap;
import java.util.Scanner;

public class acesso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashMap<String, String> login = new HashMap<String, String>();
		
		for (int i = 0; i < 2; i++) {
			System.out.print("Digite o usuario: ");
			String usuario = sc.nextLine();
			System.out.print("Digite a senha: ");
			String senha = sc.nextLine();
			login.put(usuario, senha);
		}
		
		/* Para conferir as senhas e usu�rios inseridos
		 * for(String i : login.keySet()) {
		*	System.out.println("Usu�rio: "+ i + "\nSenha: "+login.get(i));
		}**/
	
		//Acessando o sistema
		System.out.print("Digite o seu usu�rio: ");
		String consultUsuario = sc.nextLine();
		System.out.print("Digite a sua senha: ");
		String consultSenha = sc.nextLine();
		
		if(login.containsKey(consultUsuario) == true && login.containsValue(consultSenha) == true) {
			System.out.println("ACESSO PERMITIDO!!");
		}else {
			System.out.println("ACESSO NEGADO!!");
		}
		
	}

}
