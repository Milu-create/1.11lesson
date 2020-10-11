package com.company;

import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int[][] x = new int[n][n];
        pobochDiagMatr(x);
        upPobochDiagMatr(x);
        downPobochDiagMatr(x);
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++) System.out.print(x[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void upPobochDiagMatr(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                if(i + j < x[i].length - 1) x[i][j] = 0;
            }
        }
    }

    public static void downPobochDiagMatr(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                if(i + j > x[i].length - 1) x[i][j] = 2;
            }
        }
    }

    public static void pobochDiagMatr(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                if(i+j == x[i].length-1) x[i][j] = 1;
            }
        }
    }
}
