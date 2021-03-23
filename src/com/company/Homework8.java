package com.company;



public class Homework8 {
    public static void main(String[] args) {
        //Reverse String
        String word ="racecaR";
        String reverseWord= "";
        String[] wordArray =word.split("");
        for (int i=wordArray.length-1; i>=0; i--)
            reverseWord= reverseWord + wordArray[i];
        System.out.println("reverseWord= " + reverseWord);
        boolean isPalindrome=true;
        if (reverseWord.equalsIgnoreCase(word))
            System.out.println(isPalindrome);
        else
            System.out.println("this isnt palindrome");

        //Add array numbers
        double [] doubleArray = {11.23, 43.3, 34, 65.76, 87};
        double total = 0;
        for (int i=0; i<doubleArray.length; i++ )
            total= total + doubleArray[i];
        System.out.println(total);


        //Prime number
        boolean isPrime= true;
        int num= 11;
        // for (int i=2 ;i<num; i++)
        if (num%1==num && num%num==num)
            System.out.println(isPrime);
        else
            System.out.println("This isnt prime");


        }


        }










