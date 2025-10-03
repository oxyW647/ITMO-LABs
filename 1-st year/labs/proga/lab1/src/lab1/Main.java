package src.lab1;

import src.lab1.arrays.ArrayW;
import src.lab1.arrays.ArrayX;
import src.lab1.arrays.MatrixK;
import src.lab1.utils.Printer;

public class Main {
    private static final int ARR1_FIRST_VALUE = 3, ARR1_LAST_VALUE = 15;

    private static final float ARR2_MIN_VALUE = -8f, ARR2_MAX_VALUE = 3f;
    private static final int ARR2_SIZE = 18;

    public static void main(String... args) {
        short[] w = ArrayW.create(ARR1_FIRST_VALUE, ARR1_LAST_VALUE);
        float[] x = ArrayX.create(ARR2_MIN_VALUE, ARR2_MAX_VALUE, ARR2_SIZE);
        float[][] k = MatrixK.create(w, x);

        Printer.printArray(w);
        Printer.printArray(x);
        Printer.printMatrix(k);
    }
}
