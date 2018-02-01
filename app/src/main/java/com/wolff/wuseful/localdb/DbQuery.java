package com.wolff.wuseful.localdb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by wolfff on 23.01.18.
 */

public class DbQuery<T> {
    private static DbQuery sDbQuery;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    private DbQuery(Context context){
        mContext = context.getApplicationContext();
        mDatabase = new DbHelper(mContext).getReadableDatabase();
    }
    public static DbQuery get(Context context) {
        if (sDbQuery == null) {
            sDbQuery = new DbQuery(context);
        }
        return sDbQuery;
    }

    public DbCursorWrapper query_testObjects(){
        String selection = null;
        String[] selectionArgs = null;
        String[] columns = null;
        String groupBy = null;
        String having = null;
        String orderBy = DbSchema.Table_Test.Cols.COORD + " DESC";
        Cursor cursor = mDatabase.query(DbSchema.Table_Test.TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                groupBy,
                having,
                orderBy);
        return new DbCursorWrapper(cursor);
    }
}
