package com.example.calculadora_caterina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button boton;
    EditText editText;
    EditText editT;

    private TextWatcher object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    boton=(Button)findViewById(R.id.btn);
    boton.setOnClickListener(this);
    boton.setEnabled(false);

    editT=findViewById(R.id.eText);

    this.editText=(EditText)findViewById(R.id.eText);
    editText.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            if(charSequence.toString().equals("")){
                boton.setEnabled(false);
            }else{
                boton.setEnabled(true);
            }
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            if(editable.toString().equals("")){
                boton.setEnabled(false);
            }else{
                boton.setEnabled(true);
            }

        }
    });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn:{
                Intent boton= new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(boton);
                //boton.setText("");
                break;
            }
        }
    }
}