package org.blitmatthew;

import org.blitmatthew.ocp.AreaCalculator;
import org.blitmatthew.ocp.Circle;
import org.blitmatthew.ocp.Rectangle;
import org.blitmatthew.ocp.Shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rectangle");
        System.out.println(AreaCalculator.calculateArea(new Rectangle(98.55, 85.39)));
        System.out.println("Circle");
        System.out.println(AreaCalculator.calculateArea(new Circle(55.79)));

        Shape rect = new Rectangle(78.34, 54.78);

    }
}