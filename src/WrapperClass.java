public class WrapperClass {
    public static void main(String[] args) {
        System.out.println("byte min: " +Byte.MIN_VALUE + ", byte max: " + Byte.MAX_VALUE);
        System.out.println("short min: " +Short.MIN_VALUE + ", short max: " + Short.MAX_VALUE);
        System.out.println("integer min: " +Integer.MIN_VALUE + ", integer max: " + Integer.MAX_VALUE);
        System.out.println("long min: " +Long.MIN_VALUE + ", long max: " + Long.MAX_VALUE);

        System.out.println("float min: " +Float.MIN_VALUE + ", float max: " + Float.MAX_VALUE);
        System.out.println("double min: " +Double.MIN_VALUE + ", double max: " + Double.MAX_VALUE);


        String stringNumber1 = "3";
        String stringNumber2 = "4";
        System.out.println(stringNumber1+stringNumber2);

        int num1 = Integer.parseInt(stringNumber1);
        int num2 = Integer.parseInt(stringNumber2);
        System.out.println(num1+num2);

//        boxing
        Integer x = 5;
        Integer b = Integer.valueOf(5); // explicit boxing, is unnecessary

//        unboxing
        int d = b;
        d=b.intValue(); // explicit unboxing


    }
}
