package com.Composition;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class Dimensions {

    private int width;
    private int heigth;
    private int depth;

    public Dimensions(int width, int heigth, int depth) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
