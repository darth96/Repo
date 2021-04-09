package com.company;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

    }


       public static int[] removeOneInt(int[] myNumbers, int removedNumber){
       // int[] newArray=new int[oldArray.length];
          //if (oldArray==newArray)
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







    public static void traffic (){
        int speedLimit =0;
        int myPoints = 0;
        int count =+5;
     if (speedLimit>=70 && speedLimit<=74)
         System.out.println("have a nice day");
    else if (speedLimit>=75 &&speedLimit >80)
         System.out.println();

    }






    }


