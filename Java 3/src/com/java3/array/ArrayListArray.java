package com.java3.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListArray {

    //int arrayNumeriInteri[] = new int[]{5,6,5,7}; // C-Style


    public static void main(String args[]) {

        System.out.println("** ARRAY **");

        /** ARRAY */
        int[] arrayNumeriInteri = new int[]{5, 6, 15, 7555}; // Java-Style

        System.out.println(arrayNumeriInteri[0]); //valore 5
        System.out.println(arrayNumeriInteri[3]); //valore 7555

        int[] arrayNumeriInteri2 = new int[5]; // Java-Style

        arrayNumeriInteri2[0] = 10;
        arrayNumeriInteri2[4] = 1056;

        System.out.println(arrayNumeriInteri2[1]); //valore 0 perchè non valorizzato
        System.out.println(arrayNumeriInteri2[4]); //valore 1056

        System.out.println(" ");
        System.out.println("** ARRAY LIST **");

        /** ARRAY LIST*/
        List<String> listaNomi = new ArrayList<>(50);

        listaNomi.add("Giovanni");
        listaNomi.add("Frank");
        listaNomi.add("Mattia");
        listaNomi.add("Greg");

        System.out.println(listaNomi.get(0)); // stampa Giovanni
        System.out.println(listaNomi.get(3)); // stampa Greg

        System.out.println(" ");
        System.out.println("** HASH MAP **");

        /** HASH MAP */

        HashMap<String, String> listaNomiHash = new HashMap<>();

        listaNomiHash.put("Nome1", "Giovanni");
        listaNomiHash.put("Nome2", "Frank");
        listaNomiHash.put("Nome3", "Mattia");
        listaNomiHash.put("Nome4", "Greg");

        System.out.println(listaNomiHash.get("Nome2")); // stampa Frank
        System.out.println(listaNomiHash.get("Nome3")); // stampa Mattia

    }

}
