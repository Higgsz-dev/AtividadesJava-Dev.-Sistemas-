package ativ_fix_file_AndreLucas;

import java.io.File;
import java.io.InvalidObjectException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("___---BEM VINDO AO GERENCIAMENTO DE ARQUIVOS---___");
		System.out.println("1 - Criar um arquivo.");
		System.out.println("2 - Informações do arquivo");
		System.out.println("3 - Apagar o arquivo criado");
		System.out.println("4 - Apagar a pasta do arquivo");
		System.out.print("Digite a opção desejada: ");
		int opcao = sc.nextInt();
		System.out.println("");
		
		if (opcao == 1) {
			System.out.print("Digite o nome do arquivo a ser criado: ");
			String nomeArquivo = sc.nextLine();
			
			try {
				File arquivo =new File(nomeArquivo+".txt");
				if (arquivo.createNewFile()) {
					System.out.println("Arquivo criado: "+ arquivo.getName());
				}else {
					System.out.println("Arquivo ja existe");
				}
			}catch (IOException e) {
				System.out.println("Ocorreu um erro.");
				e.printStackTrace();
			}
		}
	}

}
