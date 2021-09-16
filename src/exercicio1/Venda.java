/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author karol
 */
public class Venda {

    double total;

    public void realizarPagamento(Cartao cartao) {
        System.out.println("Titular: " + cartao.getNomeTitular());
        System.out.println("Numero: " + cartao.getNumero());

        total = total - cartao.ConsultarPencentual(total);
        System.out.println("valor total é: " + total);
    }
    
    public static void main(String[] args) {

        Venda v = new Venda();
        Cartao c = new CartaoLoja();

        c.setNomeTitular("Karollyne");
        c.setNumero(123224321);
        v.total = 5657;
        v.realizarPagamento(c);
        System.out.println(" ");

        c = new CartaoVisa();
        c.setNomeTitular("Italo");
        c.setNumero(29382338);
        v.total = 5657;
        v.realizarPagamento(c);
        System.out.println(" ");

        c = new CartaoMasterCard();
        c.setNomeTitular("Lucas");
        c.setNumero(38723846);
        v.total = 5657;
        v.realizarPagamento(c);
        System.out.println(" ");
    }
}
