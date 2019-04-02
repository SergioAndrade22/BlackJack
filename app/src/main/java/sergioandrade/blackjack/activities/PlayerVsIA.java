package sergioandrade.blackjack.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import sergioandrade.blackjack.creation.Card;
import sergioandrade.blackjack.gameLogic.Logic;
import sergioandrade.blackjack.R;

public class PlayerVsIA extends PortraitScreen {
    private EditText input;
    private String username;
    private Logic logic;

    //Listas de cartas
    ListView CartasJugador;
    ListView CartasIA;

    int[] imagenes = {
            R.drawable.club_1,
            R.drawable.club_2,
            R.drawable.club_3,
            R.drawable.club_4
    };

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
        TextView playerDisplay = findViewById(R.id.playerScore);
        playerDisplay.setText(logic.getPlayerDisplay());
        TextView iaDisplay = findViewById(R.id.iaScore);
        iaDisplay.setText(logic.getIADisplay());
    }

    public void draw(View view){
        logic.draw();
        TextView playerDisplay = findViewById(R.id.playerScore);
        playerDisplay.setText(logic.getPlayerDisplay());
        TextView iaDisplay = findViewById(R.id.iaScore);
        iaDisplay.setText(logic.getIADisplay());
    }

    public void stay(View view){
        logic.stay();
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
        intent.putExtra("player",username);
        startActivity(intent);
    }

    public void callLose(){
        Intent intent = new Intent(this, LoseActivity.class);
        intent.putExtra("player",username);
        startActivity(intent);
    }

    public void addImage(Card c){
        ImageView view = findViewById(R.id.deckBack);
        Resources res = getResources();
        int id = 0;
        switch (c.getSuit()){
            case "spade" :
                switch (c.getRepresValue()){
                    case 1 : {
                        id = R.drawable.spade_1;
                    } break;
                    case 2 : {
                        id = R.drawable.spade_2;
                    } break;
                    case 3 : {
                        id = R.drawable.spade_3;
                    } break;
                    case 4 : {
                        id = R.drawable.spade_4;
                    } break;
                    case 5 : {
                        id = R.drawable.spade_5;
                    } break;
                    case 6 : {
                        id = R.drawable.spade_6;
                    } break;
                    case 7 :{
                        id = R.drawable.spade_7;
                    } break;
                    case 8 : {
                        id = R.drawable.spade_8;
                    } break;
                    case 9 : {
                        id = R.drawable.spade_9;
                    } break;
                    case 10 : {
                        id = R.drawable.spade_10;
                    } break;
                    case 11 : {
                        id = R.drawable.spade_11;
                    } break;
                    case 12 : {
                        id = R.drawable.spade_12;
                    } break;
                    case 13 : {
                        id = R.drawable.spade_13;
                    } break;
                }
            case "club" :
                switch (c.getRepresValue()){
                    case 1 : {
                        id = R.drawable.club_1;
                    } break;
                    case 2 : {
                        id = R.drawable.club_2;
                    } break;
                    case 3 : {
                        id = R.drawable.club_3;
                    } break;
                    case 4 : {
                        id = R.drawable.club_4;
                    } break;
                    case 5 : {
                        id = R.drawable.club_5;
                    } break;
                    case 6 : {
                        id = R.drawable.club_6;
                    } break;
                    case 7 : {
                        id = R.drawable.club_7;
                    } break;
                    case 8 : {
                        id = R.drawable.club_8;
                    } break;
                    case 9 : {
                        id = R.drawable.club_9;
                    } break;
                    case 10 : {
                        id = R.drawable.club_10;
                    } break;
                    case 11 : {
                        id = R.drawable.club_11;
                    } break;
                    case 12 : {
                        id = R.drawable.club_12;
                    } break;
                    case 13 : {
                        id = R.drawable.club_13;
                    } break;
                }
            case "diamond" :
                switch (c.getRepresValue()){
                    case 1 : {
                        id = R.drawable.diamond_1;
                    } break;
                    case 2 : {
                        id = R.drawable.diamond_2;
                    } break;
                    case 3 : {
                        id = R.drawable.diamond_3;
                    } break;
                    case 4 : {
                        id = R.drawable.diamond_4;
                    } break;
                    case 5 : {
                        id = R.drawable.diamond_5;
                    } break;
                    case 6 : {
                        id = R.drawable.diamond_6;
                    } break;
                    case 7 : {
                        id = R.drawable.diamond_7;
                    } break;
                    case 8 : {
                        id = R.drawable.diamond_8;
                    } break;
                    case 9 : {
                        id = R.drawable.diamond_9;
                    } break;
                    case 10 : {
                        id = R.drawable.diamond_10;
                    } break;
                    case 11 : {
                        id = R.drawable.diamond_11;
                    } break;
                    case 12 : {
                        id = R.drawable.diamond_12;
                    } break;
                    case 13 : {
                        id = R.drawable.diamond_13;
                    } break;
                }
            case "heart" :
                switch (c.getRepresValue()){
                    case 1 : {
                        id = R.drawable.heart_1;
                    } break;
                    case 2 : {
                        id = R.drawable.heart_2;
                    } break;
                    case 3 : {
                        id = R.drawable.heart_3;
                    } break;
                    case 4 : {
                        id = R.drawable.heart_4;
                    } break;
                    case 5 : {
                        id = R.drawable.heart_5;
                    } break;
                    case 6 : {
                        id = R.drawable.heart_6;
                    } break;
                    case 7 : {
                        id = R.drawable.heart_7;
                    } break;
                    case 8 : {
                        id = R.drawable.heart_8;
                    } break;
                    case 9 : {
                        id = R.drawable.heart_9;
                    } break;
                    case 10 : {
                        id = R.drawable.heart_10;
                    } break;
                    case 11 : {
                        id = R.drawable.heart_11;
                    } break;
                    case 12 : {
                        id = R.drawable.heart_12;
                    } break;
                    case 13 : {
                        id = R.drawable.heart_13;
                    } break;
                }
        }
        System.out.println("EL FUCKING ID VALE: " + id);
        Bitmap b = BitmapFactory.decodeResource(res, id);
        view.setImageBitmap(Bitmap.createScaledBitmap(b, 100, 140, false));
    }
}