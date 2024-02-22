package OrientcaoAObjetos;

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	int anoFabricacao = 2022;
	double precoCompra;
	Pessoa proprietario;

	void imprimirResumoDepreciacao() {
		double valorRevendaMeuCarro = calcularValorRevenda();
		int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

		if (precoCompra <= 0) {
			System.out.println("Carro com preço de compra zerado. Não foi possivel imprimir resumo de depreciação");
			
			return; // return sem nada é apenas 'Saia do metodo'
		}

		System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
		System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
	}

	double calcularIpva() {

		int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

		if (tempoDeUsoEmAnos >= 10) {
			return 0;
		}
		return calcularValorRevenda() * 0.04;
	}

	int calcularTempoDeUsoEmAnos() {
		return 2022 - anoFabricacao;
	}

	double calcularValorRevenda() {
		int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
		int vidaUtilEmAnos = 20;

		double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

		if (valorRevenda < 0) {
			valorRevenda = 0;
		}

		return valorRevenda;
	}

}
