package edu.camilo.java.sintaxe;

public class SmartTv {
    boolean  ligada = false;
    int canal = 11,volume =30;

    private void ligar(){
        ligada = true;
    }
    public void desligar(){
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


