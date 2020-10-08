package Method_Exercise;

public class Home_Work6 {

    /**
     * Create a method
     * to find average of
     * an int array
     */


    public static int avgOfIntArr(int[] arr) {

        int sum = 0;
        int avg = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
            avg = avg + sum / arr.length;
        }
        return avg;
    }

    /**
     * String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"}
     * String nameToSearch = "philip";
     * Create a method (NO return) that will print the index of given name in the given array
     */

    public static void indexOfString(String[] name, String nameToSearch) {

        int indexnameToSearch = 0;


        for (int i = 0; i <= name.length - 1; i++) {

            if (nameToSearch == name[i]) {

                indexnameToSearch = i;

            }

        }

        System.out.println(indexnameToSearch);

    }

    public static void main(String[] args) {
        
    }

}
