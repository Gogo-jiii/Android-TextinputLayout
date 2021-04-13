package com.example.textinputlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextInputLayout textInputLayoutError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonSubmit);
        textInputLayoutError = findViewById(R.id.textInputLayoutError);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textInputLayoutError.getEditText().getText().toString();
                if (text.isEmpty()) {
                    textInputLayoutError.setError("Field can't be empty");
                } else {
                    textInputLayoutError.setError(null);
                }
            }
        });
    }
}