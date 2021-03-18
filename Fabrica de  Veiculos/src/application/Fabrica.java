package application;

import java.util.ArrayList;

import veiculos.Carro;
import veiculos.Moto;
import veiculos.Veiculo;

public class Fabrica {

	public static void main(String[] args) {
		
		//Declarando as listas
		ArrayList<Veiculo> listVeiculo = new ArrayList();
		ArrayList<Carro> listCarros = new ArrayList();
		ArrayList<Moto> listMotos = new ArrayList();
		
		//Declarando o obj bmwM3
		Carro bmwM3 = new Carro();
		bmwM3.setNome("M3");
		bmwM3.setCor("Preto");
		bmwM3.setNumChassi(111);
		bmwM3.setAno(2020);
		bmwM3.setTipo("Sedan");
		bmwM3.setMotorizacao(3);
		bmwM3.setModelo("3.0 6 Cilindros em linha");
		//Adicionando a lista
		listCarros.add(bmwM3);
		
		//Declarando o obj bmwM4
				Carro bmwM4 = new Carro();
				bmwM4.setNome("M4");
				bmwM4.setCor("Preto");
				bmwM4.setNumChassi(112);
				bmwM4.setAno(2020);
				bmwM4.setTipo("Coupe");
				bmwM4.setMotorizacao(3);
				bmwM4.setModelo("3.0 6 Cilindros em linha");
		//Adicionando a lista
		listCarros.add(bmwM4);
		for(int i=0;i<listCarros.size();i++){
			System.out.println(listCarros.get(i).exibirDados());
			System.out.println("");
		}
		

		//Declarando obj bmwS1000RR
		Moto bmwS1000RR = new Moto();
		bmwS1000RR.setNome("S1000RR");
		bmwS1000RR.setCor("Branco");
		bmwS1000RR.setNumChassi(11);
		bmwS1000RR.setAno(2020);
		bmwS1000RR.setTipo("Esportiva");
		bmwS1000RR.setMotorizacao(1000);
		bmwS1000RR.setModelo("1000cc");
		//Adicionando a lista
		listMotos.add(bmwS1000RR);
		
		//Declarando obj bmwS1000R
				Moto bmwS1000R = new Moto();
				bmwS1000R.setNome("S1000R");
				bmwS1000R.setCor("Branco");
				bmwS1000R.setNumChassi(12);
				bmwS1000R.setAno(2020);
				bmwS1000R.setTipo("Esportiva");
				bmwS1000R.setMotorizacao(1000);
				bmwS1000R.setModelo("1000cc");
				//Adicionando a lista
				listMotos.add(bmwS1000R);
		for(int i1=0;i1<listMotos.size();i1++){
			System.out.println(listMotos.get(i1).exibirDados());
			System.out.println("");
		}

		//Removendo(Vendendo) carro da lista
		listCarros.remove(bmwM4);//Removendo objeto bmwM4
		//Exibindo lista depois de remover objeto
		for(int i=0;i<listCarros.size();i++){
			System.out.println(listCarros.get(i).exibirDados());
			System.out.println("");
		}
		
		//Removendo(Vendendo) moto da lista
		listCarros.remove(bmwS1000R);//Removendo objeto bmwS1000R
		//Exibindo lista depois de remover objeto
		for(int i1=0;i1<listMotos.size();i1++){
			System.out.println(listMotos.get(i1).exibirDados());
			System.out.println("");
		}
		
		}
	}


