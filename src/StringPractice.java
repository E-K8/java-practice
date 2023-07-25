public class StringPractice {
    public static void main(String[] args) {
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
    }
}