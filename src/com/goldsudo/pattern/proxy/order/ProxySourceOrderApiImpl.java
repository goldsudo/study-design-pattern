package com.goldsudo.pattern.proxy.order;

import com.goldsudo.pattern.adpter.order.api.SourceOrderApi;
import com.goldsudo.pattern.adpter.order.api.impl.SourceOrderApiImpl;

public class ProxySourceOrderApiImpl implements SourceOrderApi {
    SourceOrderApi sourceOrderApiImpl;

    public ProxySourceOrderApiImpl() {
        sourceOrderApiImpl = new SourceOrderApiImpl();
    }

    @Override
    public void updateDate(String orderId, String date, String client) {
        //进行判断，如果是admin则更新否则让其输入账号密码
        if ("admin".equals(client)) {
            sourceOrderApiImpl.updateDate(orderId, date, client);
        } else {
            System.out.println("账号不是admin，没有查询权限，请输入以admin操作");
        }
    }

    public static void main(String[] args) {
        SourceOrderApi api = new ProxySourceOrderApiImpl();
        api.updateDate("12345","2015-06-07","user");
    }
}
