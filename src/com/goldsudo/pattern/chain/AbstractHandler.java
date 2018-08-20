package com.goldsudo.pattern.chain;

public abstract class AbstractHandler {
    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void next() {
        if (this.handler != null) {
            this.handler.operator();
        }
    }
}
