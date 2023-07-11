public class ForLoop {
    public static void main(String[] args) {
        for (int incCounter = 0; incCounter <= 5; incCounter++) {
            System.out.println(incCounter);
        }

        System.out.println("break line between counters");

        for (int decCounter = 5; decCounter >= 1; decCounter--) {
            System.out.println(decCounter);
        }

        System.out.println("break line between counters");

        for (int plusTwo = 5; plusTwo <= 10; plusTwo += 2) {
            System.out.println(plusTwo); // 5,7,9
        }

        System.out.println("break line between counters");

        for (int counter = 1, x = 1; counter <= 10 && x < 3; counter += 2, x++) {
            System.out.println("counter: " + counter + " , x: " + x);
        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//
//            }
//        }

        for (char myChar='a'; myChar<='z'; myChar++) {
            System.out.println(myChar);
        }

        for (int i = 0; i < 5; i++) {
            if(i==2) {
//                break;
                continue; // skips one iteration only
            }
            System.out.println("i : "+i);

        }
    }
}
