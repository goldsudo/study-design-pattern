package com.goldsudo.pattern.decorator.order;

import com.goldsudo.pattern.adpter.order.api.SourceOrderApi;
import com.goldsudo.pattern.adpter.order.api.impl.SourceOrderApiImpl;

public class ApiDecoratorImpl2 implements ApiDecorator {
    SourceOrderApi sourceOrderApi;

    public ApiDecoratorImpl2(SourceOrderApi sourceOrderApi) {
        this.sourceOrderApi = sourceOrderApi;
    }

    @Override
    public void updateDate(String orderId, String date, String client) {
        sourceOrderApi.updateDate(orderId, date, client);
        System.out.println("已发送邮件至" + client + "的邮箱");
    }

    public static void main(String[] args) {
        SourceOrderApi api = new SourceOrderApiImpl();
        //使用两个装饰器包装api，从而增强api的功能
        SourceOrderApi api1 = new ApiDecoratorImpl1(api);
        SourceOrderApi api2 = new ApiDecoratorImpl2(api1);
        api2.updateDate("12345", "2017-05-01", "user");
    }
}
