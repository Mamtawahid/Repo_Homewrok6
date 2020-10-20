package MidTerm_Exam;

public class Exam_Methods {

    /**
     * Question 1:
     * Create a method to return an int-array after removing a given int-value
     * from a given int array.
     *
     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     *
     *
     */



    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0)
     * from given array.
     *
     * Example:
     * 	For array : {1, 3, 5, 4, 2, 7}
     * 	Method should return : 6
     *
     * 	For array : {-1, -3, 4, 2}
     * 	Method should return : 1
     *
     * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	Method should return : 4
     *
     */

   public int missing(int[] arr){
       int foundNumber = 0;
       for (int i= 1; i<=7; i++){
           for (int j = 0; j<arr.length; j++){
               if (i>0 && i<arr[j] && i!=arr[j]){
                   foundNumber =  i;

               }

           }
       }
       return foundNumber;
   }



    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points charged against
     * the license for over speeding.
     *
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user gets 12 points for a speed then license is suspended
     *
     *  Example:
     *      user speed = 74 ; 0 points
     *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     */

    public void findTicketPoints(int userSpeed){

        final int SPEEDLIMIT =70;

            if (userSpeed>= SPEEDLIMIT && userSpeed<= 75 ){
                System.out.println("driver gets 1 point");

            }
            if (userSpeed>75 && userSpeed==80){
                System.out.println("driver gets 2 points");
            }
            if (userSpeed>80 && userSpeed==85){
                System.out.println("driver gets 3 points");
            }
            if (userSpeed>85 && userSpeed== 90){
                System.out.println("driver gets 4 points");
            }
            if (userSpeed>90 && userSpeed==95){
                System.out.println("driver gets 5 points");
            }
            if (userSpeed> 95 && userSpeed==100){
                System.out.println("driver gets 6 points");
            }
            if  (userSpeed> 100 && userSpeed<= 105){
                System.out.println("driver gets 7 point");

            }
            if (userSpeed>105 && userSpeed==110){
                System.out.println("driver gets 8 points");
            }
            if (userSpeed>110 && userSpeed==115){
                System.out.println("driver gets 9 points");
            }
            if (userSpeed>115 && userSpeed== 120){
                System.out.println("driver gets 10 points");
            }
            if (userSpeed>120 && userSpeed==125){
                System.out.println("driver gets 11 points");
            }
            if (userSpeed> 125 && userSpeed==130){
                System.out.println("driver gets 12 points and the license is suspend");
            }
            else {
                System.out.println("Thanks for good driving");
            }
        }
    }






