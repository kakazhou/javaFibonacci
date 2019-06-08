package com.src;

import static com.src.Test1.add;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("args error!");
            return;
        }
        int maxval = Integer.parseInt(args[0]);
        long res =  add(maxval);
        System.out.println(String.format("第个%d值是：%d", maxval, res));
    }
}
