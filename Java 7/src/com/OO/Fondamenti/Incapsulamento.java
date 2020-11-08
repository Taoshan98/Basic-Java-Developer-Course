package com.OO.Fondamenti;

public class Incapsulamento {

    private int eta;

    public void setEta(int eta) {

        if (eta > 18){
            System.out.println("Sei Maggiorenne");
            this.eta = eta;
        }else{
            System.out.println("Sei troppo piccolo per giocare");
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public int getEta() {
        return eta;
    }

    public String getNome() {
        return nome;
    }

    private static class Esegui {
        public static void main(String args[]) {

            Incapsulamento inc = new Incapsulamento();

            inc.setEta(100);

            System.out.println(inc.getEta());
        }
    }
}
