package fr.ubordeaux.ao;

import java.lang.StringBuilder;

public class Utility {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generateRandomString(int size) {
        StringBuilder builder = new StringBuilder();

        while (size-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }

        return builder.toString();
    }

    public static String[] generateRandomArray(int size, int n) {
        String[] out = new String[n];

        for (int i = 0; i < n; i++) {
            out[i] = generateRandomString(size);
        }

        return out;
    }
}
