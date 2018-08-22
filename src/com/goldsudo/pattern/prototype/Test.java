package com.goldsudo.pattern.prototype;

public class Test {
    //将3个形状的对象实例加载到缓存中
    static {
        ShapeCache.loadCache();
    }

    public static void main(String[] args) {
        //使用key从缓存中获取对象
        Shape clonedShape = (Shape) ShapeCache.getShape("circle");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("square");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("rectangle");
        System.out.println("Shape : " + clonedShape3.getType());

        //验证是否每次获取到的都是新的对象
        Shape clonedShape4 = (Shape) ShapeCache.getShape("circle");
        Shape clonedShape5 = (Shape) ShapeCache.getShape("circle");
        System.out.println("clonedShape4 == clonedShape5: " + (clonedShape4 == clonedShape5));
    }
}
