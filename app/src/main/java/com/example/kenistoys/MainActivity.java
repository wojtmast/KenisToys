package com.example.kenistoys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.KenisBtn:
                intent = new Intent(MainActivity.this, KenisActivity.class);
                startActivity(intent);
                break;
            case R.id.toysBtn:
                intent = new Intent(MainActivity.this, ToysActivity.class);
                startActivity(intent);
                break;
        }
    }
}
