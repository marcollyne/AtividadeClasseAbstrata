/*
 Crie uma classe abstrata chamada CartaoMensagem. Essa classe representa todos os
tipos de cartões de mensagem contendo um atributo chamado destinatário. Nessa classe
você deverá também declarar o método retornarMensagem(remetente).Crie três classes
filhas (subclasses) da classe CartaoMensagem: 
- MensagemDiaDosNamorados
- MensagemNatal
- MensagemAniversario.
Cada uma dessas classes deve conter um método construtor que receba o nome do
destinatário do cartão. Cada classe também deve implementar o método retornarMensagem
(remetente), retornando uma mensagem ao usuário com o nome do destinatário, um texto 
que seja especifico para a data comemorativa do cartão, acrescido do remetente ao
final da mensagem. Exemplo de mensagem do dia dos namorados: “Querida Maria, Feliz Dia dos
Namorados! Espero que esse tenha gostado do meu cartão de dia dos namorados! De todo meu
coração,João”

remetente quem envia
destinatário quem recebe
 */
package exercicio2;

/**
 *
 * @author karol
 */
public abstract class CartaoMensagem {
   private String destinatario;

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
   
   public abstract void retornarMensagem(String remetente);
}
