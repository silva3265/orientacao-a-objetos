package Desafio3;

public class ContratoTrabalho {

	/*
	 * 3) Composição e retorno de objeto Mais uma alteração foi solicitada para
	 * você.
	 * 
	 * Agora, você deve alterar o código do método calcularSalario da classe
	 * FolhaPagamento para retornar um novo tipo Holerite.
	 * 
	 * A classe Holerite deve ter as seguintes propriedades:
	 * 
	 * Funcionário Valor total das horas normais Valor total das horas extras Valor
	 * do adicional para filhos Além disso, a classe Holerite deve possuir os
	 * seguintes comportamentos/métodos:
	 * 
	 * Calcular valor total (deve somar todos os valores e chegar no valor total)
	 * Imprimir (deve imprimir na saída todos os detalhes do holerite)
	 */

	Funcionario funcionario;
	double valorHoraNormal;
	double valorHoraExtra;

	boolean possuiAdicionalParaFilhos() {
		return funcionario.possuiFilhos();
	}

}
