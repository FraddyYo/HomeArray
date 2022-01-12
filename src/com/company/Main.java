package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int[] array = new int[3];
        double[] array2 = {1.57, 7.654, 9.986};
        int[] month = new int[12];

        // Задание 2
        int[] arrayThird = {1, 2, 3};
        arrayThird[0] = 1;
        for (int i = 0; i < arrayThird.length; i++) {
            arrayThird[i] = i + 1;
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(arrayThird[i]);
        }
        {
            System.out.println();
        }
        // Задание 2.1
        {
            double[] arrayFractions = {1.57, 7.654, 9.986};
            for (int y = 0; y < arrayFractions.length; y++) {
                System.out.print(arrayFractions[y] + ",");
                if (arrayFractions[y] == arrayFractions.length - 1) ;


            }
        }
    }
}















