package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText inputTextField;
    TextView answerTextField;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        inputTextField = (EditText)findViewById(R.id.text_to_count);
        answerTextField = (TextView)findViewById(R.id.count_result);
        countButton = (Button)findViewById(R.id.count_button);
        Log.d(getClass().toString(), "onCreate called");
    }


    public void onCountButtonClicked(View button) {
        String text_that_user_inputs = inputTextField.getText().toString();
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        Log.d(getClass().toString(), "You want to count how many words are in '" + text_that_user_inputs + "'");
        WordCounter text = new WordCounter();
        int user_text = text.countWords(text_that_user_inputs);
        answerTextField.setText(String.valueOf(user_text));
    }
}
