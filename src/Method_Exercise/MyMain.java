package Preparation;

public class MyMain {
    public static void main(String[] args) {


        MyMethods m1 = new MyMethods();

        int toner = m1.addToner(100);

        System.out.println("Toner level is: " + toner);

        int pages = m1.addPages(100);
        System.out.println("The number of pages is " + pages);

        int printSingle = m1.printSinglePage(100);
        System.out.println("Number of single page print is: " +printSingle);

        int printsingle2 = m1.printSinglePage(50);
        System.out.println(printsingle2);

        int printDouble = m1.printDoublePage(50);
        System.out.println("Number of double print page is: " + printDouble);

        m1.addPages(100);
        m1.addToner(100);

        int printDouble2 = m1.printDoublePage(50);
        System.out.println("Number of double print page is: " + printDouble2);

        m1.printerSummary();

        m1.checkToner();






    }
}
