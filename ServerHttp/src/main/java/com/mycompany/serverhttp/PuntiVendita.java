package com.mycompany.serverhttp;

import java.util.ArrayList;

public class PuntiVendita {
    private int size;
    private ArrayList<DatiPunto> lista;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<DatiPunto> getlista() {
        return lista;
    }

    public void setlistaRisultati(ArrayList<DatiPunto> puntiVendita) {
        this.lista = puntiVendita;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < lista.size();i++) s += lista.get(i).toString() + "\n";
        return s;
    }
}
