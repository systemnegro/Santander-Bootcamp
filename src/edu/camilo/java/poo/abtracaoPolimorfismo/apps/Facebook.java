package edu.camilo.java.poo.abtracaoPolimorfismo.apps;

public class Facebook extends ServicoMensagem {
    public void enviarMensagem(){
        validarConexao();
        System.out.println("Enviando mensagem pelo Facebook");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
