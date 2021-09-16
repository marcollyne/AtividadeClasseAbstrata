/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author karol
 */
public class MensagemNatal extends CartaoMensagem {

    public MensagemNatal(String destinatario) {
        this.setDestinatario(destinatario);
    }

    @Override
    public void retornarMensagem(String remetente) {
        System.out.println("Olá " + this.getDestinatario() + ", Feliz Natal!!"
                + " Espero que tenha gostado do meu cartão nesse dia especial!"
                + " De todo meu coração," + remetente);
    }

}
