package com.ramirez.zahid.a07rbmz;
//Ramirez Briones Mauricio Zahid
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private ImageButton imageButton2, imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        imageButton2=(ImageButton)findViewById(R.id.imageButton2);
        imageButton3=(ImageButton)findViewById(R.id.imageButton3);
    }

    //Este metodo se ejecutara cuando se presione el ImageButton
    public void llamar(View view){
        tv1.setText("Llamando a Ramirez Briones Mauricio Zahid...");
        imageButton2.setVisibility(View.VISIBLE);
        imageButton3.setVisibility(View.INVISIBLE);
    }

    public void colgar(View view){
        imageButton2.setVisibility(View.INVISIBLE);
        imageButton3.setVisibility(View.VISIBLE);
        tv1.setText("Ramirez Briones Mauricio Zahid");
    }
}