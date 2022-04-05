package com.company;
import java.util.Scanner;

public class CWH_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //System.out.println("Enter the student name");
      //  int name = sc.nextInt();
        System.out.println("enter the marks of  sub1");
        int a = sc.nextInt();
        System.out.println("enter the marks of sub2");
        int b = sc.nextInt();
        System.out.println("enter the marks of sub3");
        int c = sc.nextInt();
        System.out.println("enter the marks of sub4");
        int d= sc.nextInt();
        System.out.println("enter the marks of sub5");
        int e = sc.nextInt();
        int totalmark = a + b + c + d + e;
        int perc = totalmark/5;
        double cgpa = perc/(9.5);
        System.out.println("kool");
        System.out.println("Total mark is");
        System.out.println(totalmark);
        System.out.println("Total percentage is");
        System.out.println(perc + "%");
        System.out.println("cgpa" + cgpa);
    }
}
