/*
A loja “Casa das Encomendas” concede um desconto de 20% para clientes que pagam
suas compras com o cartão da loja, e 10% para clientes que pagam com o cartão de 
crédito da bandeira “Visa”. Para tanto, crie uma classe abstrata chamada Cartao,
sabendo que cada Cartao possui um número, um nome do titular e um método que 
possa ser usado para consultar o percentual de desconto do cartão. A Loja 
atualmente aceita pagamentos com Cartão da Loja, Cartao Visa, e Cartão MasterCard.
Para testar esta estrutura, crie uma classe chamada Venda que contenha um atributo
chamado total e um método realizarPagamento que receba por parâmetro o Cartão
escolhido para realizar a pagamento. Ao realizar o pagamento, o total da venda
deve ser atualizado, contemplando um possível desconto decorrente do tipo de cartão
utilizado para o pagamento.
 */
package exercicio1;

/**
 *
 * @author karol
 */
public abstract class Cartao {

    private int numero;
    private String nomeTitular;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public abstract double ConsultarPencentual(double valor);
}
