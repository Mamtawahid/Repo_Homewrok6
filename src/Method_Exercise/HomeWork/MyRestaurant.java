package Method_Exercise.HomeWork;

public class MyRestaurant {
    /**
     * Submission Date: Thursday (Nov 5th)
     */
    /**
     * Create a Restaurant class with attribute name, guestCapacity, guestCount
     * 1. Create a method that tells user if the seats are available
     * 2. Create a method that seatsParty
     * 3. Create a method that removesParty
     * 4. Create a Constructor-method that allows host open for services by passing restaurant name/guestCapacity
     * 5. Create a method that printsRestaurantSummary
     *      Name:
     *      Current Guest Count:
     *      Guest Capacity:
     *
     *
     */
    /**
     * 2 Classes
     * Restaurant -> all methods and variables
     * RestaurantApp -> main method,
     *  in inside main...will create object of Restaurant class, and use methods from Restaurant class
     *
     */

    private String name;
    private int guestcapacity;
    private int guestCount;

    public MyRestaurant (String name, int guestcapacity){
        this.name = name;
        this.guestcapacity = guestcapacity;
    }

    public boolean isSeatAvailable (int numberOfPerson){
        boolean available = false;
        if (numberOfPerson>0 && numberOfPerson<= guestcapacity - guestCount){
            available = true;

        }else{
            available=false;
        }
        return available;
    }

    public int seatParty (int numberOfGuest){

        if (isSeatAvailable(numberOfGuest)== true){

            guestCount = guestCount + numberOfGuest;
        }else {
            System.out.println("No seat available");
        }
        return guestCount;
    }

    public int removesParty (int partySize){

        guestCount = guestCount-partySize;
        return guestCount;
    }

    public void restaurantSummary (){
        System.out.println("The name of the restaurant is: " + name);
        System.out.println("The guest capacity of restaurant is: " + guestcapacity);
        System.out.println("The number of guest sitting in the restaurant is: " + guestCount);
    }


}
