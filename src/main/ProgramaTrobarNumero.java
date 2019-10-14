package main;

import java.util.Scanner;

public class ProgramaTrobarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introdueix el nombre que volem trobar repetit:");
		int nValor = lector.nextInt();
		
		for(int i = 0; i < 500000; i++) {
			int numero = (int)(Math.random()*500000+1);
			if(nValor == numero) {
				System.out.println("S'ha trobat el valor que busquem.");
			}
		}
		
	}

}
