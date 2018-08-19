package com.goldsudo.pattern.adpter.plugin;

import com.goldsudo.pattern.adpter.plugin.china.ICnPlugin;
import com.goldsudo.pattern.adpter.plugin.england.IEnPlugin;

public class PluginAdapter implements ICnPlugin {
    private IEnPlugin enPlugin;

    PluginAdapter() {
    }

    PluginAdapter(IEnPlugin enPlugin) {
        this.enPlugin = enPlugin;
    }

    public void setEnPlugin(IEnPlugin enPlugin) {
        this.enPlugin = enPlugin;
    }

    @Override
    public void chargeWith2Pins() {
        System.out.println("将英国标准的3头充电器转换为中国标准的2头充电器");
        enPlugin.chargeWith3Pins();
    }
}
