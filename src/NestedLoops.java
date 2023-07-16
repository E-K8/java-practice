public class NestedLoops {
//    1. Print nested loops separated by lines
//    2. Print multiplication table for numbers 1,2,3,4,5
//    3. Print pattern 1 22 333 444 55555, each number or number sequence to be stacked under the previous one
//    4. Print pattern ***** **** *** ** *,each sequence of asterisks to be stacked under the previous one
//    5. Print a fir tree pattern with asterisks (one, two, three, four, five asterisks stacked in the form or a tree)
//    6. Print 4 rows and 5 columns

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

    /*
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Times table for number: " + i);
            for (int j = 0; j <= 12; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println("-------------------");
        }
    }
    */

//    3.

    /*
        public static void main(String[] args) {
            for (int i = 1; i <=5; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
        */

//    4.
  /*
  public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */

//    5.
/*
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {

//            first inner loop: print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

//            second inner loop (print stars)
            for (int j = 0; j <=5-i; j++) {
                System.out.print("* ");
            }

            // or the second inner loop can look like this:
//            for (int j = 5; j >= i; j--) {
//                System.out.print("* ");
//            }

            System.out.println();
        }
    }
    */

    public static void main(String[] args) {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" (" + row + ", " + col + ") ");
            }
            System.out.println();
        }
    }
}
