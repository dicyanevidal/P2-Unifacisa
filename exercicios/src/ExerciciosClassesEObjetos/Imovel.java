package ClasseEObjetos;

public class Imovel {

	public String tipo, imobiliaria;
	int pavimentos, pavimento, quarto, suite, banheiro, metroQuadrado;
	boolean elevador, piscina, quadra;
	
	Imovel (String tipo, String imobiliaria, int quarto, int suite, int banheiro, 
			int metroQuadrado, boolean piscina, boolean quadra, boolean elevador) {
		
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.quarto = quarto;
		this.suite = suite;
		this.banheiro = banheiro;
		this.metroQuadrado = metroQuadrado;
		this.piscina = piscina;
		this.quadra = quadra;
		this.elevador = elevador;
	}
	
	Imovel(String tipo, String imobiliaria, int pavimentos, int pavimento, int quarto, int suite, 
			int banheiro, int metroQuadrado, boolean elevador, boolean piscina, boolean quadra){
		
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quarto = quarto;
		this.suite = suite;
		this.banheiro= banheiro;
		this.metroQuadrado = metroQuadrado;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
	}

	double calculaPreco() {
		
		double preco = 0;
		
		preco = metroQuadrado * 5000.00;
		
		if (pavimento > 4) {
			preco = (pavimento - 4) * 2000.00;
		} if (elevador == true) {
			preco += 2500;
		} if (piscina == true) {
			preco += 2500;
		} if (quadra == true) {
			preco += 2500;
		}

		return preco;
	}
	
	public String toString() {
		return "Tipo: " + tipo
			+ "\nImobiliária: " + imobiliaria
			+ "\nPavimentos: " + pavimentos
			+ "\nPavimento: " + pavimento
			+ "\nNúmero de Quartos: " + quarto
			+ "\nNúmero de Suítes: " + suite
			+ "\nNúmero de Banheiros: " + banheiro
			+ "\nMetros Quadrados: " + metroQuadrado
			+ "\nPossui Elevador: " + elevador
			+ "\nPossui Piscina: " + piscina
			+ "\nPossui Quadra: " + quadra
			+ String.format("\nValor Total = R$ %.2f\n", calculaPreco());
	}
}