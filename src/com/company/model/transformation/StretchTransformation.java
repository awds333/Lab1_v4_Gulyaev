package com.company.model.transformation;

import com.company.model.Square;

import java.awt.*;

public class StretchTransformation implements SquareTransformation {
    private double resize;

    public StretchTransformation(Double resize){
        this.resize = resize;
    }

    @Override
    public Square apply(Square square) {
        Point a = square.getA();
        Point c = square.getC();
        Point center = new Point((a.x + c.x) / 2, (a.y + c.y) / 2);
        square.setA(stretchPoint(a, center));
        square.setB(stretchPoint(square.getB(), center));
        square.setC(stretchPoint(c, center));
        square.setD(stretchPoint(square.getD(), center));
        return square;
    }

    private Point stretchPoint(Point point, Point center) {
        int xd = center.x - point.x;
        int yd = center.y - point.y;
        int xd1 = (int) (xd * resize);
        int yd1 = (int) (yd * resize);
        return new Point(center.x - xd1, center.y - yd1);
    }
}
