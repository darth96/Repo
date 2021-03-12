package com.company;

public class classwork {
    public static void main(String[] args) {
        String monthName = "";
        switch (monthName.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                 System.out.println("winter season");
            break;
            case "march":
            case "april":
            case "may":
                System.out.println("summer season");
            break;
            case "june":
            case "july":
            case "august":
                System.out.println("fall season");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("spring seasos");
                break;
            default:
                System.out.println("Invalid month name");






        }

    }
}
