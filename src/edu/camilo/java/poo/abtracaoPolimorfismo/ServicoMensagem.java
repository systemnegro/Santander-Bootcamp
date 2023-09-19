package edu.camilo.java.poo.abtracaoPolimorfismo;

public abstract class ServicoMensagem {
    public abstract void  enviarMensagem();
    public  abstract  void receberMensagem();
    protected void validarConexao(){
        System.out.println("Validando se está conectado a internet");
    }
}
