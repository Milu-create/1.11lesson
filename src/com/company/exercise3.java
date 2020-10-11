package com.company;

import java.util.Scanner;

public class exercise3{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) a[i][j] = scan.nextInt();
        }
        if(issemetr(a, n)) System.out.print("yes");
        else System.out.print("no");
    }

    private static boolean issemetr(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (a[i][i + j] != a[i + j][i]) return false;
            }
        }
        return true;
    }
}