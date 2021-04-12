package com.company;

import java.util.*;

public class Powt {

    public static void main(String[] args){
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

}
