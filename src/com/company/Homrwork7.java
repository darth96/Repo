package com.company;



public class Homrwork7 {
    public static void main(String[] args) {
        String sentence1 = "hApPY nEW yeAr";
        System.out.println(sentence1);
        String[] arrSentence1 = sentence1.split(" ");
        for (String value : arrSentence1) {
            System.out.print(value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase()+ "\n");
        }

        String sentence2 = "Lab sessIONS clAsses";
        String [] arrSentence2 = sentence2.split(" ");
        for (String s : arrSentence2) {
            System.out.print("This is " + s.substring(0, 1).toUpperCase() + "\n");
        }

        String sentence3 ="happy holidays";
        for (int i=sentence3.length()-1 ; i>=0; i--){
            System.out.print( sentence3.charAt(i)) ;

        }

    }
}
