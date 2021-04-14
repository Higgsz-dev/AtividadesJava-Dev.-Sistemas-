package ativ_fix_arrays_02_AndreLucas;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner Scan = new Scanner(System.in);
		
		int[] Num = new int[10];
		int Divisor = 0;
		
		for(int i=0; i<Num.length; i++) {
			System.out.println("Insira o "+(i+1)+"º número desejado:");
			Num[i] = Scan.nextInt();
		}
		for(int i=0; i<Num.length; i++) {
			System.out.println(" ");
			System.out.print("Divisores de "+Num[i]+": ");
			for(int I=1; I<11; I++) {
				if(Num[i]%(I)==0) {
					Divisor = I;
					System.out.print(Divisor+" ");
				}
			}
		}
	}

}
