package MidTerm_Exam;

public class Exam_Main {
    public static void main(String[] args) {
       int [] numbers = {32,14,24,98,56,25,25,100};
       int remove = 25;

       Exam_Methods ex = new Exam_Methods();
       // System.out.println( ex.removalArr(numbers,remove));

        int[] num = {0,1,2,3,5,7};
        System.out.println(ex.missing(num));
        
    }
}
