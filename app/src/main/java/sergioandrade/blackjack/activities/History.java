package sergioandrade.blackjack.activities;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import sergioandrade.blackjack.R;
import sergioandrade.blackjack.database.DatabaseContract;
import sergioandrade.blackjack.database.DatabaseHelper;

public class History extends PortraitScreen {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        SQLiteDatabase db = new DatabaseHelper(this).getReadableDatabase();
        String[] selection = {DatabaseContract.FeedEntry.COLUMN_NAME_TITLE, DatabaseContract.FeedEntry.USER_COL_WIN, DatabaseContract.FeedEntry.USER_COL_LOSE};
        Cursor cursor = db.query(DatabaseContract.FeedEntry.TABLE_NAME, selection, null, null, null, null, null, null);

        LinearLayout view1 = findViewById(R.id.linearU);
        LinearLayout view2 = findViewById(R.id.linearW);
        LinearLayout view3 = findViewById(R.id.linearL);
        TextView u= new TextView(this);
        TextView w= new TextView(this);
        TextView l= new TextView(this);
        u.setText("USERNAME:");
        w.setText("WINS:");
        l.setText("LOSE:");
        view1.addView(u);
        view2.addView(w);
        view3.addView(l);

        while(cursor.moveToNext()){
            String username = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseContract.FeedEntry.COLUMN_NAME_TITLE));
            int win = cursor.getInt(cursor.getColumnIndexOrThrow(DatabaseContract.FeedEntry.USER_COL_WIN));
            int lose = cursor.getInt(cursor.getColumnIndexOrThrow(DatabaseContract.FeedEntry.USER_COL_LOSE));

            u= new TextView(this);
            w= new TextView(this);
            l= new TextView(this);
            u.setText(username);
            w.setText(String.valueOf(win));
            l.setText(String.valueOf(lose));
            view1.addView(u);
            view2.addView(w);
            view3.addView(l);
        }
        db.close();
    }
}
