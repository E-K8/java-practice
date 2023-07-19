import java.util.Arrays;

public class ArrTraverse {
    public static void main(String[] args) {
        String[] names = {"Lucy", "Dale", "Kyle", "Chris"};

        System.out.println(names.length);

        for (int i = 0; i < names.length; i++) {
            names[i] = "Hi and welcome, " + names[i] + "!";
        }
        System.out.println(Arrays.toString(names));

//        for-each
        for (String myString : names) {
            System.out.println(myString);
        }

        int[] myInt = {31, 52, 73, 94};

        for (int n : myInt) {
            System.out.println(n);
        }
    }
}
