package edu.camilo.java.poo.abtracaoPolimorfismo.apps;

public class MSN extends ServicoMensagem {
    public void enviarMensagem(){
        validarConexao();
        System.out.println("Enviando mensagem pelo MSN");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN");
    }
}
