// Escreva um programa que receba como entrada v�rios n�meros, at� que seja informado o valor 100, e exiba a m�dia dos n�meros pares.

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = 0, soma = 0, cont = 0;
		
		
		while (entrada != 100) {
			entrada = sc.nextInt();
			if (entrada % 2 == 0 && entrada != 100) {
				soma += entrada;
				cont += 1;
			}
		}
		
		
		if (cont == 0) {
			System.out.println("M�dia: 0.0");
		} else {
			double media = soma / cont;
			System.out.println("M�dia: " + media);
		}
			
		
		sc.close();

	}

}
