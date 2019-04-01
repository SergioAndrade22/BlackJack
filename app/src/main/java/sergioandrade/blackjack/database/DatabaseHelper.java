package sergioandrade.blackjack.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import sergioandrade.blackjack.activities.WinActivity;
import sergioandrade.blackjack.database.DatabaseContract.FeedEntry;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Results.db";
    public static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                    FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    FeedEntry.COLUMN_NAME_TITLE + " TEXT," +
                    FeedEntry.USER_COL_WIN + " INTEGER, "+ FeedEntry.USER_COL_LOSE + " INTEGER )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
    class Valores{
        String nickname;
        int wins;
        int close;
        public Valores(String n, int w, int c){
            nickname=n;
            wins=w;
            close=c;
        }
    }
    //Tratando de obtener una fila de la base de datos, copiado y pegado de : https://stackoverflow.com/questions/26355615/getting-single-row-from-table-in-sqlite-android
    /*
    public List<Valores> getDatabaseRow(){
        List<Valores> valores= new ArrayList<Valores>();
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT  * FROM " + TABLE_USERMEALUNIT + " WHERE "
                + TABLE_USERMEALUNIT_ID + " = " + mealid;
    }
    */
}