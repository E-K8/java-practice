public class Char {
    /*
    letter A
    decimal value 65
    unicode value U+0041
     */

    public static void main(String[] args) {
        char myChar = 'A';
        myChar++;
        System.out.println(myChar);

        int myChar2 = 65;
        System.out.println((char) myChar2);
        System.out.println((char) 67);
        System.out.println('\u0046');
    }
}

