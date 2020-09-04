// Escreva um programa que receba como entrada 50 números e exiba a soma dos que são múltiplos de 3.

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = 0, soma = 0;
		
		while (x < 10) {
			int entrada = sc.nextInt();
			
			if (entrada % 3 == 0) 
				soma += entrada;
		
			x += 1;
		}
		
		System.out.println("A soma dos mútiplos de 3 entre 0 e 50 é: " + soma);
		
		sc.close();

	}

}
