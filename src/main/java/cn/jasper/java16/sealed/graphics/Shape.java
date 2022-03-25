package cn.jasper.java16.sealed.graphics;

import cn.jasper.java16.sealed.graphics.polar.Circle;
import cn.jasper.java16.sealed.graphics.quad.Rectangle;
import cn.jasper.java16.sealed.graphics.quad.simple.Square;

public sealed class Shape permits Circle, Rectangle, Square {
}
