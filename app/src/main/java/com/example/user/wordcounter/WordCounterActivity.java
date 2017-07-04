package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText inputText;
    TextView answerText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        inputText = (EditText)findViewById(R.id.text_to_count);
        answerText = (TextView)findViewById(R.id.count_result);
        countButton = (Button)findViewById(R.id.count_button);
        Log.d(getClass().toString(), "onCreate called");
    }
}
