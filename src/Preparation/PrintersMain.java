package Preparation;

public class PrintersMain {
    public static void main(String[] args) {

      PrintersMethods p1 = new PrintersMethods();

      int toner = p1.addToner(100);
        System.out.println(toner);

        int pages = p1.addPages(100);
        System.out.println(pages);

        p1.printerSummary();

        int printSingle = p1.printSingle(20);
        System.out.println(printSingle);

        p1.printerSummary();

        int printDouble = p1.printDouble(50);
        System.out.println(printDouble);

        p1.printerSummary();

        p1.checkToner();

    }
}
