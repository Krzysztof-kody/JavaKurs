package com.company;

import java.util.*;

public class Powt {

    static void czytanie(){
        Scanner sc = new Scanner(System.in); // liczb
        Scanner st = new Scanner(System.in); // linii
        String s1;

        System.out.println("Podaj imie: ");
        s1 = st.nextLine();
        System.out.println("Podano 1: " + s1);
        int i;
        System.out.println("Podaj i: ");
        i = sc.nextInt();
        System.out.println("Kwadrat podanej liczby wynosi: " + (i*i));

        double n;
        System.out.println("Podaj n: ");
        n = sc.nextDouble();
        System.out.println("Kwadrat podanej liczby wynosi: " + (n*n));

        System.out.println("Podaj kolejne imie : ");
        s1 = st.nextLine();
        System.out.println("Podano 2: " + s1);
    }

    static void nWypisz(String s, int n){
        for(int i = 0;i<n; i++){
            System.out.print(s);
        }
    }

    public static void main(String[] args){
        // czytanie();
        // nWypisz("Tekst", 10);

    }

}
