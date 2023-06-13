package com.example.with;

import static android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButton = new FloatingActionButton(this);
        Button button = new Button(this);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
        relativeLayout.setLayoutParams(layoutParams);



        RelativeLayout.LayoutParams floatanction=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT



        );

        RelativeLayout.LayoutParams btn=new RelativeLayout.LayoutParams(
               50,50
        );
button.setClickable(true);
        floatingActionButton.setLayoutParams(floatanction);
        floatanction.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        floatanction.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        relativeLayout.addView(floatingActionButton);
        floatingActionButton.setImageResource(R.drawable.baseline_add_24);

floatingActionButton.setClickable(true);
        floatingActionButton.getCustomSize();
        floatingActionButton.getCompatElevation();
        floatingActionButton.getRippleColor();

button.setLayoutParams(btn);


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifyAll();
                for (int i = 0; i<i; i++) {

                    layout();



                }
            }
        });
        setContentView(relativeLayout);


    }

    private void layout() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        relativeLayout.setLayoutParams(layoutParams);
        Button button= new Button(this);
        button.setClickable(true);
        RelativeLayout.LayoutParams btn=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        button.setLayoutParams(btn);


    }
}