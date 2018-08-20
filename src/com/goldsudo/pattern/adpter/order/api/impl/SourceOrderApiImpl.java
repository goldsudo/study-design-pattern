package com.goldsudo.pattern.adpter.order.api.impl;

import com.goldsudo.pattern.adpter.order.api.SourceOrderApi;

public class SourceOrderApiImpl implements SourceOrderApi {
    @Override
    public void updateDate(String orderId, String date, String client) {
        System.out.println(client+"已将订单"+orderId+"的有效期延长至"+date);
    }

    public static void main(String[] args) {
        SourceOrderApi sourceOrderApi = new SourceOrderApiImpl();
        sourceOrderApi.updateDate("123456", "2014-10-15", "user");
    }
}