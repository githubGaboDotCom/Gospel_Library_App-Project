package com.cs246company.gospellibrarylite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class readOldTestament extends AppCompatActivity {
PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_old_testament);
        pdfView = (PDFView)findViewById(R.id.pdfOld);
        pdfView.fromAsset("old.pdf").load();
    }
}
