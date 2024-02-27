package precificacao;

public class ServicoDePrecificacao {

	void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        // poderia ter cálculos muito mais complexos aqui

        produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1); // Somando + 1 (20 / 100 = 0,20 + 1 = 1,2 -- 1,2 * 100 (preço de custo) = 100)
    }


}
