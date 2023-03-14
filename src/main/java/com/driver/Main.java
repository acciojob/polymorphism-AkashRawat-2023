package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        int ans = p.product(10, 20);
        int ans1 = p.product(10, 20, 30);
        double ans2 = p.product(10.5, 19.5);

        System.out.println(ans +" "+ ans1 + " "+ ans2);

    }
}
    class Product{

    public int product(int x, int y) {

        int sum = x * y;

        return sum;
    }

    public int product(int x, int y, int z) {

        int sum = x * y * z;

        return sum;
    }

    public double product(double x, double y) {

        double sum = x * y;

        return sum;
    }
}