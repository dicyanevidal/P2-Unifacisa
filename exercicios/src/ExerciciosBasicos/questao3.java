/* Escreva um programa que recebe do usu�rio o nome do produto, e seu pre�o. Se o pre�o for:
]0, 100[: d� 5% de desconto
[100,500[: d� 10% de desconto
[500, inf[: d� 15% de desconto 
Ao final, seu programa deve imprimir o nome do produto e pre�o com desconto. */

import java.util.Locale;
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, total, desconto5, desconto10, desconto15; 
		
		desconto5 = 0.05;
		desconto10 = 0.10;
		desconto15 = 0.15;
		
		System.out.println("Digite o nome do produto e seu pre�o:");
		
		String produto = sc.next();
		preco = sc.nextFloat();
		
		if (0 > preco || preco < 100) {
			total = preco - (preco * desconto5); 
		}
		else if (100 <= preco || preco < 500) {
			total = preco - (preco * desconto10);
		}
		else {
			total = preco - (preco * desconto15);
		}
		
		System.out.println("Produto: " + produto);
		System.out.println("Valor com desconto: " + total);
		
		sc.close();
		
	}

}
