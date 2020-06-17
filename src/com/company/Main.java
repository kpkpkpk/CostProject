package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int cost = (a*100)*n + (b*n);


        System.out.println((cost/100)+"  "+(cost%100)); //вывод результата

    }
}
