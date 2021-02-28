package com.company;

public class Homework3 {
    public static void main(String[] args) {
        double cToFTemp = 6;
        double fToCTemp = cToFTemp * 9/5 +32;
        System.out.println("C= " + fToCTemp + "F");
        double cToKTemp = 6;
        double kToCTemp = cToKTemp + 273.15;
        System.out.println("C= " + kToCTemp + "K");
        System.out.println("f= " + cToFTemp + "C");
        double fToKTemp = 42.8;
        double kToFTemp = (fToKTemp + 459.67) * 5/9;
        System.out.println("F= " + kToFTemp + "K");
        System.out.println("K= " + fToKTemp + "F");
        double kCTemp = 279.15;
        double cKTemp = kCTemp - 273.15;
        System.out.println("K= " + cKTemp + "C");

    }
}
