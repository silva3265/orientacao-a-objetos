package maior_numero;

public class NumeroUtil {

	/*
	 * Crie um novo projeto e implemente uma classe chamada NumeroUtil.
	 * 
	 * Esta classe deve ter métodos estáticos para resolver as seguintes questões:
	 * 
	 * Descobrir maior número, dados 2 números inteiros como parâmetros Descobrir
	 * maior número, dados 3 números inteiros como parâmetros Descobrir maior
	 * número, dados 2 números decimais (double) como parâmetros Descobrir maior
	 * número, dados 3 números decimais (double) como parâmetros
	 * 
	 * Use o conceito de sobrecarga na implementação dos métodos e crie uma classe
	 * Principal, com o método main, para invocar todos os métodos.
	 */

	static int descobrirMaior(int a, int b) {
		return a > b ? a : b;
	}

	static int descobrirMaior(int a, int b, int c) {
		return descobrirMaior(descobrirMaior(a, b), c);
	}

	static double descobrirMaior(double a, double b) {
		return a > b ? a : b;
	}

	static double descobrirMaior(double a, double b, double c) {
		return descobrirMaior(descobrirMaior(a, b), c);
	}

}
