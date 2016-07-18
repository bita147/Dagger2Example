package com.dagger.dagger2example.application;

import android.app.Application;

import com.dagger.dagger2example.dependencties.DaggerGraphComponents;


public class DaggerApplication extends Application {
    private static DaggerApplication instance;
    private static DaggerGraphComponents component;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initComponents();
    }

    public static DaggerGraphComponents components() {
        return component;
    }

    private void initComponents() {
        component = DaggerGraphComponents.Initializer.init(instance);
    }
}
