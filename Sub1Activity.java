package org.androidtown.roulette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Sub1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
    }

    public void onClick_back(View v) {
        Toast.makeText(getApplicationContext(), "Back to Main Screen.." , Toast.LENGTH_LONG).show();
        finish();
    }
}
