package com.company.view;


import com.company.controller.Controller;
import com.company.model.Square;
import com.company.model.SquareManager;

import java.awt.*;

public class View implements MailView {
    private Controller controller;

    public View(){
        controller = new Controller(new SquareManager(this));
        controller.viewSquare();
        controller.changeColor(Color.RED);
        controller.resize(0.5);
        controller.rotate(45);
    }

    @Override
    public void showData(Square square) {
        System.out.println(square);
    }
}
