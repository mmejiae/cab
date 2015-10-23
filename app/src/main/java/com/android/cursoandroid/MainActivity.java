package com.android.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.toolbar)Toolbar toolbar;
    Button iniciar;
    Button finalizar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        toolbar.setTitle("Decoracion Navidad 2015");
        toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

        iniciar =(Button)findViewById(R.id.iniciar);
        finalizar =(Button)findViewById(R.id.finalizar);

        iniciar.setOnClickListener(this);
        finalizar.setOnClickListener(this);
/*
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              iniciarActivity(v);
            }
        });
        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalizarActivity(v);
            }
        });
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_msg:
                Toast.makeText(MainActivity.this, "Feliz Navidad y prospero año nuevo", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void iniciarActivity(View view){
        Intent starter = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(starter);
    }

    public void finalizarActivity(View view){
        finish();

    }

    @Override
    public void onClick(View v) {
        int id= v.getId();
        if(id==iniciar.getId()){
            iniciarActivity(v);
        }
        else if(id==finalizar.getId()){
            finalizarActivity(v);
        }
    }
}
