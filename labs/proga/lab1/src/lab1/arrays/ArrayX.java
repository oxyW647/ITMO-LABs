package src.lab1.arrays;

public class ArrayX {
    public static float[] create(float minValue, float maxValue, int arraySize) {
        float[] w = new float[arraySize];

        for (int i = 0; i < w.length; ++i) {
            w[i] = (float) Math.random() * (maxValue - minValue) + minValue;
        }

        return w;
    }
}
