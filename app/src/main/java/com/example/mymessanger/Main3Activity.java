package com.example.mymessanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    public static final String KEY_MSG4 = "com.example.dina.msg4";
    public static final String KEY_MSG3 = "com.example.dina.msg3";
    public static final String KEY_MSG1 = Main2Activity.KEY_MSG1;
    public static final String KEY_MSG2 = Main2Activity.KEY_MSG2;
    TextView mes2;
    TextView mes1;
    EditText mes3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mes1 = findViewById(R.id.textViewMessage1);
        mes2 = findViewById(R.id.textViewMessage2);
        mes3 = findViewById(R.id.editTextMessage3);

        Intent i = getIntent();
        String sMes1 = i.getStringExtra(Main2Activity.KEY_MSG1);
        String sMes2 = i.getStringExtra(Main2Activity.KEY_MSG2);
        mes1.setText(sMes1);
        mes2.setText(sMes2);
    }

    public void goFirst(View view) {
        String sMes1 = mes1.getText().toString();
        String sMes2 = mes2.getText().toString();
        String sMes3 = mes3.getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra(KEY_MSG1, sMes1);
        i.putExtra(KEY_MSG2, sMes2);
        i.putExtra(KEY_MSG3, sMes3);
        MainActivity.a = true;
        startActivity(i);
    }
}
