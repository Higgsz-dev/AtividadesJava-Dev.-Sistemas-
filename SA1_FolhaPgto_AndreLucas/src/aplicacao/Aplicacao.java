package aplicacao;

import java.util.ArrayList;
import java.util.Random;

import classes.Funcionario;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criando a ArrayList para aramazenar os funcionários
		ArrayList<Funcionario> listFunc = new ArrayList();
		
		//Contador para receber o valor do dia trabalhado
		double ContDia = 0.0;
		double ContDia2 = 0.0;
		//Contador para aramazenar os dias trabalhados
		int ContQnt = 0;
		int ContQnt2 = 0;
		//Período em dias para mostrar a folha de pagamento
		int intervalo = 0; 
		//Criando objeto para gerar numeros randomicos
		Random trabalhou = new Random();
		
		//======PORTEIRO======
		//Criando o OBJ porteiro
		Funcionario porteiro = new Funcionario();
		porteiro.setNome("FuncA"); 			//Nome do funcionario
		porteiro.setCargo("Porteiro"); 		//Cargo na empresa
		porteiro.setCargaHoraria(180);		//Carga Horario esperada
		porteiro.setValorDia(100);			//Valor pago por dia trabalhado
		
		//Calculos para  folha salarial
		for(int i = 0; i < 26; i++) {
			porteiro.setTrabalhou(trabalhou.nextBoolean());	
			if (porteiro.isTrabalhou() == true) {
				ContDia += 100;
				ContQnt ++;
			}
		}
		porteiro.setDiasTrab(ContQnt);
		
		//Calculando descontos
		porteiro.setINSS(ContDia/100*2);
		porteiro.setVT(ContDia/100*2);
		porteiro.setVA(ContDia/100*2);
		porteiro.setMedico(ContDia/100*2);
		
		//Setando salário liquido
		porteiro.setSalario(ContDia);
		
		//Setando o Endereço
		//porteiro.getEndereco().setCidade("Belo horizonte"); APRESENTA ERRO
		
		//Adicionando na porteiro na lista
		listFunc.add(porteiro);
		
		
		//=======DESENVOLVEDOR======
		//Criando o OBJ Desenvolvedor
		Funcionario desenvolvedor = new Funcionario();
		desenvolvedor.setNome("FuncB"); 				//Nome do funcionario
		desenvolvedor.setCargo("Desenvolvedor"); 		//Cargo na empresa
		desenvolvedor.setCargaHoraria(180);				//Carga Horario esperada
		desenvolvedor.setValorDia(200);					//Valor pago por dia trabalhado
		desenvolvedor.setIntervalo(13);
				
		//Calculos para  folha salarial
		for(int i = 0; i < 26; i++) {
			desenvolvedor.setTrabalhou(trabalhou.nextBoolean());	
			if (desenvolvedor.isTrabalhou() == true) {
				ContDia += 100;
				ContQnt ++;
			}
			//Exibindo Folha de pagamento Parcial
			
		}
		desenvolvedor.setDiasTrab(ContQnt);
		
			System.out.println("======Folha de Pagamento Parcial======"+
					"\nNome: "+desenvolvedor.getNome()+
					"\nCargo: "+desenvolvedor.getCargo()+
					"\nDias do Mês percorridos: "+desenvolvedor.getIntervalo()+
					"\nDias trabalhados: "+desenvolvedor.getDiasTrab()+
					"\nSalário parcial: "+ContDia+
					"\n"); 
				
		//Calculando descontos
		desenvolvedor.setINSS(ContDia/100*2);
		desenvolvedor.setVT(ContDia/100*2);
		desenvolvedor.setVA(ContDia/100*2);
		desenvolvedor.setMedico(ContDia/100*2);
				
		//Setando salário liquido
		desenvolvedor.setSalario(ContDia);
				
		//Setando o Endereço
		//porteiro.getEndereco().setCidade("Belo horizonte"); APRESENTA ERRO
				
		//Adicionando na porteiro na lista
		listFunc.add(desenvolvedor);
		
		//Exibindo Lista
		for(int i1=0;i1<listFunc.size();i1++){
			System.out.print(listFunc.get(i1).exibirDados());
			System.out.print(listFunc.get(i1).descontos(i1));
			System.out.println("");
		}
		
		
	}
}
