package org.tyaa.demo.java.se.methods;

import static org.tyaa.demo.java.se.lib.MathUtils.createTable;

public class Main {

    public static void main(String[] args) {
        printTable(createTable());
    }

    public static void printTable(int[][] table) {
        // print the table
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%4s", table[i][j]);
            }
            System.out.println();
        }
    }
}
