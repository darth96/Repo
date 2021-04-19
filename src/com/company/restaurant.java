package com.company;

public class restaurant {
    private final int maxGuest= 0;
    int currentGuest=maxGuest;
    int totalGuest=0;
    restaurant(String newName, int maxGuest){
        String name = newName;
        int max = maxGuest;
    }
    //method to tell if number seats available
    public boolean seatsAvailable(int newSeats){
        boolean seats;
        int seatsLeft= maxGuest -currentGuest;
        if (newSeats<=seatsLeft)
            seats= true;
        else seats=false;

        return seats;
    }
    // method that seats party
    public void seatsParty(int newParty){
         int party = newParty;
         if (party<=maxGuest-currentGuest){
             System.out.println("Enjoy your stay!");
             totalGuest= totalGuest+ party;
             currentGuest= currentGuest - party;
         }
         else System.out.println("This number of seats not available");
    }
    //method to remove party
    public void removeParty (int newRemove){
        int remove = newRemove;
        if (remove<=currentGuest){
        currentGuest=currentGuest-remove;
            System.out.println("See you next time");
        } else System.out.println("Wrong input");
    }
    public void restaurantSummary(){
        System.out.println("This is your max guest: " + maxGuest +
                "\n This is yout current guest: " + currentGuest +
                "\n This is your total guest:" + totalGuest);
    }


}
