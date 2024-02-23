package Desafio2;

public class ContratoTrabalho {

	/*
	 * 2) Passando objeto como argumento de método O desenvolvedor sênior da empresa
	 * que te contratou revisou o seu código e pediu algumas alterações.
	 * 
	 * Você deve criar uma classe Funcionario com as seguintes propriedades:
	 * 
	 * Nome Quantidade de filhos E também, deve criar uma classe ContratoTrabalho
	 * com as propriedades:
	 * 
	 * Funcionário (ou seja, uma variável do tipo Funcionario) Valor da hora normal
	 * Valor da hora extra Depois, você deve refatorar o método calcular da classe
	 * FolhaPagamento para receber um objeto do tipo ContratoTrabalho como
	 * parâmetro, substituindo os parâmetros de valores de hora.
	 * 
	 * Além disso, uma nova regra deve ser adicionada neste mesmo método:
	 * 
	 * Quando o funcionário possuir 1 ou mais filhos, você deve calcular um
	 * adicional de 10% no valor total do salário.
	 * 
	 * Crie métodos na classe Funcionario e ContratoTrabalho para que você possa
	 * "perguntar" ao objeto se o contrato possui ou não o adicional para filhos,
	 * tornando assim essas classes mais ricas.
	 */

	Funcionario funcionario;
	double valorHoraNormal;
	double valorHoraExtra;

	boolean possuiAdicionalParaFilhos() {
		return funcionario.possuiFilhos();
	}

}
