package calculadora_imc;

public class Principal {

	public static void main(String[] args) {
		CalculadoraImc calculadoraImc = new CalculadoraImc();
		
		Paciente joao = new Paciente();

		
		joao.peso = 175;
		joao.altura = 1.82;

		IndiceMassaCorporal imc = calculadoraImc.calcular(joao);

		if (imc.resultado >= 30) {
			System.out.printf("Paciente com altura de %.2f e peso de %.2f " + "está com obesidade%n", imc.altura,
					imc.peso);
		}

		System.out.printf("IMC: %.2f%n", imc.resultado);
	}

}
