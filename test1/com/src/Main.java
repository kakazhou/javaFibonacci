package com.src;
import java.math.BigInteger;
import com.src.Test1;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("args error!");
            return;
        }
        int maxval = Integer.parseInt(args[0]);
        BigInteger res = Test1.add(maxval);
        System.out.println(String.format("第个%d值是：%d", maxval, res));
    }
}
