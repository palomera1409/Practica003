package com.example.palomera.practica003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  EditText numero1;
  EditText numero2;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       numero1 =(EditText)findViewById( R.id.editText);
       numero2 = (EditText)findViewById(R.id.editText2);


  }
}
