package giocoprova.programmatorifalliti.it.giocoprova;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    public TextView counterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        startCounter();

    }

    public void startCounter(){
        counterText = (TextView) findViewById(R.id.timerPlay);

        CountDownTimer countDownTimer = new CountDownTimer(60*1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counterText.setText("" + millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                counterText.setText("MARCO GAY");
            }
        }.start();
    }

}
