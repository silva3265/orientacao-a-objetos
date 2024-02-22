package calculadora_imc;

public class Paciente {

	double peso;
	double altura;

	IndiceMassaCorporal calcularIndiceMassaCorporal() {
		IndiceMassaCorporal imc = new IndiceMassaCorporal();
		imc.resultado = peso / (altura * altura);
		imc.peso = peso;
		imc.altura = altura;

		return imc; // tem que retornar um objeto do tipo 'IndiceMassaCorporal'
	}

}
