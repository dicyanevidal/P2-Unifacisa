package ClasseEObjetos;

public class LojaDeCarros {

	public static void main(String[] args) {
		// Fiat Pálio básico, de preço básico R$ 35000
		// Fiat Pálio básico com cor prateada, de preço básico R$ 35000
		// Honda Civic completo, de preço básico R$110000
		// Toyota Corolla com vidro, direção e ar, de preço básico R$110000
		// Volkswagen Gol completo, de preço básico R$ 55000 (use o construtor vazio)
		
		Carro palio1 = new Carro("Pálio", "Fiat", 35000.00);
		Carro palio2 = new Carro("Pálio", "Fiat", "PRATA", 2, false, false, false, false, 35000);
		Carro civic = new Carro("Civic", "Honda", "PRETO", 4, true, true, true, true, 110000);
		Carro corolla = new Carro("Corolla", "Toyota", "AMARELO", 4, true, true, false, true, 110000);
		Carro gol = new Carro();
		
		System.out.println(palio1);
		System.out.println(palio2);
		System.out.println(civic);
		System.out.println(corolla);
		System.out.println(gol);

	}

}
