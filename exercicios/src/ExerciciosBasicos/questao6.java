// Escreva um programa que receba como entrada 50 n�meros e exiba a soma dos que s�o m�ltiplos de 3.

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = 0, soma = 0;
		
		while (x < 10) {
			int entrada = sc.nextInt();
			
			if (x % 3 == 0) {
				soma += x;
			}
			
			x += 1;
		}
		
		System.out.println("A soma dos m�tiplos de 3 entre 0 e 50 �: " + soma);
		
		sc.close();

	}

}
