package com.OO.Interfaccie;

public class Aereo extends Veicolo implements Volante {

    public Aereo(int velocita, int accelerazione, int maxVel) {
        super(velocita, accelerazione, maxVel);
    }

    @Override
    public void decolla() {
        System.out.println("Decolla");
    }

    @Override
    public void atterra() {
        System.out.println("Atterra");
    }
}
