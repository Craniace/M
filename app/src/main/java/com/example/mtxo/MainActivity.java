package com.example.mtxo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button14;
    private Button button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button14=findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,doctorpatient.class);
                startActivity(intent);
            }
        });
        button13=findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchintent=getPackageManager().getLaunchIntentForPackage("com.android.vending");
                if(launchintent!=null){
                    startActivity(launchintent);
                }
                else{
                    Toast.makeText(MainActivity.this,"There is no pakage",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}