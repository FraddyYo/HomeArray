package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int[] array = new int[3];
        double[] array2 = {1.57, 7.654, 9.986};
        int[] month = new int[12];

        // Задание 2.1
        int[] arrayThird = {1, 2, 3};
        arrayThird[0] = 1;
        for (int i = 0; i < arrayThird.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(arrayThird[i]);
        }
        System.out.println();

        // Задание 2.2
        {
            double[] arrayFractions = {1.57, 7.654, 9.986};
            for (int y = 0; y < arrayFractions.length; y++) {
                if (y > 0) {
                    System.out.print(",");
                }
                System.out.print(arrayFractions[y]);
            }
            System.out.println();
            // Задание 2.3
            {
                int[] arrayMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
                arrayMonth[0] = 1;
                for (int i = 0; i < arrayMonth.length; i++) {
                    if (i > 0) {
                        System.out.print(",");
                    }
                    System.out.print(arrayMonth[i]);
                }
                System.out.println();
                // Задание 3.1
                int[] arrayThird1 = {1, 2, 3};
                arrayThird1[0] = 1;
                for (int i = arrayThird1.length - 1; i >= 0; i--) {
                    if (i <= 1) {
                        System.out.print(",");
                    }
                    System.out.print(arrayThird1[i]);
                }
                System.out.println();
                // Задание 3.2
                double[] arrayFractions1 = {1.57, 7.654, 9.986};
                for (int i1 = arrayFractions1.length - 1; i1 >= 0; i1--) {
                    if (i1 <= 1) {
                        System.out.print(",");
                    }
                    System.out.print(arrayFractions1[i1]);
                }
                System.out.println();
                // Задание 3.3
                int[] arrayMonth1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
                for (int i = arrayMonth.length - 1; i >= 0; i--) {
                    if (i <= 10) {
                        System.out.print(",");
                    }
                    System.out.print(arrayMonth1[i]);
                }
                System.out.println();
                // Задание 4.1
                int[] arrayThird2 = {1, 2, 3};
                for (int i = 0; i < arrayThird2.length; i++) {
                    if (i % 2 != 0)
                        i++;
                    {
                        System.out.print(",");
                    }
                    System.out.print(arrayThird2[i]);
                }
            }
        }
    }
}






















