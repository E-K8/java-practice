import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
//        two ways to declare arrays:

        int[] myArray2 = {1, 4, 5, 6};


        String[] students1 = new String[3];
        String[] students2 = {"John", "Tom", "Mary"};

        System.out.println(students1.length);

        System.out.println(students2[2]);

        students2[0] = "Kate";
        System.out.println(students2[0]);

        System.out.println(Arrays.toString(students2));

        double[] arrDouble = new double[3];
        System.out.println(Arrays.toString(arrDouble));

        boolean[] arrBool = new boolean[2];
        System.out.println(Arrays.toString(arrBool));

        Arrays.fill(students1, "Daniel");
        System.out.println(Arrays.toString(students1));

        int[] myArray1 = new int[3];
        Arrays.fill(myArray1, 3);
        System.out.println(Arrays.toString(myArray1));

//        arrays are reference types, that means that they refer to different places. For this reason, arrays with the same values will never be equal because they refer to different places and different objects. However deep comparison is possible with Arrays.equals

        int[] compare1 = new int[3];
        compare1[0] = 7;
        compare1[1] = 7;
        compare1[2] = 7;
        int[] compare2 = {7, 7, 7};
        System.out.println(compare1 == compare2); //false

        System.out.println(Arrays.equals(compare1, compare2)); //true

//        sorting arrays

        int[] arrToSort= {2,5,73,3,2,45};
        Arrays.sort(arrToSort);
        System.out.println(Arrays.toString((arrToSort)));

    }
}
