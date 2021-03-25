package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        for (int i = 7; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        int a1 = 0;
        int a2 = 1;
        int a3;
        System.out.print(a1 + " " + a2 + " ");
        for (int i = 3; i <= 12; i++) {
            a3 = a1 + a2;
            System.out.print(a3 + " ");
            a1 = a2;
            a2 = a3;
        }

    }
}
