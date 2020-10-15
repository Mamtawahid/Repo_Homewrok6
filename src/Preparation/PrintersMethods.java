package Preparation;

public class PrintersMethods {

    /**
     * Create a printer
     *
     * max toner level = 100
     * max pages in tray = 100
     * with 1 page printing, 1 toner is being used
     *
     * 1. addToner
     * 2. addPages
     * 3.
     *      a) printSingle
     *      b) printDouble
     * 4. printerSummary
     *      Toner level:
     *      Pages count in tray:
     * 5. checkToner
     *      if toner is less than 10; it should warn to "Add toner"
     */
    /**
     * printerSummary   // T: 100, P:100
     *
     * printSingle(10)
     *
     * printerSummary   // T: 90, P:90
     *
     * printDouble(10)
     *
     * printerSummary   // T: 80, P:85
     *
     */

    private final int MAXTONERCAPACITY = 100;
    private final int MAXPAGESCAPACITY = 100;
    private static int tonerLevel = 0;
    private static int pageCount = 0;


    public int addToner (int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= MAXTONERCAPACITY - tonerLevel){
            tonerLevel = tonerLevel + tonerAmount;
        }
        else {
            System.out.println("Invalid toner amount");

        }
        return tonerLevel;
    }


    public int addPages (int pages){
        if (pages > 0 && pages <= MAXPAGESCAPACITY - pageCount){
            pageCount = pageCount + pages;
        }
        else {
            System.out.println("Invalid Pages");
        }
        return pageCount;
    }

    public int printSingle (int singlePage) {
        int noOfPrintSingle =0;
        if (singlePage > 0 && singlePage <= tonerLevel && singlePage <= pageCount) {
            noOfPrintSingle = noOfPrintSingle + singlePage;
            tonerLevel = tonerLevel - singlePage;
            pageCount = pageCount - singlePage;
        } else {
            System.out.println("Check Toner and Page");
        }
        return noOfPrintSingle;

    }
    public int printDouble (int doublePage){
        int noOfPrintDouble = 0;
        if (doublePage >0 && doublePage <= tonerLevel && doublePage <= pageCount * 2){
            noOfPrintDouble = noOfPrintDouble+doublePage;
            tonerLevel = tonerLevel - doublePage;
            pageCount = pageCount - doublePage/2;
        }
        else{
            System.out.println("Check toner and Page");
        }
        return noOfPrintDouble;
    }

    public void printerSummary (){
        System.out.println("THe Maximum toner cpacity is: " + MAXTONERCAPACITY);
        System.out.println("The Maximem pages capacity is: " + MAXPAGESCAPACITY);
        System.out.println("Toner level is: " + tonerLevel);
        System.out.println("Page count is: " + pageCount);
    }

    public void checkToner (){
        if (tonerLevel < 10){
            System.out.println("Please add toner.");
        }
        else{
            System.out.println("Toner level is sufficient and the toner level is: "+ tonerLevel);
        }
    }


}
