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
public class MensagemDiaDosNamorados extends CartaoMensagem {

    public MensagemDiaDosNamorados(String destinatario) {
        this.setDestinatario(destinatario);
    }

    @Override
    public void retornarMensagem(String remetente) {
        System.out.println("Olá " + this.getDestinatario() + ", Feliz Dia dos Namorados!!"
                + " Espero que tenha gostado do meu cartão de dia dos namorados!"
                + " De todo meu coração," + remetente);
    }

}
