package com.src;
import java.math.BigInteger;
public class Test1 {
    public static BigInteger add(int maxVal) {
        BigInteger value = BigInteger.ZERO;
        BigInteger lastValue = BigInteger.ZERO;
        BigInteger nextValue = BigInteger.ZERO;

        for (int i = 0; i <= maxVal; ++i) {
            if (i == 1) {
                value = BigInteger.ONE;
            }
            nextValue = value.add(lastValue);

            if (i >= 2) {
                lastValue = value;
                value = nextValue;
            }
        }
        return nextValue;
    }
}
