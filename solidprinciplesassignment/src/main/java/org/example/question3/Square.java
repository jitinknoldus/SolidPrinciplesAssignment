package org.example.question3;

public class Square extends Rectangle {

    @Override
    public void setHeight(double h) {
        super.setHeight(h);
        super.setWidth(h);
    }

    @Override
    public void setWidth(double w) {
        super.setWidth(w);
        super.setHeight(w);
    }

}
