package OrientcaoAObjetos;

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	int anoFabricacao = 2022;
	Pessoa proprietario = new Pessoa();

	void calcularValorRevenda() { // void - metodo sem retorno (nome de metodo de preferencia usar verbos (Ex: Calcular)
		System.out.printf("Calcular valor de revenda de: %s %d%n", modelo, anoFabricacao);
	}

}
