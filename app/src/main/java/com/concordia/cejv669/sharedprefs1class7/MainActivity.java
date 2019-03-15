package com.concordia.cejv669.sharedprefs1class7;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences =getSharedPreferences("com.prefmgr.demo", Context.MODE_PRIVATE);
        if(sharedPreferences.contains("username"));
        {
            TextView tvgName=findViewById(R.id.textView);
            tvgName.setText(sharedPreferences.getString("username","N/A"));
        }
        Button b = findViewById(R.id.buttonSave);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name,product;
                RatingBar satisfiction;
                name=findViewById(R.id.editTextName);
                product=findViewById(R.id.editTextProduct);
                satisfiction=findViewById(R.id.ratingBarSatisfiction);
                SharedPreferences sharedPreferences =getSharedPreferences("com.prefmgr.demo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("username",name.getText().toString());
                editor.putString("productName", product.getText().toString());
                editor.putFloat("rating", satisfiction.getRating());
                editor.commit();

            }
        });
    }
}
