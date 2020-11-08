package com.OO.Fondamenti.Ereditarieta.animale;

public class Cane extends Animale {

    int altezza;
    public Cane(int altezza, String nome) {
        super(2, 1, altezza, nome);
        this.altezza = altezza;
        this.nome = nome;
    }

    /*public void corri() {
        System.out.println("Corro Class: Cane");
    }*/

    public void parla() {
        System.out.println("Corro Class: Cane");
    }
}
