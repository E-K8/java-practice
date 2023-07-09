public class WhileLoop {
    public static void main(String[] args) {
        int incCounter = 1;
        int decCounter = 5;

        while(incCounter<=5){
            System.out.println(incCounter);
            incCounter++;
        }
        System.out.println("here's a break line between two counters");

        while(decCounter>=1) {
            System.out.println(decCounter);
            decCounter--;
        }
    }
}
