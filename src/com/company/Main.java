package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(100);
        List<Integer> array2 = new ArrayList<>(50);
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            array.add(r.nextInt(100));
        }
        for (int i = 0; i < 50; i++) {
            array2.add(r.nextInt(100));
        }

        Collections.sort(array);
        Collections.sort(array2);

        System.out.println("1. Pole ");
        for (Integer integer : array){
            System.out.print(integer);
            System.out.print(" ");
        }

        System.out.println(" ");
        System.out.println("2. Pole ");
        for (Integer integer2 : array2){
            System.out.print(integer2);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        boolean anone = array.equals(array2);
        if (anone){
            System.out.println("Pole jsou stejné");
        } else {
            System.out.println("Pole nejsou stejné");



        }

    }
}




