package Method_Exercise.HomeWork;

public class MyRestaurtantApp {
    public static void main(String[] args) {

        MyRestaurant restaurant = new MyRestaurant("TopCappi", 200);
        boolean isAvailable = restaurant.isSeatAvailable(50);
        System.out.println("Are there seat available for party size ?  " + isAvailable);


        int seatParty = restaurant.seatParty(50);
        System.out.println("Number of person sitting in the restaurant are: " + seatParty);


        int removeParty = restaurant.removesParty(20);
        System.out.println("Present guest count is: " + removeParty);

        restaurant.restaurantSummary();

    }
}
