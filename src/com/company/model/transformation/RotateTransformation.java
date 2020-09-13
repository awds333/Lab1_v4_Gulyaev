package com.company.model.transformation;

import com.company.model.Square;

import java.awt.*;

public class RotateTransformation implements SquareTransformation {
    private Double rad;

    public RotateTransformation(int grads) {
        rad = grads / 180.0 * Math.PI;
    }

    @Override
    public Square apply(Square square) {
        Point a = square.getA();
        Point c = square.getC();
        Point center = new Point((a.x + c.x) / 2, (a.y + c.y) / 2);
        square.setA(rotatePoint(a, center));
        square.setB(rotatePoint(square.getB(), center));
        square.setC(rotatePoint(c, center));
        square.setD(rotatePoint(square.getD(), center));
        return square;
    }

    private Point rotatePoint(Point point, Point center) {
        int xd = center.x - point.x;
        int yd = center.y - point.y;
        int xd1 = (int) (Math.cos(rad) * xd - Math.sin(rad) * yd);
        int yd1 = (int) (Math.sin(rad) * xd - Math.cos(rad) * yd);
        return new Point(center.x - xd1, center.y - yd1);
    }
}
