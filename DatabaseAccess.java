/**
 * @Author Ricky Clevinger
 * DatabaseAccess.java
 * Partial code from http://www.javahelps.com/2015/04/import-and-use-external-database-in.html
 */

package ricky.bookcomparison;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    public SQLiteDatabase database;
    private static DatabaseAccess instance;

    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */
    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    public List<String> getBooks() {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT Title FROM BookList", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(0));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }

    public String getISBN2(String SEMESTER, String DEPARTMENT, String COURSE, String SECTION) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT Book1ISBN FROM Prices WHERE SEMESTER == '" + SEMESTER +"' AND DEPARTMENT == '" + DEPARTMENT + "' AND COURSE == '" + COURSE + "' AND SECTION == '" + SECTION + "'", null);
        cursor.moveToFirst();
        string = cursor.getString(0);
        cursor.close();
        return string;
    }

    public String getRadNewPrice(String SEMESTER, String DEPARTMENT, String COURSE, String SECTION) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT Book1PriceNEW FROM Prices WHERE SEMESTER == '" + SEMESTER +"' AND DEPARTMENT == '" + DEPARTMENT + "' AND COURSE == '" + COURSE + "' AND SECTION == '" + SECTION + "'", null);
        cursor.moveToFirst();
        string = "$" + cursor.getString(0);
        if (cursor.getString(0) == null) {
            string = "Doesn't sell";
        }
        cursor.close();
        return string;
    }

    public String getRadNewPriceISBN(String ISBN) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT Book1PriceNEW FROM Prices WHERE Book1ISBN == '" + ISBN + "'" , null);
        cursor.moveToFirst();
        string = "$" + cursor.getString(0);
        if (cursor.getString(0) == null) {
            string = "Doesn't sell";
        }
        cursor.close();
        return string;
    }


    public String getRedNewPrice(String SEMESTER, String DEPARTMENT, String COURSE, String SECTION) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT Book1RedshelfBuy FROM Prices WHERE SEMESTER == '" + SEMESTER +"' AND DEPARTMENT == '" + DEPARTMENT + "' AND COURSE == '" + COURSE + "' AND SECTION == '" + SECTION + "'", null);
        cursor.moveToFirst();
        string = "$" + cursor.getString(0);
        if (cursor.getString(0) == null) {
            string = "Doesn't sell";
        }
        cursor.close();
        return string;
    }

    public String getRedNewPriceISBN(String ISBN) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT Book1RedshelfBuy FROM Prices WHERE Book1ISBN == '" + ISBN + "'" , null);
        cursor.moveToFirst();
        string = "$" + cursor.getString(0);
        if (cursor.getString(0) == null) {
            string = "Doesn't sell";
        }
        cursor.close();
        return string;
    }

    public String getAmaNewPriceISBN(String ISBN) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT Amazonnew FROM Prices WHERE Book1ISBN == '" + ISBN + "'" , null);
        cursor.moveToFirst();
        string = "$" + cursor.getString(0);
        if (cursor.getString(0) == null) {
            string = "Doesn't sell";
        }
        cursor.close();
        return string;
    }

    public String getAmaNewPrice(String SEMESTER, String DEPARTMENT, String COURSE, String SECTION) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT Amazonnew FROM Prices WHERE SEMESTER == '" + SEMESTER +"' AND DEPARTMENT == '" + DEPARTMENT + "' AND COURSE == '" + COURSE + "' AND SECTION == '" + SECTION + "'", null);
        cursor.moveToFirst();
        string = "$" + cursor.getString(0);
        if (cursor.getString(0) == null) {
            string = "Doesn't sell";
        }
        cursor.close();
        return string;
    }

    public String getTitleISBN(String ISBN) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT BookTitle FROM Prices WHERE Book1ISBN == '" + ISBN + "'" , null);
        cursor.moveToFirst();
        string = cursor.getString(0);
        if (cursor.getString(0) == null) {
            string = "No Book Assigned";
        }
        cursor.close();
        return string;
    }

    public String getTitle(String SEMESTER, String DEPARTMENT, String COURSE, String SECTION) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT BookTitle FROM Prices WHERE SEMESTER == '" + SEMESTER +"' AND DEPARTMENT == '" + DEPARTMENT + "' AND COURSE == '" + COURSE + "' AND SECTION == '" + SECTION + "'", null);
        cursor.moveToFirst();
        string = cursor.getString(0);
        if (cursor.getString(0) == null) {
            string = "No Book Assigned";
        }
        cursor.close();
        return string;
    }

    public String getISBN(String SEMESTER, String DEPARTMENT, String COURSE, String SECTION) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT Book1ISBN FROM Prices WHERE SEMESTER == '" + SEMESTER +"' AND DEPARTMENT == '" + DEPARTMENT + "' AND COURSE == '" + COURSE + "' AND SECTION == '" + SECTION + "'", null);
        cursor.moveToFirst();
        string = cursor.getString(0);
        if (cursor.getString(0) == null) {
            string = "No Book Assigned";
        }
        cursor.close();
        return string;
    }

    public String getISBNISBN(String ISBN) {
        String string = new String();
        Cursor cursor = database.rawQuery("SELECT Book1ISBN FROM Prices WHERE Book1ISBN == '" + ISBN + "'" , null);
        cursor.moveToFirst();
        string = cursor.getString(0);
        if (cursor.getString(0) == null) {
            string = "No Book Assigned";
        }
        cursor.close();
        return string;
    }


    public void clearTable() {
        database.execSQL("DELETE FROM BookList");
    }

    public void addList(String title) {
        database.execSQL("INSERT INTO BookList VALUES ('"+ title + "')");
    }

    public void updatePrice(String price, String SEMESTER, String DEPARTMENT, String COURSE, String SECTION) {
        database.execSQL("UPDATE Prices SET Book1PriceNew= '" + price + "' WHERE SEMESTER == '" + SEMESTER +"' AND DEPARTMENT == '" + DEPARTMENT + "' AND COURSE == '" + COURSE + "' AND SECTION == '" + SECTION + "'");
    }


}