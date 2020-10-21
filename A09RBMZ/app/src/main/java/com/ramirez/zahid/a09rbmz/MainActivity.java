package com.ramirez.zahid.a09rbmz;
//Ramirez Briones Mauricio zahid
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
    }

    public void verificar(View v){
        String clave=et2.getText().toString();
        if(clave.length()==0){
            Toast notificacion=Toast.makeText(this, "La clave no puede quedar vacia", Toast.LENGTH_LONG);
            notificacion.show();
        }
        else{
            if(clave.equals("5")) {
                Toast notificacion = Toast.makeText(this, "Verificacion aprobada", Toast.LENGTH_LONG);
                notificacion.show();
            }
            else{
                Toast notificacion = Toast.makeText(this, "Verificacion fallida", Toast.LENGTH_LONG);
                notificacion.show();
            }

        }
    }
}