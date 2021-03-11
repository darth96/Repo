package com.company;

import java.util.Arrays;


public class Homework5 {
    public static void main(String[] args) {
        String[] fullNam = new String[2];
        fullNam[0] = "Malenkov";
        fullNam[1] = "Merveille";
        String fullNamlowCase = fullNam[0] + fullNam[1].toLowerCase();
        boolean isFullNamStartK = fullNamlowCase.startsWith("k");
        boolean isFullNamEndA = fullNamlowCase.endsWith("a");
        System.out.println(Arrays.toString(fullNam).substring(1, 20));
        System.out.println(isFullNamStartK);
        int lengthOf_1Name = fullNam[0].length();
        System.out.println(lengthOf_1Name);
        //System.out.println(isFullNamEndA);
        if (!fullNam[1].isEmpty())   {
            System.out.println(isFullNamEndA);
        } else {
            System.out.println("No last name entered");
        } if(!fullNam[1].isEmpty()) {
            System.out.println(Arrays.toString(fullNam).charAt(1));
        } else {
            System.out.println("No last name entered");
        }



    }
}
