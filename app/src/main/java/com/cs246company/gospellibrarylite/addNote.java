package com.cs246company.gospellibrarylite;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;

public class addNote extends AppCompatActivity {
EditText txtAdd;
    Button btnWrite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        txtAdd=(EditText)findViewById(R.id.txtAdd);
btnWrite=(Button)findViewById(R.id.btnWrite);
        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveFile(txtAdd.getText().toString());
            }
        });

    }

    public void saveFile(String text){
try {
    FileOutputStream fos = openFileOutput("note.txt", Context.MODE_PRIVATE);
    fos.write(text.getBytes());
    fos.close();
    Toast.makeText(addNote.this,"Note Added",Toast.LENGTH_SHORT).show();
}catch (Exception e){
e.printStackTrace();
    Toast.makeText(addNote.this,"Error Parsing",Toast.LENGTH_SHORT).show();
}

    }
}
