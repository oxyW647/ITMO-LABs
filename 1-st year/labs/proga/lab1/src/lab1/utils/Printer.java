package src.lab1.utils;

import java.util.Arrays;

public class Printer {
    public static void printArray(short[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(float[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printMatrix(float[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%12.3f", matrix[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
