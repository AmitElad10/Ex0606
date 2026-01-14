package com.example.ex0606;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView iVmain;
    int x;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iVmain = findViewById(R.id.iVmain);
    }
    public void Clicked(View v){
        x = (int)(Math.random() *3 +1);
        if(x == 1){
            btn.setText("1");
            iVmain.setImageResource(R.drawable.dog1);
        } else if (x == 2) {
            btn.setText("2");
            iVmain.setImageResource(R.drawable.dog2);
        }
            else {
            btn.setText("3");
            iVmain.setImageResource(R.drawable.dog3);
        }

    }

}