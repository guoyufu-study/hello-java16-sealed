package cn.jasper.java16.sealed.geometry;

public sealed class Rectangle extends Shape permits FilledRectangle {
    public double length, width;
}
