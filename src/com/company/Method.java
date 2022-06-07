package com.company;

public class Method {
    /**
     * произведение чисел
     *
     */
    public static void multiplication(int[] mas) {
        int mult = 1;
        for (int i = 0; i < mas.length; i++) {
            mult *= mas[i];
        }
        System.out.println("Произведение чисел массива: " + mult);
    }
}
