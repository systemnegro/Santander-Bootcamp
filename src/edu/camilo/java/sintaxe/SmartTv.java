package edu.camilo.java.sintaxe;

 class SmartTv {
    boolean  ligada = false;
    int canal = 11,volume =30;

     void ligar(){
        ligada = true;
    }
     void desligar(){
        ligada = false;
    }
     void aumentarVolume(){
        volume++;
    }
     void abaixarVolume(){
        volume--;
    }
     void mudarCanal(int novocanal){
        canal = novocanal;
    }

}


