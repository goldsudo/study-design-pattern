package com.goldsudo.pattern.chain;

public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void next() {
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
