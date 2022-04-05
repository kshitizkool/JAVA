package com.company;

import java.util.Scanner;

public class CWH_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dist in km");
        double km = sc.nextInt();
        double mile = km*1.6;
        System.out.println("miles is" + mile);

    }
}
