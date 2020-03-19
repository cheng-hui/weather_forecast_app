package com.animee.forecast.base;

import android.app.Application;

import com.animee.forecast.db.DBManager;

import org.xutils.x;
//xutils加载网络数据 的* 1.声明整体模块
public class UniteApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        DBManager.initDB(this);
    }
}
