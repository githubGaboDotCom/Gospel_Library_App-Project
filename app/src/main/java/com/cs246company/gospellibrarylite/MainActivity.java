package com.cs246company.gospellibrarylite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton btnScripture,btnNote,btnInformation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnScripture = (ImageButton) findViewById(R.id.btnScripture);
        btnNote = (ImageButton) findViewById(R.id.btnNotes);
        btnInformation = (ImageButton) findViewById(R.id.btnAboutUs);

        btnScripture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenScripture = new Intent(MainActivity.this,ScriptureActivity.class);
                startActivity(screenScripture);
            }
        });

        btnNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenNote = new Intent(MainActivity.this,NotesActivity.class);
                startActivity(screenNote);
            }
        });

        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenInfo = new Intent(MainActivity.this, InformationActivity.class);
                startActivity(screenInfo);
            }
        });

    }
}
