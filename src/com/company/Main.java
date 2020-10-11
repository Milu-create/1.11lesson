package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int m = a.nextInt();
        int[][] z = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) z[i][j] = a.nextInt();
        }
        System.out.println(m+" "+n);
        for (int i=0; i<m; i++){
            for(int j=n-1; j>-1; j--) System.out.print(z[j][i]+" ");
            System.out.print('\n');
        }
    }
}
