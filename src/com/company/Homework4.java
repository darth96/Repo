package com.company;


public class Homework4 {
    public static void main(String[] args) {
       String sentence_3  = "Hello dear, how are you?";
       int lengthOfSentence_3 =sentence_3.length();
       boolean resultValue = lengthOfSentence_3 > 10? true :false;
        System.out.println(lengthOfSentence_3);
        System.out.println(resultValue);
        String sentence_4 = "We all ARe Good ProgRommer";
        String sentence_4LowCase =sentence_4.toLowerCase();
        String newSentence_4 = sentence_4LowCase.replace('r','f');
        System.out.println(newSentence_4);
        String fullName = "Malenkov Merveille";
        int lengthOfFullName = fullName.length();
        String fullNameLowCase = fullName.toLowerCase();
        boolean fullNameStartK = fullNameLowCase.startsWith("k");
        boolean fullNameContainA = fullNameLowCase.contains("a");
        System.out.println(lengthOfFullName);
        System.out.println(fullNameStartK);
        System.out.println(fullNameContainA);
    }
}
