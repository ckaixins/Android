package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        Button BackButton = (Button) this.findViewById(R.id.BackButton);
        BackButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 跳转界面
                        Intent intent = new Intent(MenuActivity2.this, MenuActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}