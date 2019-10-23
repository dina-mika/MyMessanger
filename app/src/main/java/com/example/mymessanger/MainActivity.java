package com.example.mymessanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        public static final String KEY_MSG1 = "com.example.dina.msg1";
        public static Boolean a = false;
        EditText mes1;
        TextView mesAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mes1 = findViewById(R.id.editTextMessage1);
        mesAll = findViewById(R.id.textViewAllMessages);
        Intent i = getIntent();
        String sMes1 = i.getStringExtra(Main3Activity.KEY_MSG1) + " " + i.getStringExtra(Main3Activity.KEY_MSG2) + " " + i.getStringExtra(Main3Activity.KEY_MSG3);

        mesAll.setText(sMes1);
        if (a){
            mesAll.setVisibility(View.VISIBLE);
        }
        else{
            mesAll.setVisibility(View.INVISIBLE);

        }


    }

    public void goSecond(View view) {
        String sMes1 = mes1.getText().toString();
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra(KEY_MSG1, sMes1);
        startActivity(i);
    }
}
