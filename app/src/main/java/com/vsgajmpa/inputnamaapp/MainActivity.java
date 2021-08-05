package com.vsgajmpa.inputnamaapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = findViewById(R.id.input_name);
        EditText resultName = findViewById(R.id.result_name);
        Button buttonShowName = findViewById(R.id.button_show);

        inputName.addTextChangedListener(new TextWatcherImpl(editable -> {
            buttonShowName.setEnabled(!editable.toString().isEmpty()
                    || editable.toString().length() > 0);
        }));

        buttonShowName.setOnClickListener(v -> {
            String name = inputName.getText().toString().trim();

            if (!name.isEmpty()) {
                resultName.setText(name);
            }
        });

    }
}