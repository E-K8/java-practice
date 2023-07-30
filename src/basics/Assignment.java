package basics;

public class Assignment {
    /*
    Assignment operators: =, +=, -=, /=, *=
    Boolean values: true/false;
    Relational operators: ==, !=, >, >=, <, <=
     */
    public static void main(String[] args) {
        boolean isActive = true;
        System.out.println(isActive);
        System.out.println(5 != 5);
        System.out.println(5 >= 3);


        int x = 8;
        int y = x;
        x++;
//        x+=2;
//        x-=3;
//        x/=2;
//        x*=3;

        System.out.println(x);
        System.out.println(y);
    }
}
