package com.example.hw11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("main","run Apage onCreate");
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("main","run Apage onStart");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("main","run Apage onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("main","run Apage onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("main","run Apage onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("main","run Apage onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("main","run Apage onDestory");
    }
}
