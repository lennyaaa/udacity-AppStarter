package com.example.android.appstarter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){

        Button btn = (Button)view;
        btn.getText();
        CharSequence cs = "This button will launch my " + btn.getText() + " app!";
        Toast.makeText(MainActivity.this, cs, Toast.LENGTH_SHORT).show();
    }
}
