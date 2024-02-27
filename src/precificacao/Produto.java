package precificacao;

public class Produto {
	
	// static - variavel global
	static double custoEmbalagem; //static - essa variavel nao pertence  a instanca, ela pertence a propria classe produto agora
	
	double precoCusto;
    double precoVenda;
    
    static void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }
    
    void alterarPrecoCusto(double precoCusto) {
    	this.precoCusto = precoCusto; 
    }
    
    static void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f%n", Produto.custoEmbalagem); // Produto.custoEmbalagem - valor fixo
    }

}
