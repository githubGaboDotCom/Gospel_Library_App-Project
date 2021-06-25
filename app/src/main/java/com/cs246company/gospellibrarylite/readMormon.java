package com.cs246company.gospellibrarylite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class readMormon extends AppCompatActivity {
PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_mormon);
        pdfView=(PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("mormon.pdf").load();
    }
}
