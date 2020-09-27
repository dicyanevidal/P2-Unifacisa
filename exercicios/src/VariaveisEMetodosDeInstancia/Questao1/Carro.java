package ClasseEObjetos;

public class Carro {
	
	String nome, marca,cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	static boolean promocao;
	double precoBase;
	
	Carro (String nome, String marca, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
	
		this.portas = 2;
		this.cor = "BRANCO";
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	}
	
	Carro (String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado, 
			boolean cambioAutomatico, boolean direcaoEletrica, double precoBase)  {
		
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
		
	}
	
	Carro () {
		this.nome = "Gol";
		this.marca = "Volkswagen";
		this.cor = "VERDE";
		this.portas = 2;
		this.vidroEletrico = true;
		this.arCondicionado = true;
		this.cambioAutomatico = true;
		this.direcaoEletrica = true;
		this.precoBase = 55000.00;
		
	}
	
	
	double calculaPreco() {
		
		double preco = precoBase;
		
		switch(cor) {
		case "BRANCO":
		case "AZUL":
		case "VERMELHO":
		case "PRETO":
		break;
		default: preco += 1000.00;
		}
		
		if (this.vidroEletrico) {
			preco += 1250.00;
		}
		if (this.arCondicionado) {
			preco += 1250.00;
		}
		if (this.cambioAutomatico) {
			preco += 1250.00;
		}
		if (this.direcaoEletrica) {
			preco += 1250.00;
		}
		if (promocao == true) {
			preco -= (preco * 0.10);
		}
		return preco;
	}
		
	public String toString() {
		return "Nome: " + nome
			+ "\nMarca: " + marca
			+ "\nCor: " + cor
			+ "\nPortas: " + portas
			+ "\nVidro Elétrico: " + vidroEletrico
			+ "\nAr Condicionado: " + arCondicionado
			+ "\nCâmbio Automático: " + cambioAutomatico
			+ "\nDireção Elétrica: " + direcaoEletrica
			+ "\nValor Total: " + calculaPreco() + "\n";
	}
	
}
