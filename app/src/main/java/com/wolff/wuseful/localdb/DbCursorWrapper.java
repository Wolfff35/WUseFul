package com.wolff.wuseful.localdb;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.wolff.wuseful.DateFormatTools;
import com.wolff.wuseful.WTestObject;

/**
 * Created by wolfff on 22.01.18.
 */

public class DbCursorWrapper extends CursorWrapper {

      public DbCursorWrapper(Cursor cursor) {
        super(cursor);
    }
    public WTestObject getWTestObject(){
        WTestObject testObject  = new WTestObject();
        testObject.set_id(getDouble(getColumnIndex(DbSchema.Table_Test.Cols.ID)));
        DateFormatTools dft = new DateFormatTools();
        testObject.set_date(dft.dateFromString(getString(getColumnIndex(DbSchema.Table_Test.Cols.DATE)),DateFormatTools.DATE_FORMAT_SHORT));
        testObject.set_coord(getDouble(getColumnIndex(DbSchema.Table_Test.Cols.COORD)));
        return testObject;
    }
}
