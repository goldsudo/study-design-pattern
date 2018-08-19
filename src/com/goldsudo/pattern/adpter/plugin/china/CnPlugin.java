package com.goldsudo.pattern.adpter.plugin.china;

public class CnPlugin implements ICnPlugin {
    @Override
    public void chargeWith2Pins() {
        System.out.println("使用符合中国标准的两头充电器充电");
    }
}
