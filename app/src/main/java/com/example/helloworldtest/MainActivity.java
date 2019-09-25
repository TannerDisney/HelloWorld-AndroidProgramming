package com.example.helloworldtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnContinue);
        final CheckBox cb = findViewById(R.id.cbTos);

        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(cb.isChecked()) {
                Toast.makeText(getApplicationContext(), "Welcome to Android Studio!", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(getApplicationContext(), "Please Accept our Terms of Service!", Toast.LENGTH_SHORT).show();
            }
        }
        });
    }
}
