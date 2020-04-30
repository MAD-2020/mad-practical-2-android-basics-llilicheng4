package sg.edu.np.whack_a_mole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Whack-A-Mole";
    //declare buttons
    Button button1;
    Button button2;
    Button button3;
    TextView score;
    int point = 0;




/* Hint
        - The function setNewMole() uses the Random class to generate a random value ranged from 0 to 2.
        - Feel free to modify the function to suit your program.
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        score = findViewById(R.id.textView2);
        Log.v(TAG, "Finished Pre-Initialisation!");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG,"Left button clicked");
                if(button1.getText() == "*")
                {
                    point+=1;
                    score.setText("" + point);

                    Log.v(TAG,"Hit, score added!”");
                }
                else if (button1.getText() != "*" && point > 0)
                {
                    point -= 1;
                    score.setText("" + point);
                    Log.v(TAG,"Missed, score deducted!”");

                }
                else{
                    Log.v(TAG,"Error Occurred");
                }
                setNewMole();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG,"Middle button clicked");
                if(button2.getText() == "*")
                {
                    point+=1;
                    score.setText("" + point);
                    Log.v(TAG,"Hit, score added!”");
                }
                else if (button2.getText() != "*" && point > 0)
                {
                    point -= 1;
                    score.setText("" + point);
                    Log.v(TAG,"Missed, score deducted!”");
                }
                else{
                    Log.v(TAG,"Error Occurred");
                }
                setNewMole();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG,"Right button clicked");
                if(button3.getText() == "*")
                {
                    point+=1;
                    score.setText("" + point);
                    Log.v(TAG,"Hit, score added!”");
                }
                else if (button3.getText() != "*" && point > 0)
                {
                    point -= 1;
                    score.setText("" + point);
                    Log.v(TAG,"Missed, score deducted!”");
                }
                else{
                    Log.v(TAG,"Error Occurred");
                }
                setNewMole();
            }
        });

    }


    @Override
    protected void onStart(){
        super.onStart();
        setNewMole();
        Log.v(TAG, "Starting GUI!");

    }


    public void setNewMole()
    {
        Random ran = new Random();
        int randomLocation = ran.nextInt(3);
        if(randomLocation == 1){
            button1.setText("*");
            button2.setText("O");
            button3.setText("O");
        }
        else if(randomLocation == 2)
        {
            button1.setText("O");
            button2.setText("*");
            button3.setText("O");
        }
        else{
            button1.setText("O");
            button2.setText("O");
            button3.setText("*");
        }

}
}
