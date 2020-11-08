package com.java4.condizioni;

public class Conditions {

    public static void main(String args[]) {

        /** If Else */
        int soldi = 7;

        if (soldi >= 10){
            System.out.println("Posso comprarmi una pizza!");
        }else if ((soldi >= 5) && (soldi < 10)){
            System.out.println("Posso comprarmi un panino!");
        }else{
            System.out.println("Non Posso comprarmi niente !");
        }


        /** Switch case */
        switch (soldi){
            case 0:
                System.out.println("Hai 0 Euro");
                break;
            case 1:
                System.out.println("Hai 1 Euro");
                break;
            case 2:
                System.out.println("Hai 2 Euro");
                break;
            case 3:
                System.out.println("Hai 3 Euro");
                break;
            default:
                System.out.println("Hai dei soldi, Credo");
                break;

        }

    }
}
