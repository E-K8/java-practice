public class WhileLoop {
    public static void main(String[] args) {
        int incCounter = 1;
        int decCounter = 5;
        int incCounterDoWhile = 1;
        int decCounterDoWhile = 20;

        while (incCounter <= 5) {
            System.out.println(incCounter);
            incCounter++;
        }

        System.out.println("here's a break line between counters");

        while (decCounter >= 1) {
            System.out.println(decCounter);
            decCounter--;
        }

        System.out.println("here's a break line between counters");

        do { // executes code before the condition
            System.out.println(incCounterDoWhile);
            incCounterDoWhile++;
        } while (incCounterDoWhile <= 10);

        System.out.println("here's a break line between counters");

        do {
            System.out.println(decCounterDoWhile);
            decCounterDoWhile--;
        } while (decCounterDoWhile >= 10);
    }
}
