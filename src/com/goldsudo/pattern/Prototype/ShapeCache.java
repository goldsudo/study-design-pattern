package com.goldsudo.pattern.Prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 假设每种形状都的初始化，都需要进行一系列数据库查询，然后才能创建
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("circle");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("square");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("rectangle");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
