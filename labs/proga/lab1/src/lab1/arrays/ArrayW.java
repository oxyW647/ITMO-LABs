package src.lab1.arrays;

public class ArrayW {
    public static short[] create(int firstValue, int lastValue) {
        short[] b = new short[(lastValue - firstValue) / 2 + 1];

        for (int i = 0; i < b.length; ++i) {
            b[i] = (short) (firstValue + i * 2);
        }

        return b;
    }
}
