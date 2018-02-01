package com.wolff.wuseful;

import android.util.Log;

/**
 * Created by wolfff on 01.02.18.
 */

public class TestGeneric<T> {
    private T item;
    public TestGeneric(){

    }
    public void WtiteType(){
        Log.e("TRITE TYPE","get name = "+item.getClass());
    }
}
