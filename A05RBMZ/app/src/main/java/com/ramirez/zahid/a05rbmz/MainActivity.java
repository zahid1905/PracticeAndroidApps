package com.ramirez.zahid.a05rbmz;
//Ramirez Briones Mauricio Zahid
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private EditText et1, et2;
    private TextView tv1;
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv1=(TextView)findViewById(R.id.tv1);
        spinner1=(Spinner)findViewById(R.id.spinner1);
        String []opciones={"Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    //Este metodo se ejecutara cuando se presione el bóton
    public void operar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        String select=spinner1.getSelectedItem().toString();
        if (select.equals("Sumar")){
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            tv1.setText(resu);
        }
        else
        if (select.equals("Restar")) {
            int resta = nro1 - nro2;
            String resu = String.valueOf(resta);
            tv1.setText(resu);
        }
        else
        if (select.equals("Multiplicar")) {
            int multiplicasion = nro1 * nro2;
            String resu = String.valueOf(multiplicasion);
            tv1.setText(resu);
        }
        else
        if (select.equals("Dividir")) {
            int division = nro1 / nro2;
            String resu = String.valueOf(division);
            tv1.setText(resu);
        }
    }
}