package portaria;

public class Principal {

	public static void main(String[] args) {
		var novoVisitante = new Visitante(); // var - tem que ser inicializada

		novoVisitante.nome = "João";
		novoVisitante.idade = 15;

		var cadastroPortaria = new CadastroPortaria();
		var codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 10);
	}

}
