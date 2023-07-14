public class NestedLoops {
//    1. Print nested loops separated by lines
//    2. Print multiplication table for numbers 1,2,3,4,5

/*
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);

            for (int j = 0; j < 5; j++) {
                System.out.println("\ti = " + i);
            }
            System.out.println("=====================");
        }
    }
    */

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Times table for number: " + i);
            for (int j = 0; j <= 12; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println("-------------------");
        }
    }
}
