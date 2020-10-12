package Method_Exercise;

public class Main {
    public static void main(String[] args) {

        Construction con1 = new Construction();

        double [] numbers = {10.00, 2.0, 3.0, 4.0, 5.0, 6.0};
        double addArray = con1.addition(numbers);
        System.out.println(addArray);

        boolean primeOrNot = con1.isPrime(29);
        System.out.println(primeOrNot);

        String msg = "racecar";
        String myName = "mamta";
        String msg2 = "level";
       boolean checkString = con1.isPalindrome(msg);
        System.out.println(checkString);

        String [] words = {"hello", "peace", "happy" , "hello", "Happy", "hello"};
        con1.findDuplicate(words);

       String[] names= {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"};

       String[] names2 ={"hello", "grow", "laugh" , "peace"};
        con1.findCommon(names,names2);

        










    }
}
