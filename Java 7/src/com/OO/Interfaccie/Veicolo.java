package com.OO.Interfaccie;

public abstract class Veicolo {

    int velocita;
    int accelerazione;
    int maxVel;

    public Veicolo(int velocita, int accelerazione, int maxVel) {
        this.velocita = velocita;
        this.accelerazione = accelerazione;
        this.maxVel = maxVel;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public int getAccelerazione() {
        return accelerazione;
    }

    public void setAccelerazione(int accelerazione) {
        this.accelerazione = accelerazione;
    }

    public int getMaxVel() {
        return maxVel;
    }

    public void setMaxVel(int maxVel) {
        this.maxVel = maxVel;
    }


}
