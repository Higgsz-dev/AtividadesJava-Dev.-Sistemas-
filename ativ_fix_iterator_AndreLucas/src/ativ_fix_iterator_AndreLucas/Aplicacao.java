package ativ_fix_iterator_AndreLucas;

import java.util.ArrayList;
import java.util.Iterator;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(12);
		numeros.add(3);
		numeros.add(31);
		numeros.add(5);
		System.out.println(numeros);
		Iterator<Integer> it = numeros.iterator();
		while (it.hasNext());
		Integer i = it.next();
		if(i < 10) {
				numeros.remove(i);
		}
		System.out.println(numeros);
	}

}
