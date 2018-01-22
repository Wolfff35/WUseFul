package com.wolff.wuseful.localdb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by wolfff on 22.01.18.
 */

public class DataLab {
    private static DataLab sDataLab;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    private DataLab(Context context){
        mContext = context.getApplicationContext();
        mDatabase = new DbHelper(mContext).getWritableDatabase();
    }
}
