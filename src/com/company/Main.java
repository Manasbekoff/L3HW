package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String [] names = {"Асыл", "Аман", "Азат"};
        String [] namez = Arrays.copyOf(names, names.length);
        namez[1] = "Саян";

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("Здравствуйте, " + names[0] + "!");
                    System.out.println("Доброе утро, " + names[0]);
                    break;
                case 1:
                    System.out.println("Здравствуйте, " + names[1] + "!");
                    System.out.println("Доброго дня, " + names[1]);
                    break;
                case 2:
                    System.out.println("Здравствуйте, " + names[2] + "!");
                    System.out.println("Добрый вечер, " + names[2]);
                    break;
                case 3:
                    System.out.println("Здравствуйте, " + namez[1] + "!");
                    System.out.println("Добрый ночи, " + namez[1]);


            }
        }
    }
}