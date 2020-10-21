package com.ramirez.zahid.a06rbmz;
//Ramirez Briones Mauricio Zahid
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] equipos = {"Toluca", "America", "Monterrey", "Santos", "Tigres", "Tijuana"
            , "Pumas", "Morelia", "Pachuca", "Puebla", "Necaxa", "Cruz Azul", "Leon", "Queretaro"
            , "Atlas", "Veracruz", "Guadalajara", "Lobos BUAP"};
    private String[] puntos = {"36", "29", "29", "29", "28", "25", "24", "24", "23", "23", "22","22"
            , "22", "18", "18", "18", "15", "9"};
    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        lv1=(ListView)findViewById(R.id.list1);
        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, equipos);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tv1.setText("Los puntos de " + lv1.getItemAtPosition(i) + " son " + puntos[i]);
            }
        });
    }
}