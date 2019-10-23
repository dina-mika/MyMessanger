package com.example.mymessanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String KEY_MSG2 = "com.example.dina.msg2";
    public static final String KEY_MSG1 = MainActivity.KEY_MSG1;

    EditText mes2;
    TextView mes1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        mes1 = findViewById(R.id.textViewMessage1);
        mes2 = findViewById(R.id.editTextMessage2);

        Intent i;
        i=getIntent();
        String sMes1 = i.getStringExtra(MainActivity.KEY_MSG1);
        mes1.setText(sMes1);
    }

    public void goThird(View view) {
        String sMes1 = mes1.getText().toString();
        String sMes2 = mes2.getText().toString();
        Intent i = new Intent(this, Main3Activity.class);
        i.putExtra(KEY_MSG1, sMes1);
        i.putExtra(KEY_MSG2, sMes2);
        startActivity(i);
    }
}
