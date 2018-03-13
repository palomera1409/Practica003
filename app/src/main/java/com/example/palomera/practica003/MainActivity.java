package com.example.palomera.practica003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numero1;
    EditText numero2;
    TextView resultado;
    RadioButton  suma;
    RadioButton resta;
    Button accion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       numero1 =(EditText)findViewById( R.id.editText);
       numero2 = (EditText)findViewById(R.id.editText2);
       resultado =(TextView) findViewById(R.id.textView);
       suma=(RadioButton)findViewById(R.id.radioButton);
       resta=(RadioButton)findViewById(R.id.radioButton2);
       accion=(Button) findViewById(R.id.button1);

    }

     public void operacion (View v)
     {

         float res=0;
         float num1 = Float.parseFloat(numero1.getText().toString());
         float num2 = Float.parseFloat(numero2.getText().toString());
          if( suma.isChecked())
          {
              res=num1+num2;

              resultado.setText(Float.toString(res));
          }

          if (resta.isChecked())
         {
          res=num1-num2;
          resultado.setText(Float.toString(res));
         }


     }



}
