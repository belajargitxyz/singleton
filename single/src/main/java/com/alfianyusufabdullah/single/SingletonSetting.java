package com.alfianyusufabdullah.single;

import android.net.Uri;

/**
 * Created by jonesrandom on 1/1/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class SingletonSetting {

    private static final SingletonSetting ourInstance = new SingletonSetting();
    private String Name;
    private int Umur;

    public static SingletonSetting getInstance() {
        return ourInstance;
    }

    private SingletonSetting() {
        MySingleton.getInstance();
    }

    public SingletonSetting setName(String Name) {
        ourInstance.Name = Name;
        return ourInstance;
    }

    public SingletonSetting setUmur(int Umur) {
        ourInstance.Umur = Umur;
        return ourInstance;
    }

    public void build() {
        MySingleton.setName(Name);
        MySingleton.setUmur(Umur);
    }
}
