package main;

import java.util.Scanner;

public class ProgramaTrobarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introdueix el nombre que volem trobar repetit, ha de ser parell:");
		int nValor = lector.nextInt();
		
		
		//Aquesta es la branca temps
		for(int i = 0; i < 7000; i++) {
			int numero = (int)(Math.random()*1000000+1);
			if(nValor == numero) {
				System.out.println("S'ha trobat el valor que busquem.");
			}
		}
	}

}
