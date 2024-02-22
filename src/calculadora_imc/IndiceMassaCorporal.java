package calculadora_imc;

public class IndiceMassaCorporal {
	
	double resultado;
    double peso;
    double altura;
    
    boolean estaComObesidade() { // Vai retornar true ou false
        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal() {
        return resultado < 18.5;
    }

}
