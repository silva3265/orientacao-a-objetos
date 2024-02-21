package OrientcaoAObjetos;

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	int anoFabricacao = 2022;
	double precoCompra;
	Pessoa proprietario;

	double calcularValorRevenda() {
		int tempoDeUsoEmAnos = 2022 - anoFabricacao;
		int vidaUtilEmAnos = 20;

		double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

		if (valorRevenda < 0) {
			valorRevenda = 0;
		}

		System.out.printf("Tempo de Uso em (anos): %d%n", tempoDeUsoEmAnos);
		System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);

		return valorRevenda; // o Retorno tem que ser do mesmo tipo do metodono caso um 'double'
	}

}
