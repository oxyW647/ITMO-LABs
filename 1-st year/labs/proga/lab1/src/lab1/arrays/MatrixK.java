package src.lab1.arrays;

public class MatrixK {
    public static float[][] create(short[] ArrayW, float[] ArrayX) {
        float[][] k = new float[ArrayX.length][ArrayW.length];

        for (int i = 0; i < k.length; ++i) {
            for (int j = 0; j < k[i].length; ++j) {
                float x = ArrayX[i];
                float w = ArrayW[j];
                float result = fillMatrix(x, w);
                k[i][j] = result;
            }
        }

        return k;
    }

    private static float fillMatrix(float x, float w) {
        float result;
        if (w == 5) {
            result = (float) Math.pow((4 + Math.cos(Math.tan(x))), 2.);
        } else if (w == 9 || w == 11 || w == 15) {
            result = (float) (Math.pow(Math.cos(Math.tan(x)),
                    (Math.exp(Math.cbrt(x)) + 1) / Math.log(Math.pow(2 * Math.abs(x), x))));
        } else {
            result = (float) Math.cos(Math.pow(
                    3.0 - 0.25
                            * Math.pow(Math.pow((2.0 / 3.0 - x) / 3.0, x) + 1.0, Math.pow(x / (x + 1.0), 2.0)),
                    3.0));
        }
        return result;
    }
}
