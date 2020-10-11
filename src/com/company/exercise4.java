package com.company;

import java.util.Scanner;

public class exercise4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int[][] tabl = new int[a][b];
        int i = 0, j = 0;
        do {
            tabl[i][j] = i * j;
            if(j < b - 1) j++;
            else {
                i++;
                j = 0;
            }
        }while(i <= a - 1);
        i = 0;
        j = 0;
        do {
            System.out.printf("%4d", tabl[i][j]);
            if(j < b - 1) j++;
            else {
                i++;
                j = 0;
                System.out.print("\n");
            }
        }while(i <= a - 1);
    }
}