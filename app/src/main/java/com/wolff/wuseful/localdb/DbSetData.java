package com.wolff.wuseful.localdb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.wolff.wuseful.WTestObject;

/**
 * Created by wolfff on 22.01.18.
 */

public class DbSetData {
    private static DbSetData sDbSetData;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    private DbSetData(Context context){
        mContext = context.getApplicationContext();
        mDatabase = new DbHelper(mContext).getWritableDatabase();
    }
    public static DbSetData get(Context context) {
        if (sDbSetData == null) {
            sDbSetData = new DbSetData(context);
        }
        return sDbSetData;
    }
//-----------------------------------------------------
    public void testObject_add(WTestObject testObject){
        ContentValues cv = DbContentValues.getCV_testObject(testObject);
        mDatabase.insert(DbSchema.Table_Test.TABLE_NAME,null,cv);
    }
    public void testObject_delete(WTestObject testObject) {
        mDatabase.delete(
                DbSchema.Table_Test.TABLE_NAME,
                DbSchema.Table_Test.Cols.ID + " =?",
                new String[]{String.valueOf(testObject.get_id())}
        );
    }

}
