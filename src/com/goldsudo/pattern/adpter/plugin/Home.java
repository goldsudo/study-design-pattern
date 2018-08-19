package com.goldsudo.pattern.adpter.plugin;

import com.goldsudo.pattern.adpter.plugin.china.CnPlugin;
import com.goldsudo.pattern.adpter.plugin.china.ICnPlugin;
import com.goldsudo.pattern.adpter.plugin.england.EnPlugin;
import com.goldsudo.pattern.adpter.plugin.england.IEnPlugin;

public class Home {
    private ICnPlugin cnPlugin;

    Home() {
    }

    Home(ICnPlugin cnPlugin) {
        this.cnPlugin = cnPlugin;
    }

    public void setCnPlugin(ICnPlugin cnPlugin) {
        this.cnPlugin = cnPlugin;
    }

    public void charge() {
        cnPlugin.chargeWith2Pins();
    }

    public static void main(String[] args) {
        //直接使用国产2头充电器充电
        ICnPlugin cnPlugin = new CnPlugin();
        Home home = new Home(cnPlugin);
        home.charge();

        //使用适配器将英国3头充电器转换为国产2头充电器进行充电
        IEnPlugin enPlugin = new EnPlugin();
        PluginAdapter pluginAdapter = new PluginAdapter(enPlugin);
        home.setCnPlugin(pluginAdapter);
        home.charge();
    }
}
