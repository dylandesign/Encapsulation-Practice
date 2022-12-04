public class Main {
    public static void main(String[] args) {
        Printer inkjetPrinter = new Printer(50, true);
        inkjetPrinter.fillUpToner();
        inkjetPrinter.getTonerLevel();
        inkjetPrinter.isDuplexPrinter();
        inkjetPrinter.printPages(10);
        inkjetPrinter.getNumOfPagesPrinted();
    }
}
