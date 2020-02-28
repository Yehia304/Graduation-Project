package com.yehia.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.Button2);
        signup = (Button)findViewById(R.id.signup) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity3();
            }
        });

    }

    public void openactivity2(){
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
    public void openactivity3(){
        Intent intent = new Intent(this,Signup.class);
        startActivity(intent);
    }
}
