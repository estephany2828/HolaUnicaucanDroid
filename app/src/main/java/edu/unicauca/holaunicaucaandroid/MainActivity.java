package edu.unicauca.holaunicaucaandroid;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Date;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{


    Button btn;

    @Override
    protected void onCreate(Bundle icicle) {

        super.onCreate(icicle);
        //TODO: Falta hacer la actividad 1

        setContentView(R.layout.activity_main);
        btn = new Button(this);
        btn.setOnClickListener(this);
        updateTime();
        setContentView(btn);
    }

    private void updateTime() {
        btn.setText((new Date()).toString());
    }

    @Override
    public void onClick(View view) {
        //updateTime();
    }
}
