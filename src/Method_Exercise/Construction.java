package Method_Exercise;

public class Construction {

    /**
     * 1. Create a method to add all the numbers in a array with double-values
     * <p>
     * 2. Create a method to verify if the input-int-number is prime or not
     * prime number: number divisible by 1 and itself
     * eg: 7 -> prime
     * 21 -> not a prime
     * <p>
     * 3. Create a method to find if given string is palindrome.
     * Palindrome: string which reads the same in reverse.
     * racecar  ->  racecar
     * level    ->  level
     * <p>
     * 4. Write a method to print(no return) the duplicate values in a given String array.
     * Input String array -> {"hello", "peace", "happy" , "hello", "Happy", "hello"}
     * Method should print -> hello, happy
     * hello
     * happy
     * <p>
     * 5. Write a method to print(no return) the common values between two arrays (string arrays)
     * Input arrays:
     * arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"}
     * arr2 -> {"hello", "grow", "laugh" , "peace"}
     * Method should print -> hello, peace, laugh
     * hello
     * peace
     * laugh
     */

    public double addition (double [] values){
        double sum = 0;
        for (int i= 0; i<= values.length-1; i++){
            sum = sum + values [i];
        }
        return sum;
    }


    public boolean isPrime (int number){
        boolean prime = true;
        for (int i= 2; i<number; i++){
            if (number%i== 0){
                prime = false;
                break;
            }
            else {
                prime = true;
            }

        }
        return prime;
    }




  public boolean isPalindrome (String original){

      boolean checkPalindrome = true;
      String [] letters = original.split("");
      String reverse = "";

      for (int i= letters.length-1; i>= 0; i--){

          if (original.equals(reverse =reverse+ letters [i])){
              checkPalindrome = true;
          }
          else{
              checkPalindrome = false;
          }
      }
      return checkPalindrome;
  }

  public void findDuplicate (String [] array){

        String duplicate = "";

        for (int i = 0; i <= array.length-1; i++){

            for (int j = i+1; j<= array.length-1; j++){

                if (array[i].equalsIgnoreCase(array[j])){

                        duplicate = duplicate + array[i] + " ";
                }
            }

        }
      System.out.println("The duplicates are: "+duplicate);
  }

  public void findCommon (String [] a1, String [] a2){

        String common = "";

        for (int i=0; i<=a1.length-1; i++){

            for (int j = 0; j<=a2.length-1; j++){

                if (a1[i].equalsIgnoreCase(a2[j])){

                    common = common+a1[i] + " ";
                }
            }
        }
      System.out.println("The common values between two string arrays are: "+common);
  }









































}
