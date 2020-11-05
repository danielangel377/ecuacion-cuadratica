package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText datoa, datob, datoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datoa =(EditText) findViewById(R.id.datoa);
        datob =(EditText) findViewById(R.id.datob);
        datoc =(EditText) findViewById(R.id.datoc);


    }
    public void cuadratica(View view){

        String a = datoa.getText().toString();
        String b = datob.getText().toString();
        String c = datoc.getText().toString();
        if(a.isEmpty() || b.isEmpty()|| c.isEmpty()) {
            if(a.isEmpty()){
            datoa.setError("Ingrese datos");}
            if(b.isEmpty()){
            datob.setError("Ingrese datos");}
            if(c.isEmpty()) {
                datoc.setError("Ingrese datos");
            }
        }
        else {

        double  da= Integer.valueOf(a);
        double  db= Integer.valueOf(b);
        double  dc= Integer.valueOf(c);


        double determinante;
        determinante = Math.pow(db,2)- (4*da*dc);

        if(determinante>0) {
            double x1 = ((db * (-1)) + Math.sqrt(determinante)) / (2 * da);
            double x2 = ((db * (-1)) - Math.sqrt(determinante)) / (2 * da);
            Toast.makeText(this,"El valor de x1 es: "+ x1 + " y el valor de x2 es :" + x2, Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"el resultado determinante es negativo, no se puede continuar la operacion", Toast.LENGTH_LONG).show();
        }

    }}
}