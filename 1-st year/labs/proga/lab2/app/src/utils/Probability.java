package utils;

public class Probability {
    public static Boolean gen(double probabilityValue) {
        if (Math.random() <= probabilityValue) {
            return true;
        } else {
            return false;
        }
    }
}
