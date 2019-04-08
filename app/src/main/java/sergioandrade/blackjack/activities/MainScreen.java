package sergioandrade.blackjack.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import sergioandrade.blackjack.R;


public class MainScreen extends PortraitScreen {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void pvp(View view){
        Toast.makeText(getApplicationContext(), "Available in future releases.", Toast.LENGTH_SHORT).show();
    }

    public void start(View view){
        Intent intent = new Intent(this, PlayerVsIA.class);
        startActivity(intent);
    }

    public void about(View view){
        Intent intent = new Intent(this, AboutScreen.class);
        startActivity(intent);
    }

    public void history(View view){
        Intent intent = new Intent(this, History.class);
        startActivity(intent);
    }
}