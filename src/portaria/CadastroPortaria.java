package portaria;

public class CadastroPortaria {
	
	void cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30; // colocalmos final para nao sofrer alterações

        System.out.printf("Visitante %s cadastrado para %d dias%n",
                visitante.nome, tempoExpiracaoEmDias);
    }

}
