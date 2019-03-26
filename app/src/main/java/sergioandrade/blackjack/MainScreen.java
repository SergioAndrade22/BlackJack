package sergioandrade.blackjack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


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
}