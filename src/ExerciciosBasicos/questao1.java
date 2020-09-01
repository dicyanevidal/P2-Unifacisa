import java.util.Locale;
import java.util.Scanner;

public class questao1 { 
	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float valor1, valor2;

		valor1 = sc.nextFloat();
		valor2 = sc.nextFloat();
		
		if (valor1 == valor2) {
			System.out.println("Os valores são iguais.");
		}
		else if (valor1 > valor2) {
			System.out.println("O número " + valor1 + " é maior.");
		}
		else {
			System.out.println("O número " + valor2 + " é maior.");
		}

		sc.close();

	}
}	
