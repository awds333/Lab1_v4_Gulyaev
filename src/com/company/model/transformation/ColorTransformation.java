package com.company.model.transformation;

import com.company.model.Square;

import java.awt.*;

public class ColorTransformation implements SquareTransformation{
    private Color color;

    public ColorTransformation(Color color){
        this.color = color;
    }

    @Override
    public Square apply(Square square) {
        square.setColor(color);
        return square;
    }
}
