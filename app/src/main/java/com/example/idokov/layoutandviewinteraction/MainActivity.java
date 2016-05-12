package com.example.idokov.layoutandviewinteraction;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.idokov.layoutandviewinteraction.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String textFieldValue = "";
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityHandlers handlers = new MainActivityHandlers();
        binding.setHandler(handlers);
    }
}
