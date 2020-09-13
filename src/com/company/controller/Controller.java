package com.company.controller;

import com.company.model.SquareManager;
import com.company.model.transformation.ColorTransformation;
import com.company.model.transformation.FakeTransformation;
import com.company.model.transformation.RotateTransformation;
import com.company.model.transformation.StretchTransformation;

import java.awt.*;

public class Controller {
    private SquareManager manager;

    public Controller(SquareManager manager){
        this.manager = manager;
    }

    public void viewSquare(){
        manager.manageTransformation(new FakeTransformation());
    }

    public void changeColor(Color color){
        manager.manageTransformation(new ColorTransformation(color));
    }

    public void rotate(int grads){
        manager.manageTransformation(new RotateTransformation(grads));
    }

    public void resize(Double size){
        manager.manageTransformation(new StretchTransformation(size));
    }
}
