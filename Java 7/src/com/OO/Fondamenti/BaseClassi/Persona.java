package com.OO.Fondamenti.BaseClassi;

public class Persona {
    String nome;
    int anni;
    char sesso;

    public Persona(String nomeP, int anniP, char sessoP) {
        nome = nomeP;
        anni = anniP;
        sesso = sessoP;
    }

    public void stampa(){
        System.out.println("nome: " + nome + " anni: " + anni + " sesso: " + sesso);
    }

}
