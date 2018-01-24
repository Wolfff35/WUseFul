package com.wolff.wuseful.localdb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.wolff.wuseful.WTestObject;

import java.util.ArrayList;

/**
 * Created by wolfff on 23.01.18.
 */

public class DbGetData {
    private Context mContext;

    private DbGetData(Context context){
        mContext = context.getApplicationContext();
    }

    public ArrayList<WTestObject> getTestObjectList(){
        DbCursorWrapper cursorWrapper = DbQuery.get(mContext).query_testObjects();
        ArrayList<WTestObject> testObjects = new ArrayList<>();
        cursorWrapper.moveToFirst();
        while (!cursorWrapper.isAfterLast()){
            WTestObject testObject = cursorWrapper.getWTestObject();
            testObjects.add(testObject);
            cursorWrapper.moveToNext();
        }
        cursorWrapper.close();
        return testObjects;
    }
}
