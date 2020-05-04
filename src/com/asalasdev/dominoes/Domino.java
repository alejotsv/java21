package com.asalasdev.dominoes;

public class Domino {
    int top;
    int bottom;

    public Domino(int x, int y) {
        this.top = x;
        this.bottom = y;
    }

//    Getters and setters
    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
}
