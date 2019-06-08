package com.src;

public class Test1 {
    public static long add(int maxVal) {
        long value = 0;
        long lastValue = 0;
        long nextValue = 0;

        for (int i = 0; i <= maxVal; ++i) {
            if (i == 1) {
                value = 1;
            }
            nextValue = value + lastValue;

            if (i >= 2) {
                lastValue = value;
                value = nextValue;
            }
        }
        return nextValue;
    }
}
