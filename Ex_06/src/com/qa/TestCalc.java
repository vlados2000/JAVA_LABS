package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc obj = new BadCalc();

        int res1 = obj.mult(2, 3);
        System.out.println(res1);

        try {
            System.out.println(obj.div(5,0));
        } catch (ArithmeticException ex) {
            System.out.println("Do not divide by 0, bro .. ");
        }
    }
}
