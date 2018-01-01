package com.alfianyusufabdullah.single;

import android.util.Log;

/**
 * Created by jonesrandom on 1/1/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class MySingleton {

    private static MySingleton ourInstance;
    private String Nama;
    private int umur;

    public static MySingleton getInstance() {

        if (ourInstance ==null){
            ourInstance = new MySingleton();
        }
        return ourInstance;
    }

    private MySingleton() {
    }

    public static void setName(String name) {
        ourInstance.Nama = name;
        Log.i("SINGLETON", "init Name " + name);
    }

    public static String getName() {
        return ourInstance.Nama;
    }

    public static void setUmur(int umur) {
        ourInstance.umur = umur;
        Log.i("SINGLETON", "init Umur " + umur);
    }

    public static int getUmur() {
        return ourInstance.umur;
    }
}
