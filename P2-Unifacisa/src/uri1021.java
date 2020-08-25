import java.util.Locale;
import java.util.Scanner;
public class uri1021 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota_100, nota_50, nota_20, nota_10, nota_5, nota_2;
		double moeda_1, moeda_050, moeda_025, moeda_010, moeda_005, moeda_001;
		
		double valor = sc.nextDouble();
		
		
		nota_100 = (int) (valor / 100);
		valor %= 100.0;
		nota_50 = (int) (valor / 50);
		valor %= 50.0;
		nota_20 = (int) (valor / 20);
		valor %= 20.0;
		nota_10 = (int) (valor / 10);
		valor %= 10.0;
		nota_5 = (int) (valor / 5);
		valor %= 5.0;
		nota_2 = (int) (valor / 2);
		valor %= 2.0;
		
		valor *= 100;
		
		moeda_1 = (int) (valor / 100);
		valor %= 100.0;
		moeda_050 = (int) (valor / 50);
		valor %= 50.0;
		moeda_025 = (int) (valor / 25);
		valor %= 25.0;
		moeda_010 = (int) (valor / 10);
		valor %= 10.0;
		moeda_005 = (int) (valor / 5);
		valor %= 5.0;
		moeda_001 = (int) (valor / 1);
		valor %= 1.0;
		

		System.out.printf("%nNOTAS:");
		System.out.printf("%n%.0f nota(s) de R$ 100.00", nota_100);
		System.out.printf("%n%.0f nota(s) de R$ 50.00", nota_50);
		System.out.printf("%n%.0f nota(s) de R$ 20.00", nota_20);
		System.out.printf("%n%.0f nota(s) de R$ 10.00", nota_10);
		System.out.printf("%n%.0f nota(s) de R$ 5.00", nota_5);
		System.out.printf("%n%.0f nota(s) de R$ 2.00", nota_2);
		
		System.out.printf("%nMOEDAS:");
		System.out.printf("%n%.0f moeda(s) de R$ 1.00", moeda_1);
		System.out.printf("%n%.0f moeda(s) de R$ 0.50", moeda_050);
		System.out.printf("%n%.0f moeda(s) de R$ 0.25",moeda_025);
		System.out.printf("%n%.0f moeda(s) de R$ 0.10", moeda_010);
		System.out.printf("%n%.0f moeda(s) de R$ 0.05", moeda_005);
		System.out.printf("%n%.0f moeda(s) de R$ 0.01", moeda_001);
		
		
		sc.close();
	}

}
