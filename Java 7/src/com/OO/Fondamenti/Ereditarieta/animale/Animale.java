package com.OO.Fondamenti.Ereditarieta.animale;

public class Animale {

    int occhi;
    int bocca;
    int altezza;
    String nome;

    public Animale(int occhi, int bocca, int altezza, String nome) {
        this.occhi = occhi;
        this.bocca = bocca;
        this.altezza = altezza;
        this.nome = nome;
    }

    public void corri(){
        System.out.println("corro Class: Animale");
    }

    public void parla(){

        System.out.println("parlo Class: Animale");

    }


}
