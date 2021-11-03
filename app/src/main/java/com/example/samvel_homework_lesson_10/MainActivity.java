package com.example.samvel_homework_lesson_10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton callButton;
    private AppCompatButton sendButton;
    private AppCompatEditText editText;
    private AppCompatTextView link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_1);
        callButton = findViewById(R.id.callButton);
        sendButton = findViewById(R.id.sendButton);
        editText = findViewById(R.id.editText);
        link = findViewById(R.id.link);
        if(callButton != null){
            callButton.setOnClickListener(t->{
                callIntent();
            });
        }
        if(sendButton != null){
            sendButton.setOnClickListener(t->{
                sendIntent();
            });
        }
        if(link != null){
            sendButton.setOnClickListener(t->{
                linkIntent();
            });
        }
    }
    private void callIntent(){
        Intent callInt = new Intent(Intent.ACTION_DIAL);
        Intent chooser = Intent.createChooser(callInt, "Call Somebody");
        if(callInt.resolveActivity(getPackageManager()) != null){
            startActivity(chooser);
        }
    }
    private void sendIntent(){
        if(editText != null){
            String text = editText.getText().toString();
            Intent sendInt = new Intent(Intent.ACTION_SEND);
            sendInt.putExtra(Intent.EXTRA_TEXT, text);
            sendInt.setType("text/plain");

            try {
                startActivity(sendInt);
            }
            catch(ActivityNotFoundException e){
                e.printStackTrace();
            }
        }
    }
    private void linkIntent(){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://yandex.ru/"));
        Intent chooser = Intent.createChooser(browserIntent,"Choose a browser");
        if(browserIntent.resolveActivity(getPackageManager()) != null){
            startActivity(chooser);
        }
    }
}