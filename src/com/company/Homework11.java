package com.company;

public class Homework11 {
    private final int maxPages = 100;
    private final int  maxToner = 100;
      int currentToner= maxToner;
     int currentPages= maxPages;
    public static void main(String[] args) {





    }

    public void print(int singleSided){
        if (singleSided>0 && singleSided<=currentPages && singleSided<=currentToner){
            currentToner= currentToner- singleSided;
            currentPages= currentPages- singleSided;
            System.out.println("printing has been successful" );
        }
            else System.out.println("Please add more pages or toner:" + " amount of current toner= " + currentToner + ", amount of current pages= "+ currentPages);





    }
    public void print(int doubleSided, String user){
        if (doubleSided>0 && doubleSided<=currentPages && doubleSided<=currentToner){
            currentToner= currentToner  - doubleSided;
            currentPages= currentPages  - doubleSided;
            currentPages= currentPages/2;
            System.out.println("printing has been successful");
        }
        else System.out.println("Please add more pages or toner:" + " amount of current toner= " + currentToner + ", amount of current pages= "+ currentPages);

    }
    public void addPages( int addedPages){
        currentPages = currentPages + addedPages;
      if (currentPages<=maxPages) {
          System.out.println("pages have been added successfully "+ "\nCurrent pages= "+ currentPages);
      } else System.out.println("incorrect amount added");


    }
    public void addToner( int addedToner){
        currentToner =currentPages + addedToner;
        if (currentToner<=maxPages) {
            System.out.println("pages have been added successfully "+ "\nCurrent toner= " + addedToner);
        } else System.out.println("incorrect amount added");
    }
    public void printersummary (){
        System.out.println("Current pages: " + currentPages +"\nCurrent toner: " +
                currentToner);
    }

}
