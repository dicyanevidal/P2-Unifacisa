package ClasseEObjetos;

public class LojaDeCarros {

	public static void main(String[] args) {
		
		// Sem desconto promocional
		Carro.promocao = false;
		
		Carro palio1 = new Carro("Pálio", "Fiat", 35000.00);
		Carro palio2 = new Carro("Pálio", "Fiat", "PRATA", 2, false, false, false, false, 35000);
		Carro civic = new Carro("Civic", "Honda", "PRETO", 4, true, true, true, true, 110000);
		Carro corolla = new Carro("Corolla", "Toyota", "AMARELO", 4, true, true, false, true, 110000);
		Carro gol = new Carro();
		
		System.out.println("SEM DESCONTO:\n");
		System.out.println(palio1);
		System.out.println(palio2);
		System.out.println(civic);
		System.out.println(corolla);
		System.out.println(gol);
		
		
		// Com desconto promocional
		
		Carro.promocao = true;
		System.out.println("------------------------------");
		System.out.println("\nDESCONTO APLICADO:\n");
		System.out.println(palio1);
		System.out.println(palio2);
		System.out.println(civic);
		System.out.println(corolla);
		System.out.println(gol);

	}

}
