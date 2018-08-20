package com.goldsudo.pattern.chain;

public class Test {
    public static void main(String[] args) {
        //创建三个handler
        HandlerImpl handler1 = new HandlerImpl("handler1");
        HandlerImpl handler2 = new HandlerImpl("handler2");
        HandlerImpl handler3 = new HandlerImpl("handler3");
        //形成责任链
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        //从责任链的开头开始执行
        handler1.operator();
    }
}
