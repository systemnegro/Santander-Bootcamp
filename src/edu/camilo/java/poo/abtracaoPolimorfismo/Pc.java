package edu.camilo.java.poo.abtracaoPolimorfismo;

import edu.camilo.java.poo.abtracaoPolimorfismo.apps.Facebook;
import edu.camilo.java.poo.abtracaoPolimorfismo.apps.MSN;
import edu.camilo.java.poo.abtracaoPolimorfismo.apps.ServicoMensagem;
import edu.camilo.java.poo.abtracaoPolimorfismo.apps.Telegram;

public class Pc {
    public static void main(String[] args) {
        ServicoMensagem sm = null;
        String appEscolhido = "Telegram";

        if(appEscolhido.equals("Telegram")){
            sm = new Telegram();
        }else if(appEscolhido.equals("MSN")){
            sm = new MSN();
        }else{
            sm = new Facebook();
        }

        sm.enviarMensagem();
        sm.receberMensagem();
    }
}
