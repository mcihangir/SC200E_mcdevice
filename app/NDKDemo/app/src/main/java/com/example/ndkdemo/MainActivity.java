package com.example.ndkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ndkdemonativelib.NDKDemoNativeLib;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "[NDKDemo]:MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find the info text
        TextView  textInfo = findViewById(R.id.textViewInfo);
        TextView  textResult = findViewById(R.id.textViewResult);
        EditText inputText = findViewById(R.id.editTextElement);

        NDKDemoNativeLib myFiboLib = new NDKDemoNativeLib();
        textInfo.setText(myFiboLib.stringFromJNI());

        //find the button
        Button button = findViewById(R.id.buttonCalculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = inputText.getText().toString();
                int element = Integer.parseInt(value);
                long res = myFiboLib.fibonacciFromJNI(element);
                textResult.setText(String.valueOf(res));
                Log.d(TAG, "Result:"+res);
            }
        });
    }
}