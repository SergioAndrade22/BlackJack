package sergioandrade.blackjack.activities;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import sergioandrade.blackjack.database.DatabaseContract;
import sergioandrade.blackjack.database.DatabaseHelper;
import sergioandrade.blackjack.gameLogic.Logic;
import sergioandrade.blackjack.R;

public class PlayerVsIA extends PortraitScreen {
    private EditText input;
    private String username;
    private Logic logic;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_vs_i);
        input = new EditText(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Username");
        builder.setIcon(R.drawable.logo);
        builder.setMessage("Please fiil in with your username.");
        builder.setView(input);
        builder.setCancelable(false);
        builder.setPositiveButton("Submit", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which){
                username = input.getText().toString();
            }
        });
        builder.show();
        logic = new Logic(this);
        logic.deal();
        TextView playerDisplay = (TextView) findViewById(R.id.playerScore);
        playerDisplay.setText(logic.getPlayerDisplay());
        TextView iaDisplay = (TextView) findViewById(R.id.iaScore);
        iaDisplay.setText(logic.getIADisplay());
    }

    public void draw(View view){
        logic.draw();
        TextView playerDisplay = (TextView) findViewById(R.id.playerScore);
        playerDisplay.setText(logic.getPlayerDisplay());
        TextView iaDisplay = (TextView) findViewById(R.id.iaScore);
        iaDisplay.setText(logic.getIADisplay());
    }

    public void stay(View view){
        logic.stay();
    }

    public void saveInDB(String username){
        SQLiteDatabase db =  new DatabaseHelper(this).getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(DatabaseContract.FeedEntry.COLUMN_NAME_TITLE, username);

        db.insert(DatabaseContract.FeedEntry.TABLE_NAME, null, values);

        db.close();
    }

    public void disableDraw(){
        Button draw = (Button) findViewById(R.id.draw);
        draw.setEnabled(false);
    }

    public void enableDraw(){
        Button draw = (Button) findViewById(R.id.draw);
        draw.setEnabled(true);
    }

    public void callWin(){
        Intent intent = new Intent(this, WinActivity.class);
        startActivity(intent);
    }

    public void callLose(){
        Intent intent = new Intent(this, LoseActivity.class);
        startActivity(intent);
    }
}