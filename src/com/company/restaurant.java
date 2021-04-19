package com.company;

public class restaurant {
    private final int maxGuest= 0;
    int currentGuest=maxGuest;
    int totalGuest=0;
    restaurant(String newName, int maxGuest){
    }
    //method to tell if number seats available
    public boolean seatsAvailable(int newSeats){
        boolean seats;
        int seatsLeft= maxGuest -currentGuest;
        seats= newSeats <= seatsLeft;

        return seats;
    }
    // method that seats party
    public void seatsParty(int newParty){
        if (newParty <=maxGuest-currentGuest){
             System.out.println("Enjoy your stay!");
             totalGuest= totalGuest+ newParty;
             currentGuest= currentGuest - newParty;
         }
         else System.out.println("This number of seats not available");
    }
    //method to remove party
    public void removeParty (int newRemove){
        if (newRemove <=currentGuest){
        currentGuest=currentGuest- newRemove;
            System.out.println("See you next time");
        } else System.out.println("Wrong input");
    }
    public void restaurantSummary(){
        System.out.println("This is your max guest: " + maxGuest +
                "\n This is yout current guest: " + currentGuest +
                "\n This is your total guest:" + totalGuest);
    }


}
