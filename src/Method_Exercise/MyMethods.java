package Preparation;

public class MyMethods {

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

    private final int MAXTONER = 100;

    private final int MAXPAGESINATRAY = 100;

    private static int tonerLevel = 0;

    private static int pageCount = 0;





    public int addToner (int tonerAmount){

        if (tonerAmount > 0 && tonerAmount <= MAXTONER - tonerLevel){

            tonerLevel = tonerLevel + tonerAmount;
        }
        else {
            System.out.println("Invalid toner amount");
        }
        return tonerLevel;
    }

    public int addPages (int pages) {
        if (pages > 0 && pages <= MAXPAGESINATRAY - pageCount){
            pageCount = pageCount + pages;
        }
        else {
            System.out.println("Invalid page amount");

        }
        return pageCount;

    }

    public int printSinglePage (int pages){

        int noOfPrintSingle = 0;

        if (pages >0 && pages <= tonerLevel && pages <= pageCount){

            noOfPrintSingle = noOfPrintSingle + pages ;

            tonerLevel = tonerLevel - pages;

            pageCount= pageCount - pages;

        }else {

            System.out.println("Check toner level and page count");
        }

        return noOfPrintSingle;

    }
    public int printDoublePage (int pages){
        int noOfPrintDouble =0;

        if (pages >0 && pages <= tonerLevel && pages <= pageCount * 2){
            noOfPrintDouble = noOfPrintDouble + pages;

            tonerLevel = tonerLevel - pages;
            pageCount = pageCount - pages/2;

        } else {
            System.out.println("Check toner level and page count");
        }

        return noOfPrintDouble;

    }
    public void printerSummary (){

        System.out.println("Maximum number of pages in a tray is: " + MAXPAGESINATRAY);
        System.out.println("Maximum nmber of toner is: " + MAXTONER);
        System.out.println("The toner level is :" + tonerLevel);
        System.out.println("The number of page is: " + pageCount);


    }
    public void checkToner (){
        if (tonerLevel< 10){
            System.out.println("add toner");

        }
        else{
            System.out.println("no need to add toner");
        }
    }































}
