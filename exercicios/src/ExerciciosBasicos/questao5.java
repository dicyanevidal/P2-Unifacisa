/* Escreva um programa que receba como entrada 25 n�meros e exiba
a quantidade de n�meros que s�o pares e positivos. */

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada, x = 1, par = 0, positivo = 0;
		
		while (x < 26) {
			entrada = sc.nextInt();
			if (x % 2 == 0) {
				par += 1;
			}
			if (x > 0) {
				positivo += 1;
			}
			x += 1;
		}
		
		System.out.println("Total de n�meros pares: " + par);
		System.out.println("Total de n�meros positivos: " + positivo);
		
		sc.close();
	}

}
