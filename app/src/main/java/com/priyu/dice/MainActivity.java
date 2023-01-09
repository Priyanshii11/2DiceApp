package com.priyu.dice;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btn;
   // private ConstraintLayout layout;
    private TextView txt,txt2;
    private Random random = new Random();
    private ImageView img,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =findViewById(R.id.button);
        txt = findViewById(R.id.textView);
        img = findViewById(R.id.imageButton);
        img2 = findViewById(R.id.imageButton2);
        txt2 = findViewById(R.id.textView1);
        //layout = findViewById(R.id.layout);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myNum = random.nextInt(6)+1;
                int myNum2 = random.nextInt(6)+1;

//                int color = Color.argb(255,random.nextInt(256),random.nextInt(256)
//                ,random.nextInt(256));
//                layout.setBackgroundColor(color);

                switch (myNum){
                    case 1:
                        img.setImageResource(R.drawable.dice1);
                        txt.setText("One");
                    break;
                    case 2:
                        img.setImageResource(R.drawable.dice2);
                        txt.setText("Two");
                        break;
                        case 3:
                        img.setImageResource(R.drawable.dice3);
                        txt.setText("Three ");
                       break;
                    case 4:
                        img.setImageResource(R.drawable.dice4);
                        txt.setText("Four");
                        break;
                    case 5:
                        img.setImageResource(R.drawable.dice5);
                        txt.setText("five");
                        break;
                    case 6:
                        img.setImageResource(R.drawable.dice6);
                        txt.setText("Six");
                        break;
                }
                switch (myNum2){
                    case 1:
                        img2.setImageResource(R.drawable.dice1);
                        txt2.setText("One");
                        break;
                    case 2:
                        img2.setImageResource(R.drawable.dice2);
                        txt2.setText("Two");
                        break;
                    case 3:
                        img2.setImageResource(R.drawable.dice3);
                        txt2.setText("Three");
                        break;
                    case 4:
                        img2.setImageResource(R.drawable.dice4);
                        txt2.setText("Four");
                        break;
                    case 5:
                        img2.setImageResource(R.drawable.dice5);
                        txt2.setText("Five");
                        break;
                    case 6:
                        img2.setImageResource(R.drawable.dice6);
                        txt2.setText("Six");
                        break;
                }

            }
        });
    }
}