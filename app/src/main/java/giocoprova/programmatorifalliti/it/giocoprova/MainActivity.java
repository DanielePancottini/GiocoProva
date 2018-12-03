package giocoprova.programmatorifalliti.it.giocoprova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btnPlay;
    public Button btnOptions;
    public Button btnShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnOptions = (Button) findViewById(R.id.btnOptions);
        btnShop = (Button) findViewById(R.id.btnShop);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayActivity(PlayActivity.class);
            }
        });

        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayActivity(OptionsActivity.class);
            }
        });

        btnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayActivity(ShopActivity.class);
            }
        });
    }

    public void openPlayActivity(Class x){
        Intent intent = new Intent(this, x);
        startActivity(intent);
    }

}
