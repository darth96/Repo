package com.company;

import java.util.Arrays;



public class Homework5 {
    public static void main(String[] args) {
        String[] fullNam = new String[2];
        fullNam[0] = "Malenkov";
        fullNam[1] = "";
        String fullNamlowCase = fullNam[0] + fullNam[1].toLowerCase();
        boolean isFullNamStartK = fullNamlowCase.startsWith("k");
        boolean isFullNamEndA = fullNamlowCase.endsWith("a");
        System.out.println(Arrays.toString(fullNam));
        System.out.println(isFullNamStartK);
        int lengthOf_1Name = fullNam[0].length();
        System.out.println(lengthOf_1Name);
        if (!fullNam[1].isEmpty())   {
            System.out.println(isFullNamEndA);
        } else {
            System.out.println("No last name entered");
        } if(!fullNam[1].isEmpty()) {
            System.out.println(Arrays.toString(fullNam).charAt(1));
        } else {
            System.out.println("No last name entered");
        }

        String[] s = new String[3];
        s[0]= "hApPY";
        s[1]= "nEW";
        s[2]= "yeAr";
        String oneLetterCap = s[0].substring(0, 1).toUpperCase() +s[0].substring(1).toLowerCase();
        String twoLetterCap = s[1].substring(0, 1).toUpperCase() +s[1].substring(1).toLowerCase();
        String threeLetterCap = s[2].substring(0, 1).toUpperCase() +s[2].substring(1).toLowerCase();
        System.out.println(oneLetterCap + " " + twoLetterCap + " " +  threeLetterCap);

        String[] threeWordSentence_2 = new String [3];
        threeWordSentence_2[0]  = "Lab";
        threeWordSentence_2[1] = "sessIONS";
        threeWordSentence_2[2] = "clAsses";
        String oneAbrreviation = threeWordSentence_2[0].substring(0, 1);
        String twoAbrreviation = threeWordSentence_2[1].substring(0, 1);
        String threeAbrreviation =  threeWordSentence_2[2].substring(0, 1);
        System.out.println(oneAbrreviation + twoAbrreviation + threeAbrreviation);

        String sentence_4 = "We all aer here to learn good stuff";
        int lengthOfSentence_4 = sentence_4.length();
        System.out.println(lengthOfSentence_4);








    }
}
