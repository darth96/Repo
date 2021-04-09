package com.company;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

    }


       public static int[] removeOneInt(int[] myNumbers, int removedNumber){
           int[] myNewNumb = new int[myNumbers.length-1];
           int a = 0;
           for (int i = 0; i < myNumbers.length; i++){
               if (i == removedNumber-1){
              myNewNumb[0] = myNumbers[i];
               a++;}
               else if (myNewNumb==myNumbers)
                   System.out.println(myNumbers);
           }
           return myNewNumb;


       }
















    }


