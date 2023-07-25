package com.qa;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("gagiu", "green", 0, 0, 10,4);
        Rectangle r2 = new Rectangle("gagie", "red", 3, 3, 8,8);

        System.out.println(r1);
        System.out.println("r1 area is " + r1.getArea());
        System.out.println("r1 centre point is " + r1.getCentrePoint());
        System.out.println("r1 is square ? -> "  + r1.isSquare());

        System.out.println(r2);
        System.out.println("r2 area is " + r2.getArea());
        System.out.println("r2 centre point is " + r2.getCentrePoint());
        System.out.println("r2 is suqre ? -> " + r2.isSquare());


        Circle c1 = new Circle("circle_1", "blue", 2,2, 8);
        Circle c2 = new Circle("circle_2", "white", 0, 4, 3);

        System.out.println();
        System.out.println(c1 + " has area = " + c1.getArea());
        System.out.println(c2 + " has area = " + c2.getArea());

    }
}
