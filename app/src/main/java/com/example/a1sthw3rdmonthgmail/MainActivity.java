package com.example.a1sthw3rdmonthgmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.edit_t1);
        editText2 = findViewById(R.id.edit_t2);
        editText3 = findViewById(R.id.edit_t3);
        findViewById(R.id.btn_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, editText1.getText().toString());
                intent.putExtra(Intent.EXTRA_SUBJECT, editText2.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, editText3.getText().toString());
                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });

    }
}