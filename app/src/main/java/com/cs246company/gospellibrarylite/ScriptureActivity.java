package com.cs246company.gospellibrarylite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ScriptureActivity extends AppCompatActivity {
ImageButton mormon,old,newTestament,pearl,doctrine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture);

        //MORMON BOOK
        mormon = (ImageButton)findViewById(R.id.btnMormon);
        mormon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(ScriptureActivity.this,readMormon.class);
                startActivity(nextScreen);

            }
        });

        //OLD TESTAMENT
        old = (ImageButton)findViewById(R.id.btnOld);
        old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(ScriptureActivity.this,readOldTestament.class);
                startActivity(nextScreen);
            }
        });

        //NEW TESTAMENT
        newTestament = (ImageButton)findViewById(R.id.btnNTestament);
        newTestament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(ScriptureActivity.this,readNewTestament.class);
                startActivity(nextScreen);
            }
        });
        //DOCTRINE AND CONVENTS
        doctrine = (ImageButton)findViewById(R.id.btnDoctrine);
        doctrine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(ScriptureActivity.this,readDoctrine.class);
                startActivity(nextScreen);

            }
        });
        //PEARL OF GREAT PRICE
        pearl = (ImageButton)findViewById(R.id.btnPearl);
        pearl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(ScriptureActivity.this,readPearl.class);
                startActivity(nextScreen);
            }
        });
    }
}
