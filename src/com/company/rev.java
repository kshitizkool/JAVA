package com.company;

class rev {
    public static void main (String[] args) {

        String str= "kshitiz", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("kshitiz"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
        String value = str.toUpperCase();
        System.out.println("case change:"+ str.toUpperCase());
        System.out.println("string comparison(T?F)");
        System.out.println(str.equals(nstr));
        System.out.println("Concatenation");
        String s="kshitiz" + " kumar 2005669";
        System.out.println(s);
    }
}
