package com.goldsudo.pattern.adpter.plugin.england;

public class EnPlugin implements IEnPlugin {
    @Override
    public void chargeWith3Pins() {
        System.out.println("使用符合英国标准的三头充电器充电");
    }
}
