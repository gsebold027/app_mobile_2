package com.marielly.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void situacaoFinal(View view){
        EditText inputNome = findViewById(R.id.nomeFinal);
        EditText inputNota1 = findViewById(R.id.nota1);
        EditText inputNota2 = findViewById(R.id.nota2);
        EditText inputFreq = findViewById(R.id.freq);

        if(inputNome.length()==0||inputNota1.length()==0||
                inputNota2.length()==0||inputFreq.length()==0){
            Toast.makeText(this, "Forneça todas as informações!", Toast.LENGTH_SHORT).show();
            return;
        }

        String nome = inputNome.getText().toString();
        String strnota1 = (inputNota1.getText().toString());
        String strnota2 = (inputNota2.getText().toString());
        String strfreq = (inputFreq.getText().toString());


        Double nota1 = Double.parseDouble(strnota1);
        Double nota2 = Double.parseDouble(strnota2);
        int freq = Integer.parseInt(strfreq);



        Double mediaFinal = (nota1+nota2)/2;


        Intent it = new Intent(this, MainActivity2.class);
        Bundle params = new Bundle();
        params.putString("nome", nome);
        params.putDouble("media", mediaFinal);
        params.putInt("freq", freq);

        it.putExtras(params);
        startActivity(it);
    }

}




