public class Printer {
    private int tonerLevel;
    private int numOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if(tonerLevel<0 || tonerLevel>100){
            System.out.println("Invalid number for Toner, number set to 0.");
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }
    public void fillUpToner() {
        this.tonerLevel = 100;
    }
    public void printPages(int pages) {
        if (tonerLevel<pages){
            System.out.println("Error not enough ink");
        } else {
            System.out.println("Printing " + pages + " number of pages...");
            numOfPagesPrinted+=pages;
            tonerLevel-=pages;
            System.out.println("Printing job is complete!");
        }
    }
    public int getTonerLevel() {
        System.out.println("Toner Level is: " + tonerLevel);
        return tonerLevel;
    }

    public int getNumOfPagesPrinted() {
        System.out.println("Total num of pages printed is: " + numOfPagesPrinted);
        return numOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        System.out.println("is Duplex number result is " + isDuplexPrinter);
        return isDuplexPrinter;
    }
}
