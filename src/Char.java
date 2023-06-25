public class Char {
    /*
    letter A
    decimal value 65
    unicode value U+0041
     */

    /*
    print double quote "I love programming "stuff""
    print new line
    print indentation (tab)
    print backslash
    */

    /*
    My name is Kate
     I live in London since 2006
     My salary is 21000
     */

    public static void main(String[] args) {
        String name = "Kate";
        int year = 2006;
        double salary = 21000;
        System.out.printf("My name is %s\nI live in London since %d\nMy salary is %.2f", name, year, salary);


/*        System.out.println("I love programming \"stuff\"");
        System.out.println("one\ntwo\nthree");
        System.out.println("one\ttwo\tthree");
        System.out.println("\\");*/


//        myVariable = 45;
//        char myVariable = "A";

        var myVariable = 45; // the type of integer is inferred in Java
//        System.out.println(myVariable);

        var myVar = 'P';
//        System.out.println(myVar);

        char myChar = 'A';
        myChar++;
//        System.out.println(myChar);

        int myChar2 = 65;
//        System.out.println((char) myChar2);
//        System.out.println((char) 67);
//        System.out.println('\u0046');
    }
}

