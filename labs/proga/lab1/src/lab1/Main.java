package src.lab1;

import src.lab1.arrays.ArrayW;
import src.lab1.arrays.ArrayX;
import src.lab1.arrays.MatrixK;
import src.lab1.utils.Printer;

public class Main {
    public static void main(String... args) {
        short[] w = ArrayW.create(3, 15);
        float[] x = ArrayX.create(-8f, 3f, 18);
        float[][] k = MatrixK.create(w, x);

        Printer.printArray(w);
        Printer.printArray(x);
        Printer.printMatrix(k);
    }
}
