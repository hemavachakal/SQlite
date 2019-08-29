package com.example.sqlite;

import android.annotation.SuppressLint;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


EditText editTextRollNo,editTextName,editTextMark;

Button buttonAdd,buttonDelete,buttonModify,buttonView,buttonViewAll,buttonShowInfo;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextRollNo = findViewById(R.id.Roll_no);
        editTextName=findViewById(R.id.Name);
        editTextMark=findViewById(R.id.mark);
        buttonAdd=findViewById(R.id.buttonAdd);
        buttonDelete=findViewById(R.id.Delete);
        buttonModify=findViewById(R.id.modify);
        buttonShowInfo=findViewById(R.id.Show);
        buttonView=findViewById(R.id.view);
        buttonViewAll=findViewById(R.id.ViewAll);


        buttonAdd.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);
        buttonModify.setOnClickListener(this);
        buttonShowInfo.setOnClickListener(this);
        buttonView.setOnClickListener(this);
        buttonViewAll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonAdd:
                Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Delete:
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
                break;

            case R.id.modify:
                Toast.makeText(this, "modify", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Show:
                Toast.makeText(this, "show", Toast.LENGTH_SHORT).show();
                break;

            case R.id.view:
                Toast.makeText(this, "view", Toast.LENGTH_SHORT).show();
                break;
                
            case R.id.ViewAll:
                Toast.makeText(this, "ViewAll", Toast.LENGTH_SHORT).show();
                break;
            }
    }
}
