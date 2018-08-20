package com.goldsudo.pattern.decorator.order;

import com.goldsudo.pattern.adpter.order.api.SourceOrderApi;

public class ApiDecoratorImpl1 implements ApiDecorator {
    SourceOrderApi sourceOrderApi;
    public ApiDecoratorImpl1(SourceOrderApi sourceOrderApi){
        this.sourceOrderApi = sourceOrderApi;
    }

    @Override
    public void updateDate(String orderId, String date, String client) {
        sourceOrderApi.updateDate(orderId, date, client);
        System.out.println(client+"已将订单"+orderId+"的退款期延长至"+date);
    }
}
