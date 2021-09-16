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
public class CartaoVisa extends Cartao {

    double percentualDesconto;

    @Override
    public double ConsultarPencentual(double valor) {
        double totalComDesconto = valor - (valor * 0.9);
        return totalComDesconto;
    }

}
