package com.god.card.poker;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 10);
            b[i] = (int)(Math.random() * 10);
        }
        Appear.print(a);
        System.out.println();
        Appear.print(b);
    }
}