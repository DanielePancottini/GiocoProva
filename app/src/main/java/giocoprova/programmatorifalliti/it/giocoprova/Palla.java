package giocoprova.programmatorifalliti.it.giocoprova;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

public class Palla {
    public static int ballX;
    public static  int ballY;
    public static Paint ballPaint = new Paint();

    public static void spawnBall(){

        Canvas canvas = new Canvas();

        ballX = (int) Math.floor(Math.random());
        ballY = (int) Math.floor(Math.random());

        canvas.drawCircle(ballX, ballY, 10, ballPaint);
    }

    public boolean onTouchEvent(MotionEvent event){
        if((ballX == (int)event.getX())&&(ballY == (int)event.getY())){
            PlayActivity.counterScore++;
        }
        return false;
    }

}
