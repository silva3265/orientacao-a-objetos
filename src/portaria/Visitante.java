package portaria;

public class Visitante {

	static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 16; // Constante

	String nome;
	int idade;

	boolean possuiAcessoRestritoPorIdade() {
		return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
	}

}
