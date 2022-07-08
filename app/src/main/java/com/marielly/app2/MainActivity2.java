package com.marielly.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("teste3");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent it = getIntent();

        TextView nome2 = findViewById(R.id.nomeFinal);
        TextView media2 = findViewById(R.id.mediaFinal);
        TextView cond = findViewById(R.id.cond);

        if (it!=null) {
            Bundle params = it.getExtras();
            if (params!=null){
                String nome = params.getString("nome");
                Double media = params.getDouble("media");
                int freq = params.getInt("freq");

                nome2.setText(nome);
                media2.setText("Média: "+media);
                if(freq>=75) {
                    if(media>=7.0)
                        cond.setText("Aprovado.");
                    else if(media >= 4.0 || media < 7.0)
                        cond.setText("Final.");
                    else
                        cond.setText("Reprovado por nota.");
                }else
                    cond.setText("Reprovado por falta.");
            }
        }
    }


}