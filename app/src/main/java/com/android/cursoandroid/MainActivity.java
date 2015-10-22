package com.android.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Estado;

    private String ciclo_vida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Estado= (TextView)findViewById(R.id.tv_estado);
        ciclo_vida="Estado: onCreate";
        Estado.setText(ciclo_vida);

        Log.d("CLASEANDROID", "ONCREATE");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CLASEANDROID", "ONRESUME");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CLASEANDROID","ONSTART");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CLASEANDROID", "ONPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CLASEANDROID", "ONSTOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CLASEANDROID", "ONDESTROY");
    }

    public void iniciarActivity(View view){
        Intent starter = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(starter);
    }

    public void finalizarActivity(View view){
        finish();

    }
}
