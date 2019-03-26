package sergioandrade.blackjack;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setMessage("Please fiil in with your username.");
        builder.setView(input);
        builder.setCancelable(false);
        builder.setPositiveButton("Submit", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which){
                username = input.getText().toString();
            }
        });
        builder.show();
        logic = new Logic();
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
}