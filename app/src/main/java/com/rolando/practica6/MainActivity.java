package com.rolando.practica6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button calcular;
    TextView txtResultado;
    EditText uno,dos,tres,cuatro,cinco,seis,siete,ocho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcular = (Button) findViewById(R.id.button);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        uno = (EditText) findViewById(R.id.editText);
        dos = (EditText) findViewById(R.id.editText2);
        tres = (EditText) findViewById(R.id.editText3);
        cuatro = (EditText) findViewById(R.id.editText4);
        cinco = (EditText) findViewById(R.id.editText5);
        seis = (EditText) findViewById(R.id.editText6);
        siete = (EditText) findViewById(R.id.editText7);
        ocho = (EditText) findViewById(R.id.editText8);
        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                double PA1 = Double.parseDouble(uno.getText().toString());
                double PA2 = Double.parseDouble(dos.getText().toString());
                double PA3 = Double.parseDouble(tres.getText().toString());
                double PA4 = Double.parseDouble(cuatro.getText().toString());
                double PB1 = Double.parseDouble(cinco.getText().toString());
                double PB2 = Double.parseDouble(seis.getText().toString());
                double PB3 = Double.parseDouble(siete.getText().toString());
                double PB4 = Double.parseDouble(ocho.getText().toString());
                double PPA= 0.20*PA1 + 0.20 * PA2 + 0.25 * PA3 + 0.35 * PA4;
                double PPB=0.20 * PB1 + 0.20 * PB2 + 0.25 * PB3 + 0.35 * PB4;
                double MIN = (10.5-.30*PPA-.35*PPB)/.35;
                if(MIN>0) {
                    txtResultado.setText("Necesitas obtener minimo " + MIN + " para aprobar");
                    txtResultado.setVisibility(View.VISIBLE);
                }else{
                    txtResultado.setText("Estas aprobado");
                    txtResultado.setVisibility(View.VISIBLE);
                }
        }
    }
}
