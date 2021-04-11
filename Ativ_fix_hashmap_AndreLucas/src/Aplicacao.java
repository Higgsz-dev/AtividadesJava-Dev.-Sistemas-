import java.util.HashMap;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> nomeSobrenome = new HashMap<String, String>();

		//Criando HashMap
		nomeSobrenome.put("Andre","Lucas");
		nomeSobrenome.put("André", "Luiz");
		nomeSobrenome.put("Lucas", "André");
		
		//Exibindo lista
		System.out.println(nomeSobrenome);
		System.out.println("");
		
		//Exibindo segundo nome de quem chama Andre
		System.out.println(nomeSobrenome.get("Andre"));
		System.out.println("");
		
		//Removendo quem tem o primeiro nome como Andre
		nomeSobrenome.remove("Andre");
		System.out.println("");
		
		//Exibindo sem o nome Andre
		System.out.println("Lista sem o nome Andre");
		System.out.println(nomeSobrenome);
		System.out.println("");
		
		//Exibindo tamanho do HashMap
		System.out.println("Tamanho da lista");
		System.out.println(nomeSobrenome.size());
		System.out.println("");
		
		//Removendo toda a HashMap
		System.out.println("Removendo todos os itens da lista");
		nomeSobrenome.clear();
		System.out.println(nomeSobrenome);
	}

}
