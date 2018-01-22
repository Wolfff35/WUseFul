package com.wolff.wuseful.localdb;

/**
 * Created by wolfff on 22.01.18.
 */
public class DbSchema {

    //==========================================================================================
    public static final String DATABASE_NAME = "wtest.db";

    public static final String CREATE_TABLE_TEST = "CREATE TABLE "+ Table_Test.TABLE_NAME+" ("+
            Table_Test.Cols.ID            +" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            Table_Test.Cols.DATE          +" TEXT, "+
            Table_Test.Cols.COORD       +" INTEGER"+
     //         "FOREIGN KEY ("+ Table_Users.Cols.ID_USER+
     //       ") REFERENCES "+ Table_Users.TABLE_NAME+"("+
     //       Table_Users.Cols.ID_USER+")"+
            ")";

    //==================================================================================================
    public static final class Table_Test{

        public static final String TABLE_NAME = "table_coord";

        public static final class Cols{
            public static final String ID          = "_id";
            public static final String DATE        = "_date";
            public static final String COORD       = "_coord";
        }

    }

}
