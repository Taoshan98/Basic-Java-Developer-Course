package com.SingletonChaining;

public class Singleton {
    //Esempio registratore
    private String track;
    private static Singleton mIstance;

    private Singleton (){
        //Costruttore privato
    }

    /**
     * Utilizziamo questo metodo per istanziare la nostra classe perchè essendo il nostro costruttore private ci sarà impossbilie farlo
     * In oltre se richiamassimo più volte questo metodo non andremo ad instanziare un tot di volte lo stesso oggetto ma
     * nel caso in qui c'è già un istanza della classe verrà passata quella che già esiste altrimenti, la priva volta quindi, verrà creata.
     *
     */
    public static Singleton getInstance(){
        if (mIstance == null){
            mIstance = new Singleton();
        }
        return mIstance;
    }

    public Singleton setTrack(String track) {
        this.track = track;
        return this;
    }

    public void currentTrack(){
        System.out.println(track);
    }

}
