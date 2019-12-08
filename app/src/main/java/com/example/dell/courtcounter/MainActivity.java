package com.example.dell.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scA=0;
    int scB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void b1a(View view)
    {
        addforA(3);
    }
    public void b2a(View view)
    {
        addforA(2);
    }
    public void b3a(View view)
    {
        addforA(1);
    }
    public void addforA(int n)
    {
        TextView txtscrA =(TextView)findViewById(R.id.scrA);
        scA+=n;
        txtscrA.setText(String.valueOf(scA));
    }
    public void b1b(View view)
    {
        addforB(3);
    }
    public void b2b(View view)
    {
        addforB(2);
    }
    public void b3b(View view)
    {
        addforB(1);
    }
    public void addforB(int n)
    {
        scB+=n;
        TextView txtscrB =(TextView)findViewById(R.id.scrB);
        txtscrB.setText(String.valueOf(scB));
    }
    public void reset(View view)
    {
        scA=0;
        scB=0;
        TextView txtscrA =(TextView)findViewById(R.id.scrA);
        TextView txtscrB =(TextView)findViewById(R.id.scrB);
        txtscrA.setText("0");
        txtscrB.setText("0");
    }
}
