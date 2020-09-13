package com.company.model;

import java.awt.*;

public class Square {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    Square(Point x, Point y) {
        a = x;
        c = y;
        Point center = new Point((x.x + y.x) / 2, (x.y + y.y) / 2);
        Section dif = new Section(center.x - x.x, center.y - x.y);
        b = new Point(center.x + dif.getY(), center.y - dif.getX());
        d = new Point(center.x - dif.getY(), center.y + dif.getX());

        color = Color.BLACK;
    }

    Square(Point x, Section y, Section z) {
        a = x;

        b = (Point) a.clone();
        b.move(y.getX(), y.getY());

        d = (Point) d.clone();
        d.move(z.getX(), z.getY());

        c = (Point) b.clone();
        c.move(z.getX(), z.getY());

        color = Color.BLACK;
    }

    @Override
    public String toString() {
        return "((" + a.x + ", " + a.y + ") (" + b.x + ", " + b.y + ") (" + c.x + ", " + c.y + ") (" + d.x + ", " + d.y + ") " + color + ")";
    }
}
