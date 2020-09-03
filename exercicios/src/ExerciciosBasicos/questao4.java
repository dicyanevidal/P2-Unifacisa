/* Escreva um programa para receber como entrada dois números e exibir a quantidade
de múltiplos de 4 entre eles (os extremos do intervalo não devem ser considerados). */

import java.util.Scanner;
public class questao4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		for (int i=num1; i<num2; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

}
