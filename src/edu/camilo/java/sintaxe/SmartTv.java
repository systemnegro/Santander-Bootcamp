package edu.camilo.java.sintaxe;

public class SmartTv {
    boolean ligada = false;
    int canal = 11,volume =30;

    public void ligar(){
        ligada = true;
    }
    public void deslogar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void abaixarVolume(){
        volume--;
    }
    public void mudarCanal(int novocanal){
        canal = novocanal;
    }

}


