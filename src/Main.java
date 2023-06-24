// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    /*
    byte (-128 -- 127)
    short (-23,768 --32,767)
    int (-2,147,483,648 -- 2,147,483,647)
    long  (-9,223,372,036,854,775,808 -- 9,223,372,036,854,775,807)

    float: 7 decimal digits
    double: 15 decimal digits
    */

    // instance variable
    int myAge = 23;

    // static or class variable
    static int salary = 21000;

    int age = 99;

    public static void main(String[] args) {

        byte myByte = (byte) 129; // will cause overflow and print -127
        System.out.println(myByte);

        short myShort = 32000;
        int myInt = 20000;
        long myLong = 922_337_203_685_477_580_7L; // has to have L at the end to mark it as long type, underscores are for readability
        System.out.println(myLong);

        float myFloat = 2.13454F; // has to have F at the end
        double myDouble = 4.134097850987;
        System.out.println(myFloat);
        System.out.println(myDouble);

        // local variable
        int age; // declare variable of type int
        age = 37; // variable assignment
        System.out.println(age); // local variable will override instance or static variable


        int _age = 6;
        int $age = 9;

//        TODO fix bug here

//        System.out.println("Today is the 18th of June. Hey there human!");
//        System.out.print("The weather is sunny, but oh so humid.");
        System.out.println(9 - 4);
        System.out.println("Hello " + "human. Hope you are well today.");
        System.out.println("This is the third sentence for today."); // comment at the end of the line, just like in JS

/* Shortcuts
CTRL ALT L - format the code
CTRL SHIFT / - block comment
CTRL / - line comment
ALT f12 - open terminal
ALT 1 - show/hide project side panel
ALT 4 - show/hide run tab
ALT 9 - show/hide git tab
CTRL SHIRT A - option to toggle soft wrap
CTRL SHIRT F12 - show/hide all tool windows
CTRL D - duplicate a line of code

*/
    }
}