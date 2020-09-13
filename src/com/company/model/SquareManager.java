package com.company.model;

import com.company.model.transformation.SquareTransformation;
import com.company.view.MailView;

import java.awt.*;

public class SquareManager {
    private Square square;
    private MailView view;

    public SquareManager(MailView view){
        this.view = view;
        square = new Square(new Point(5,5), new Point(15,15));
    }

    public void manageTransformation(SquareTransformation transformation){
        square = transformation.apply(square);
        view.showData(square);
    }
}
