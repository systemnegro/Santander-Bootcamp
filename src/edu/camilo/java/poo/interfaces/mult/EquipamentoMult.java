package edu.camilo.java.poo.interfaces.mult;

import edu.camilo.java.poo.interfaces.equipamento.copiadora.Copiadora;
import edu.camilo.java.poo.interfaces.equipamento.digitalizadora.Digitalizadora;
import edu.camilo.java.poo.interfaces.equipamento.impressora.Impressora;

public class EquipamentoMult implements Copiadora, Impressora, Digitalizadora {
    @Override
    public void copiar() {
        System.out.println("Copiando via mult");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via mult");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via mult");
    }
}
