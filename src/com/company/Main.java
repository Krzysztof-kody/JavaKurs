package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] A = { 4, 1, 7, 3, 9, 0};
        int c;

        for(int ii = 0; ii<A.length-1; ii++) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {
                    c = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = c;
                }
            }
        }
        for(int x: A){
            System.out.print(x + " ");
        }


    }
}
