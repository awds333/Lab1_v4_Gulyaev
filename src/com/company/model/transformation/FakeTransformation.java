package com.company.model.transformation;

import com.company.model.Square;

public class FakeTransformation implements SquareTransformation{
    @Override
    public Square apply(Square square) {
        return square;
    }
}
