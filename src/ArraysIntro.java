import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
//        two ways to declare arrays:
        int[] myArray1 = new int[3];
        int[] myArray2 = {1, 4, 5, 6};

        String[] students1 = new String[3];
        String[] students2 = {"John", "Tom", "Mary"};

        System.out.println(students2[2]);

        students2[0] = "Kate";
        System.out.println(students2[0]);

        System.out.println(Arrays.toString(students2));
    }
}
