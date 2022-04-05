package com.company;

import java.util.Scanner;

public class CWH_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int u = sc.nextInt();
        int a = sc.nextInt();
        int s = sc.nextInt();
       // int e = sc.nextInt();
       int e = ((v*v)-(u*u))/2*a*s;
        System.out.println(e);
    }

}
