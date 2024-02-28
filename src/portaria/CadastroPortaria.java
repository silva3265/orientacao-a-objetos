package portaria;

public class CadastroPortaria {

	static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

	// Sobrecarga de metodos
	void cadastrar(final Visitante visitante) {
		this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES); // Recursividade - metodo dentro de outro metodo
	}

	int cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {
		final var tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30; // colocalmos final para nao sofrer alterações

		System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExpiracaoEmDias);
	
		return 1;
	}

}
