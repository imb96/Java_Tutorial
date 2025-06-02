package oop;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5.0, 3.0);

        System.out.println("5 + 3 = " + result1);
        System.out.println("5 - 3 = " + result2);
        System.out.println("5 * 3 = " + result3);
        System.out.println("5 / 3 = " + result4);
    }
}

class MyMath {
    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}
