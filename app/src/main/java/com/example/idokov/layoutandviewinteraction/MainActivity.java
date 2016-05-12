package com.example.idokov.layoutandviewinteraction;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.example.idokov.layoutandviewinteraction.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String textFieldValue = "";
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityHandlers handlers = new MainActivityHandlers();
        binding.setHandler(handlers);

        final RadioGroup group1 = (RadioGroup) findViewById(R.id.orientation);
        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.horizontal:
                        group.setOrientation(LinearLayout.HORIZONTAL);
                        break;
                    case R.id.vertical:
                        group.setOrientation(LinearLayout.VERTICAL);
                        break;
                }
            }
        });
    }
}
