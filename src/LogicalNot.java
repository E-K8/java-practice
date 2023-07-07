public class LogicalNot {
    public static void main(String[] args) {
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!true == false);
        System.out.println(!false == true);

        boolean x = !(5 > 2);
        System.out.println("x: " + x);

        System.out.println(!(true && true));
        System.out.println(!(false && true));

        System.out.println(!(false || true));
        System.out.println(!(false || false));

        int a = 3, b = 5;
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println(!!true);
        System.out.println(!!false);
    }
}
