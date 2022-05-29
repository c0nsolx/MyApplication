package com.samsung.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Profile profile_1 = findViewById(R.id.profile_1);
        profile_1.setup(R.mipmap.hello, getString(R.string.hello));

        TextView hello = findViewById(R.id.hello);
        TextView bye = findViewById(R.id.bye);
        EditText name = findViewById(R.id.name);


        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetails("Hello", name.getText().toString());
            }
        });

        bye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetails("Bye", name.getText().toString());
            }
        });
    }

    private void showDetails(String greeting, String name) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("greeting", greeting);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}