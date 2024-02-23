package Desafio1;

public class FolhaPagamento {

	/*
	 * 1) Implementação de método Uma empresa contratou você para continuar o
	 * desenvolvimento de um sistema de folha de pagamentos.
	 * 
	 * A primeira funcionalidade que você deve desenvolver é o cálculo de salário de
	 * um funcionário.
	 * 
	 * A empresa forneceu o seguinte código já desenvolvido para você continuar a
	 * implementação:
	 * 
	 * public class FolhaPagamento {
	 * 
	 * double calcularSalario() { // TODO implementar }
	 * 
	 * }
	 * 
	 * O método calcularSalario deve receber os seguintes parâmetros para calcular o
	 * valor total do salário a pagar:
	 * 
	 * Quantidade de horas normais trabalhadas Quantidade de horas extras
	 * trabalhadas Valor da hora normal Valor da hora extra Você deve calcular as
	 * respectivas quantidades de horas trabalhas pelos valores da hora, somar os
	 * valores obtidos e retornar o resultado.
	 * 
	 * Crie uma classe com o método main para invocar o método implementado e
	 * imprima o resultado (salário devido) na saída.
	 */

	double calcularSalario(int horasNormais, int horasExtras, double valorHoraNormal, double valorHoraExtra) {
		double valorHorasNormais = horasNormais * valorHoraNormal;
		double valorHorasExtras = horasExtras * valorHoraExtra;

		return valorHorasNormais + valorHorasExtras;
	}

}
