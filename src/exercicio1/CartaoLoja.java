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
public class CartaoLoja extends Cartao {

    @Override
    public double ConsultarPencentual(double valor) {
        double totalComDesconto = valor - (valor * 0.8);
        return totalComDesconto;

    }

}
