/**
 * Code learned from http://www.javahelps.com/2015/04/import-and-use-external-database-in.html
 * DatabaseOpenHelper.java
 */

package ricky.bookcomparison;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "NewPrices.sqlite";
    private static final int DATABASE_VERSION = 1;

    public DatabaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}