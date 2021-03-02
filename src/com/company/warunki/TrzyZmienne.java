package com.company.warunki;

public class TrzyZmienne {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 3;

        if( a > b){
            if(a > c){
                if(b > c){
                    System.out.println(c + " " + b +" " + a );
                }
                else {
                    System.out.println(b + " " + c + " " + a);
                }
            }
            else
            {

            }
        }
        else{
            if(b > c){
                if(a > c){
                    System.out.println(c + " " + a + " " + b);
                }
            }

        }

    }
}
