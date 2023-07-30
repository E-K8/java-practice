package basics;

import java.util.Arrays;

public class ArrTwoDim {
//    1. First way of declaring and printing arrays
    /*
    public static void main(String[] args) {
        int[][] myArr = new int[2][5];

        myArr[0][2] = 99;
        myArr[1][4] = 77;
        myArr[1][2] = 4;

*//*        for (int[] array : myArr) {
            System.out.println(Arrays.toString(array));
        }*//*

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.println(myArr[row][col]);
            }
        }
    }
    */


//    2. Second way to declare and print an array
    /*
    public static void main(String[] args) {
        int[][] myArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };
        myArray[0][2] = 77;

        for (int row = 0; row < myArray.length; row++) {
            int[] arr = myArray[row];
            for (int col = 0; col < myArray[row].length; col++) {
                System.out.println(myArray[row][col]);
            }
        }
    }
*/

//    3. Calculate total for every row of the two-dimensional array, each row being of different length

    public static void main(String[] args) {
        int[][] arrCalcRows = {
                {12, 15, 56, 85},
                {15, 14},
                {45, 95, 24, 75, 85, 36, 19, 22}
        };

/*        for (int row = 0; row < arrCalcRows.length; row++) {
            int total = 0;
            for (int col = 0; col < arrCalcRows[row].length; col++) {
                total += arrCalcRows[row][col];
            }
            System.out.println(total);
        }*/

//        the same as ↑, but using enhanced for loop ↓
        for (int[] arrCalcRow : arrCalcRows) {
            int total = 0;
            for (int i : arrCalcRow) {
                total += i;
            }
            System.out.println(total);
        }
    }
}
