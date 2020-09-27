package ClasseEObjetos;

public class Classificados {

	public static void main(String[] args) {
		// Casa, Imobiliária Falcão, 3 quartos, 1 suíte, 2 banheiros, 120 m², com piscina.
		// Apartamento, Imobiliária Falcão, 15 andares, apartamento no pavimento 8, 3 quartos, 2 suítes, 3 banheiros, 82 m², com elevador.
		// Casa, Imobiliária Altaman, 4 quartos, 2 suítes, 3 banheiros, 240 m², com piscina, quadra e elevador.
		// Casa, Imobiliária Leblon, 6 quartos, 3 suítes, 5 banheiros, 540 m², com piscina, quadra e elevador.
		// Apartamento, Imobiliária Alto Branco, 3 andares, apartamento no pavimento 2, 2 quartos, 1 suítes, 2 banheiros, 60 m², sem elevador.
		
		Imovel classificado1 = new Imovel("Casa", "Falcão", 3, 1, 2, 120, true, false, false);
		Imovel classificado2 = new Imovel("Apartamento", "Falcão", 15, 8, 3, 2, 3, 82, true, false, false);
		Imovel classificado3 = new Imovel("Casa", "Altaman", 4, 2, 3, 240, true, true, true);
		Imovel classificado4 = new Imovel("Casa", "Leblon", 6, 3, 5, 540, true, true, true);
	
		System.out.println(classificado1);
		System.out.println(classificado2);
		System.out.println(classificado3);
		System.out.println(classificado4);
	}

}
