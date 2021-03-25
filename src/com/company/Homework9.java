package com.company;

public class Homework9 {
    final static int MAXSCORE =700;


    public static void main(String[] args) {


       titleCase("happy new year");
        grade(100);
        reverseInt("10 9 8 7 6 5");
        numberWords("i need");


    }
    public static String titleCase ( String titleCase) {
        // method to title case a string
        String sentence1 =""+ titleCase ;
        String[] arrSentence1 = sentence1.split(" ");
        for (String value : arrSentence1) {
            System.out.print(value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase()+ " ");

        }
       return sentence1;

    }
    public static int grade(int myGrade){
        //method to give student grade
        int gradePercent = (myGrade * 100) / MAXSCORE;
        char [] studentGrade = {'A', 'B', 'C', 'D', 'E', 'F'};
        if(gradePercent >=91 &&  gradePercent <=100)
            System.out.println("Your grade is: " + studentGrade[0]);
        else if (gradePercent >=81 && gradePercent <=90)
            System.out.println("Your grade is: " + studentGrade[1]);
        else if (gradePercent >=71 && gradePercent <=80)
            System.out.println("Your grade is: " + studentGrade[2]);
        else if (gradePercent >=61 && gradePercent <=70)
            System.out.println("Your grade is: " + studentGrade[3]);
        else if ( gradePercent >=51 && gradePercent <=60)
            System.out.println("Your grade is: " + studentGrade[4]);
        else if (gradePercent <= 50)
            System.out.println("Your grade is: " + studentGrade[5]);
        else System.out.println("Incorrect data");


        return gradePercent;
    }
    public static String reverseInt (String myReverse){
      // method to reverse int
        String reverseNumber= "";
        String[] myreverseArray =myReverse.split("");
        for (int i=myReverse.length()-1; i>=0; i--)
            reverseNumber += myreverseArray[i];
          System.out.println(reverseNumber);


        return reverseNumber;
    }
    public static String numberWords ( String myWord){
        //method to return number words
        String word = "".trim() +myWord;
        int numbword = word.length();
        System.out.println(numbword);

        return word;
    }

}
