package org.androidtown.roulette;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  onClick01(View v) {
        Toast.makeText(getApplicationContext(), "Loading Map.." , Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.map.naver.com"));
        startActivity(intent);
    }

    public void onClick02(View v) {
        Intent intent_02 = new Intent(getApplicationContext(), Sub1Activity.class);
        startActivity(intent_02);
    }
}
