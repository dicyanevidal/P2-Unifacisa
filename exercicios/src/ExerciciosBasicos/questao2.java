//Escreva um programa que recebe do usu�rio 3 valores do tipo ponto flutuante e imprime na tela a m�dia aritm�tica destes n�meros.
package exerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float valor1, valor2, valor3, mediaAritmetica;
		
		System.out.println("Digite os tr�s valores:");
		
		valor1 = sc.nextFloat();
		valor2 = sc.nextFloat();
		valor3 = sc.nextFloat();
		
		mediaAritmetica = (valor1 + valor2 + valor3) / 3;
		
		System.out.println("Resultado: " + mediaAritmetica);
		
		sc.close();
	}
}
