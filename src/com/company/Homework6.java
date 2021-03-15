package com.company;

public class Homework6 {
    final static int MAXSCORE = 700;


    public static void main(String[] args) {


        int studentScore = 1000;
        int gradePercent = (studentScore * 100) / MAXSCORE;
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

           int divisible = 15;
           if (divisible / 3 !=0)
               System.out.println("divisible by 3 ");
           else if (divisible / 5 !=0)
               System.out.println("divisible by 5");
           else if (divisible / 3 !=0 && divisible / 5 !=0)
               System.out.println("divisible by both");
           else System.out.println(divisible);

           String carGear = "d";
           String driveType = "";
           switch (carGear.toUpperCase()) {
               case "P":
                   System.out.println("You can park the gear");
                   break;
               case"D":
                   if (driveType.toLowerCase() == "snow")
                       System.out.println("You are on snow mode ");
                   else if (driveType.toLowerCase() == "eco")
                       System.out.println("You are on eco mode");
                   else if (driveType.toLowerCase() == "Sport")
                       System.out.println("You are on sport mode");else System.out.println("Need valid drivetype" + driveType);
                   break;
                   case"N":
                       System.out.println("Put car in car wash");case "R":
                   System.out.println("Reverse the car");break;
                   }
           }





    }


