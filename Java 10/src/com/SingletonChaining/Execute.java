package com.SingletonChaining;

import com.SingletonChaining.Chaining.DialogExample;

public class Execute {
    public static void main(String args[]){

        Singleton.getInstance().setTrack("Crudelia").currentTrack();

        //Singleton s = new Singleton(); Non si può istanziare perchè il costruttore è privato


        new DialogExample().setTitle("title").setMessage("message");

    }
}
