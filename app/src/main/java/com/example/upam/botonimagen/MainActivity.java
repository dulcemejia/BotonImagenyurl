package com.example.upam.botonimagen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre, edad,url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText) findViewById(R.id.editText);
        edad=(EditText) findViewById(R.id.editText2);
        url=(EditText) findViewById(R.id.editText3);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



    public void compartir_datos(View v){
        String nom=nombre.getText().toString(), ed=edad.getText().toString();
        String ur=url.getText().toString();
        Intent launch=new Intent(this, Main2Activity.class);
        launch.putExtra("nombre",nom);
        launch.putExtra("edad",ed);
        launch.putExtra("url",ur);
        startActivity(launch);
    }

}
