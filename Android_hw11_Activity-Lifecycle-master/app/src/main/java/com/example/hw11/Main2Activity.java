package com.example.hw11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("main","run Bpage onStart");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("main","run Bpage onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("main","run Bpage onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("main","run Bpage onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("main","run Bpage onStop");
    }
}
