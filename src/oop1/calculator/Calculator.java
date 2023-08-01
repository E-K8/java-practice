package oop1.calculator;

public class Calculator {

    public void add(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        System.out.println(total);
    }

    public void add(int x, int y) {
        System.out.println(x + y);
    }

    public void add(double x, double y) {
        System.out.println(x + y);
    }

    public void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public void add(double x, double y, double z) {
        System.out.println(x + y + z);
    }
}

