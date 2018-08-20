package com.goldsudo.pattern.adpter.order.api.impl;

import com.goldsudo.pattern.adpter.order.api.AppOrderApi;
import com.goldsudo.pattern.adpter.order.api.SourceOrderApi;

public class AppOrderApiImpl implements AppOrderApi {
    SourceOrderApi sourceOrderApi;

    public AppOrderApiImpl() {
        sourceOrderApi = new SourceOrderApiImpl();
    }

    @Override
    public void updateDate(String orderId, String client) {
        //这里适配的方式随意，但是保证是要完全兼容原有的，就是保证调用原有的接口
        sourceOrderApi.updateDate(orderId, "9999-12-31", client);
    }

    public static void main(String[] args) {
        AppOrderApi appOrderApi = new AppOrderApiImpl();
        appOrderApi.updateDate("123456", "user");
    }

}
