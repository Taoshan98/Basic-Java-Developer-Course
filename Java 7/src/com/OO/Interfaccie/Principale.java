package com.OO.Interfaccie;

public class Principale {
    public static void main(String args[]){

        Aereo aereo = new Aereo(300, 900, 1500);
        aereo.atterra();
        aereo.decolla();
        System.out.println(aereo.getVelocita());

    }
}
