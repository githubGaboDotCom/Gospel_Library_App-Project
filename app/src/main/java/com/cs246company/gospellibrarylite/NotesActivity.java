package com.cs246company.gospellibrarylite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;

public class NotesActivity extends AppCompatActivity {
Button btnAdd,btnLoad;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        btnAdd = (Button) findViewById(R.id.addNote);
        btnLoad =(Button)findViewById(R.id.btnLoad);
         textView = (TextView)findViewById(R.id.textView);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(NotesActivity.this, addNote.class);
                startActivity(nextScreen);
            }
        });

       btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(loadFile());
            }
        });
    }


    public String loadFile(){
        String text ="";
        try{
            FileInputStream fin = openFileInput("note.txt");
            int size = fin.available();
            byte[] buffer = new byte[size];
            fin.read(buffer);
            fin.close();
            text = new String(buffer);
            Toast.makeText(NotesActivity.this,"Notes Loadded",Toast.LENGTH_SHORT).show();
        }catch (Exception e){
e.printStackTrace();
            Toast.makeText(NotesActivity.this,"You must first add a Quick Note",Toast.LENGTH_SHORT).show();
        }
        return text;
    }

    }