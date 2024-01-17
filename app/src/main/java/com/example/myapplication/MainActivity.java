package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    EditText username,password;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.text1);
        password=(EditText)findViewById(R.id.text2);
        btnSubmit = (Button)findViewById(R.id.btn1);
        result = (TextView)findViewById(R.id.resultView);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().isEmpty() || password.getText().toString().isEmpty() )
                {

                    result.setText("gfd");
                }
                else {
                    result.setText("Name -  " + username.getText().toString() + " \n" + "Mark -  " + password.getText().toString());
                }


            }


        });

    }
}
