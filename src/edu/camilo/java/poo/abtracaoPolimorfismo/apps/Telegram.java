package edu.camilo.java.poo.abtracaoPolimorfismo.apps;

public class Telegram extends ServicoMensagem {
    public void enviarMensagem(){
        validarConexao();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
