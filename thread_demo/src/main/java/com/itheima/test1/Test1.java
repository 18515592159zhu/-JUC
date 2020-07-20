package com.itheima.test1;

import java.util.Vector;

public class Test1 {
    public void test() {
        Vector<Integer> vector = new Vector<Integer>();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        System.out.println(vector);
    }
}