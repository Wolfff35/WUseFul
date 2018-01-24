package com.wolff.wuseful.localdb;

import android.content.ContentValues;

import com.wolff.wuseful.WTestObject;

/**
 * Created by wolfff on 23.01.18.
 */

public class DbContentValues {

    public static ContentValues getCV_testObject(WTestObject testObject){
        ContentValues values = new ContentValues();
        values.put(DbSchema.Table_Test.Cols.ID,testObject.get_id());
        values.put(DbSchema.Table_Test.Cols.DATE,testObject.get_id());
        values.put(DbSchema.Table_Test.Cols.COORD,testObject.get_id());
        return values;
    }
}
