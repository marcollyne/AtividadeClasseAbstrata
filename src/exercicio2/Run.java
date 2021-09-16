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
public class Run {

    public static void main(String[] args) {
        CartaoMensagem cm = new MensagemDiaDosNamorados("Karollyne");
        cm.retornarMensagem("Italo");
        System.out.println(" ");

        cm = new MensagemAniversario("Lucas");
        cm.retornarMensagem("Fernanda");
        System.out.println(" ");

        cm = new MensagemNatal("Emanuel");
        cm.retornarMensagem("Luisa");
        System.out.println(" ");
    }
}
