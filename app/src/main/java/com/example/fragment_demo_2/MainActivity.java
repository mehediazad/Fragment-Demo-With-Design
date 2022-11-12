package com.example.fragment_demo_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView BottomNavigationViewId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationViewId = findViewById(R.id.BottomNavigationViewId);


        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayoutID,new HomeFragment()).commit();
        }
        BottomNavigationViewId.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                if (item.getItemId() == R.id.HomeId) {
                    fragment = new HomeFragment();
                }

                if (item.getItemId() == R.id.ChatId){
                    fragment = new ChatFragment();
                }

                if (item.getItemId() == R.id.BooktId){
                    fragment = new BookFragment();
                }
                if (item.getItemId() == R.id.infoId){
                    fragment = new InfoFragment();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayoutID,fragment).commit();

                return false;
            }
        });

    }

}