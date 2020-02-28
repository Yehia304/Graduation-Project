package com.yehia.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

    private Button Doctorbutton;
    private Button Patientbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Doctorbutton = (Button)findViewById(R.id.Doctorbutton);
        Patientbutton = (Button)findViewById(R.id.Patientbutton);

        Doctorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctoractivity();
            }
        });

        Patientbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPatientactivity();
            }
        });

    }

    public void openDoctoractivity(){
        Intent intent = new Intent(this,Doctoractivity.class);
        startActivity(intent);
    }

    public void openPatientactivity(){
        Intent intent = new Intent(this,Patientactivity.class);
        startActivity(intent);
    }
}
