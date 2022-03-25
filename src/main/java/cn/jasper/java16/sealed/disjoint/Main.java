package cn.jasper.java16.sealed.disjoint;

public class Main {

    public static void main(String[] args) {

    }

    public void work(Rectangle r) {
        Polygon p = (Polygon) r;
    }

    public void work(Triangle t) {
        Polygon p = (Polygon) t;// 类型不相关，但运行时可能是相关的
    }

    public void work(UtahTeapot u) {
//        Polygon p = (Polygon) u;
        // Error: The cast can never succeed as
        // UtahTeapot and Polygon are disjoint
    }
}
interface Polygon { }
class Rectangle implements Polygon { }

class Triangle { }
class MeshElement extends Triangle implements Polygon { }

final class UtahTeapot { }
