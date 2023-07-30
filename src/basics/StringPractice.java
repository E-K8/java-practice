package basics;

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
/*
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
            */

        /*
        String emptyStr = " ";
        System.out.println(emptyStr.length());
        System.out.println(emptyStr.isEmpty());

        String nullStr = null;
        System.out.println(nullStr);

        String blankStr = "      ";
        System.out.println(blankStr.isBlank());
        System.out.println(blankStr.isEmpty());

        String strOne = "   Failure    ";
        String strTwo = " is not an option.";
        String strThree = strOne.trim().concat(strTwo);
        System.out.println(strThree);
        System.out.println(strThree.toUpperCase());
        System.out.println("Java".startsWith("J"));
        System.out.println("Java".endsWith("A"));
        System.out.println("adorable".replace("a", "*"));
        System.out.println("marvellous".replaceFirst("l", "*"));
        System.out.println("curious".contains("iou"));

*/
        // Stringbuilder
/*
        0 1 2 3
        j a v a
*/
        StringBuilder sb = new StringBuilder("java");
        System.out.println(sb);

        sb.insert(1, "**");
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);

        sb.setCharAt(1, '*');
        System.out.println(sb);

        sb.append(" is awesome!");
        System.out.println(sb);
        System.out.println(sb.substring(0, 4));

        System.out.println(sb.reverse());
    }
}
