package com.example.samvel_homework_lesson_10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SecondActivity extends AppCompatActivity {

    private RCAdapter rcAdapter = new RCAdapter();

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_2);
        initRecyclerView();
        setSpinnerAdapter();
        View view = LayoutInflater.from(this).inflate(R.layout.screen_2,null);
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.rcView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        rcAdapter.setItems(ListItem.getListItems());
        recyclerView.setAdapter(rcAdapter);
    }

    public void setSpinnerAdapter(){
        AppCompatSpinner spinner = findViewById(R.id.my_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                SecondActivity.this,
                R.array.cities,
                android.R.layout.simple_spinner_item
        );
        spinner.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }
}
