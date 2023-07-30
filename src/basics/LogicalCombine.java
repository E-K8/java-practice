package basics;

public class LogicalCombine {
    public static void main(String[] args) {
     /*   if (true && true) {
            System.out.println("block executed");
        }
        if (true && false) {
            System.out.println("block unexecuted");
        }
        if (false && true) {
            System.out.println("block unexecuted");
        }
        if (false && false) {
            System.out.println("block unexecuted");
        }
        */
        if (true || true) {
            System.out.println("block executed");
        }
        if (true || false) {
            System.out.println("block executed");
        }
        if (false || true) {
            System.out.println("block executed");
        }
        if (false || false) {
            System.out.println("block unexecuted");
        }
    }
}
