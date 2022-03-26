package ru.rud.exam;

import java.util.ArrayList;
import java.util.List;

public class Form {

    private int height, width;
    private List<Button> list = new ArrayList<>();

    public Form(int height, int width) {
        if(height < 0 || width < 0) {
            throw new IllegalArgumentException();
        } else {
            this.height = height;
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        if(height < 0) {
            throw new IllegalArgumentException();
        } else {
            this.height = height;
        }
    }

    public void setWidth(int width) {
        if(width < 0) {
            throw new IllegalArgumentException();
        } else {
            this.width = width;
        }
    }
}
