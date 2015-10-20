package com.android.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String CICLO_TAG = "Estado!";
    private String ciclo_vida;
    private TextView txv_estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv_estado = (TextView)findViewById(R.id.tv_estado);

        ciclo_vida = "Estado: onCreate";
        txv_estado.setText(ciclo_vida);
        android.util.Log.i(CICLO_TAG,ciclo_vida);
    }

    @Override
    protected void onStart(){
        super.onStart();
        ciclo_vida = "Estado: onStart";
        txv_estado.setText(ciclo_vida);
        android.util.Log.i(CICLO_TAG,ciclo_vida);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        ciclo_vida = "Estado: onRestart";
        txv_estado.setText(ciclo_vida);
        android.util.Log.i(CICLO_TAG,ciclo_vida);
    }

    @Override
    protected void onResume(){
        super.onResume();
        ciclo_vida = "Estado: onResume";
        txv_estado.setText(ciclo_vida);
        android.util.Log.i(CICLO_TAG,ciclo_vida);
    }

    @Override
    protected void onPause(){
        super.onPause();
        ciclo_vida = "Estado: onPause";
        txv_estado.setText(ciclo_vida);
        android.util.Log.i(CICLO_TAG,ciclo_vida);
    }

    @Override
    protected void onStop(){
        super.onStop();
        ciclo_vida = "Estado: onStop";
        txv_estado.setText(ciclo_vida);
        android.util.Log.i(CICLO_TAG,ciclo_vida);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        ciclo_vida = "Estado: onDestroy";
        txv_estado.setText(ciclo_vida);
        android.util.Log.i(CICLO_TAG,ciclo_vida);
    }

    public void iniciarActivity(View view){
        Intent starter = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(starter);
    }

    public void finalizarActivity(View view){
        finish();

    }
}
