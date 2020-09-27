package ClasseEObjetos;

public class Classificados {

	public static void main(String[] args) {
		// Casa, Imobili�ria Falc�o, 3 quartos, 1 su�te, 2 banheiros, 120 m�, com piscina.
		// Apartamento, Imobili�ria Falc�o, 15 andares, apartamento no pavimento 8, 3 quartos, 2 su�tes, 3 banheiros, 82 m�, com elevador.
		// Casa, Imobili�ria Altaman, 4 quartos, 2 su�tes, 3 banheiros, 240 m�, com piscina, quadra e elevador.
		// Casa, Imobili�ria Leblon, 6 quartos, 3 su�tes, 5 banheiros, 540 m�, com piscina, quadra e elevador.
		// Apartamento, Imobili�ria Alto Branco, 3 andares, apartamento no pavimento 2, 2 quartos, 1 su�tes, 2 banheiros, 60 m�, sem elevador.
		
		Imovel classificado1 = new Imovel("Casa", "Falc�o", 3, 1, 2, 120, true, false, false);
		Imovel classificado2 = new Imovel("Apartamento", "Falc�o", 15, 8, 3, 2, 3, 82, true, false, false);
		Imovel classificado3 = new Imovel("Casa", "Altaman", 4, 2, 3, 240, true, true, true);
		Imovel classificado4 = new Imovel("Casa", "Leblon", 6, 3, 5, 540, true, true, true);
	
		System.out.println(classificado1);
		System.out.println(classificado2);
		System.out.println(classificado3);
		System.out.println(classificado4);
	}

}
