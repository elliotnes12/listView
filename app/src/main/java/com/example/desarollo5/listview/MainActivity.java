package com.example.desarollo5.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Datos a mostrar
        List<String> data = new ArrayList<String>();
        data.add("One");
        data.add("Two");
        data.add("Three");
        data.add("Four");
        data.add("Five");
        data.add("Six");
        data.add("Seven");
        data.add("Eight");
        data.add("Nine");
        data.add("ten");
        data.add("Eleven");
        data.add("Twoteen");
        data.add("thirteen");
        data.add("fourteen");
        data.add("fifteen");
        data.add("sixteen");
        data.add("seventeen");


        MyAdapter myadapter= new MyAdapter(this,R.layout.list_prueba,data);
        //Adaptador
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,data);
        lista = (ListView) findViewById(R.id.listView);

        lista.setAdapter(myadapter);


    }
}
