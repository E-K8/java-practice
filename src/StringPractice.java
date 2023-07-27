public class StringPractice {
    public static void main(String[] args) {
        /*
        String string1 = "Java17";
        System.out.println(string1);

        string1 = "Java20";
        System.out.println(string1);

        String myString1 = "Monday";
        String myString2 = "Monday";
        System.out.println(myString1.equals(myString2));

        String myStr1 = new String("Tuesday");
        String myStr2 = new String("Tuesday");
        System.out.println(myStr1.equals(myStr2));
        System.out.println(myStr1.equals(myStr2));
        System.out.println(myStr2.equals(myStr1));

        String mySentence1 = "Java is awesome";
        System.out.println("mySentence1's length is: " + mySentence1.length());

        System.out.println("At index 0: " + mySentence1.charAt(0));
        System.out.println("At index 1: " + mySentence1.charAt(1));
        System.out.println("At index 2: " + mySentence1.charAt(2));
        System.out.println("At index 3: " + mySentence1.charAt(3));

        System.out.println("First index of A: " + mySentence1.indexOf("a"));

//        if letter doesn't exist, it will return -1, useful to determine if a certain letter exists
        System.out.println("First index of X: " + mySentence1.indexOf("x"));

        System.out.println("Last index of E: " + mySentence1.indexOf("e"));
        */

        // methods split(), substring(), toCharArray()
        // 0 1 2 3 4 5 6 7 8 9
        // j a v a   i s   a w esome

        String phrase = "java,is,awesome";
        System.out.println(phrase.substring(8)); // will print "awesome"
        System.out.println(phrase.substring(5));
        System.out.println(phrase.substring(5, 7)); // will print "is" only

        String[] words = phrase.split(",");
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }

        char[] myChars = phrase.toCharArray();
        for (char c : myChars) {
            System.out.println(c);
        }
    }
}