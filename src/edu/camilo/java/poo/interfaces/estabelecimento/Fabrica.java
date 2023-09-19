package edu.camilo.java.poo.interfaces.estabelecimento;

import edu.camilo.java.poo.interfaces.equipamento.impressora.Impressora;
import edu.camilo.java.poo.interfaces.mult.EquipamentoMult;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMult mult = new EquipamentoMult();
        mult.copiar();
        mult.digitalizar();
    }
}
