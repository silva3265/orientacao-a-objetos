package calculadora_imc;

public class Principal {

	public static void main(String[] args) {
		CalculadoraImc paciente = new CalculadoraImc();
//		paciente.altura = 1.82;
//		paciente.peso = 175;
		
		double peso = 175;
		double altura = 1.82;

		IndiceMassaCorporal imc = paciente.calcular(peso, altura);

		if (imc.resultado >= 30) {
			System.out.printf("Paciente com altura de %.2f e peso de %.2f " + "está com obesidade%n", imc.altura,
					imc.peso);
		}

		System.out.printf("IMC: %.2f%n", imc.resultado);
	}

}
