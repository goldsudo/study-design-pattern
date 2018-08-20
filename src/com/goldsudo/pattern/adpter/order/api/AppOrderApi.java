package com.goldsudo.pattern.adpter.order.api;

public interface AppOrderApi {
    //只需要传入订单Id即可
    public void updateDate(String orderId,String client);
}
