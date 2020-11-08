package com.java5.loops;

public class Loops {

    public static void main(String args[]) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int leggo;

        for (int i = 0; i < array.length; ) {
            leggo = array[i];
            if (leggo == 5) {
                System.out.println("FOR: il valore è stato trovato alla posizione " + i);
            }

            i++;
        }

        int y = 0;
        while (y < array.length) {
            leggo = array[y];
            if (leggo == 10) {
                System.out.println("WHIL E: il valore è stato trovato alla posizione " + y);
            }
            y++;
        }

        int x = 0;
        do {
            leggo = array[x];
            if (leggo == 7) {
                System.out.println("WHIL E: il valore è stato trovato alla posizione " + x);
            }
            x++;
        } while (x < array.length);

    }

}
