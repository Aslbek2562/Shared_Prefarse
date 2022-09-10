package com.example.sharedprefarse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button,button1;
EditText editText;
TextView textView;
String malumot=null;
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button1);
        button1=findViewById(R.id.button2);
        editText=findViewById(R.id.edittext1);
        textView=findViewById(R.id.textview1);



        button.setOnClickListener(v -> {
            yuklash();
        });
        button1.setOnClickListener(v -> {
          saqlash("12345678");
        });


    }
    public void yuklash(){
        sharedPreferences=getPreferences(MODE_PRIVATE);
        malumot=sharedPreferences.getString("7",null);
                textView.setText(malumot);
    }
    public void saqlash(String parol){
        sharedPreferences=getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("7",parol);
        editor.commit();
    }
}