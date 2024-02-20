package clinica_veterinaria;

public class Principal {

	/*
	 * Uma clínica veterinária te contratou para desenvolver um sistema de controle
	 * dos animais que eles cuidam.
	 * 
	 * A prioridade é gerenciar os cachorros, que são a maior parte dos animais da
	 * clínica.
	 * 
	 * O cliente te informou que precisa das seguintes informações dos cachorros:
	 * nome, raça, sexo e idade.
	 * 
	 * A partir dessas informações:
	 * 
	 * 1) Crie um diagrama de classes (pode ser no StarUML ou com papel e caneta)
	 * para representar o domínio do problema
	 * 
	 * 2) Crie a classe Cachorro e adicione suas propriedades
	 * 
	 * 3) Crie uma classe Principal (com o método main), que instancia 2 objetos do
	 * tipo Cachorro
	 * 
	 * 4) Atribua valores às variáveis de instância dos objetos
	 * 
	 * 5) Acesse e imprima na saída os valores das variáveis de instância dos 2
	 * objetos
	 * 
	 * 6) Analise a execução do programa usando a ferramenta de debug da IDE (e de
	 * preferência, com o plugin Java Visualizer)
	 */

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		cachorro1.nome = "Bob";
		cachorro1.raca = "Boxer";
		cachorro1.sexo = 'M';
		cachorro1.idade = 2;

		Cachorro cachorro2 = new Cachorro();
		cachorro2.nome = "Zara";
		cachorro2.raca = "Poodle";
		cachorro2.sexo = 'F';
		cachorro2.idade = 1;

		System.out.println("CACHORRO 1");
		System.out.println("--------");
		System.out.printf("Nome: %s%n", cachorro1.nome);
		System.out.printf("Raça: %s%n", cachorro1.raca);
		System.out.printf("Sexo: %s%n", cachorro1.sexo);
		System.out.printf("Idade: %d%n", cachorro1.idade);

		System.out.println();

		System.out.println("CACHORRO 2");
		System.out.println("--------");
		System.out.printf("Nome: %s%n", cachorro2.nome);
		System.out.printf("Raça: %s%n", cachorro2.raca);
		System.out.printf("Sexo: %s%n", cachorro2.sexo);
		System.out.printf("Idade: %d%n", cachorro2.idade);
	}

}
