package com.example.formulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    //Declaramos Variables
    private EditText valorA, valorB, valorC;
    private TextView sal1, sal2;
    Button ventana2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hacemos referencia de los objetos Visuales

        valorA = (EditText) findViewById(R.id.valorA);
        valorB = (EditText) findViewById(R.id.valorB);
        valorC = (EditText) findViewById(R.id.valorC);

        sal1 = (TextView) findViewById(R.id.sal1);
        sal2 = (TextView) findViewById(R.id.sal2);

        ventana2=(Button)findViewById(R.id.ventana2);
        ventana2.setOnClickListener(new View.OnClickListener() {

            @Override

            //Método del boton que hará el salto de pagina utilizando el metodo Intent desde  Main Activity
            //  hasta el CalculandoPendiente

            public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, CalculandoPendiente.class);
                    startActivity(i);

            }
        });
    }
    //Metodo que ejecuta nuestro boton que hara la funcion de los calculos de la Formula general
    public void general(View view ) {
        //como recibe los datos de tipo String los pasaremos a Tipo entero
        String uno=valorA.getText().toString();
        String dos=valorB.getText().toString();
        String tres=valorC.getText().toString();

        double  a=Double.parseDouble(uno);
        double  b=Double.parseDouble(dos);
        double  c=Double.parseDouble(tres);

        //Realizamos el calculo de la formula general y lo guardamos en las nuevas variables
        // con los valores agregados
        double x1= (- b -(Math.sqrt(Math.pow(b,2)-(4*a*c))))/2*a;
        double x2= (- b +(Math.sqrt(Math.pow(b,2)-(4*a*c))))/2*a;

        //Pasamos el resultado de nuestra variable
      String r=String.valueOf(x1);
      String s=String.valueOf(x2);
        // mandamos el resultado a nuestra salida TexView sal1 y sal2 para mostrarlo
        sal1.setText(r);
        sal2.setText(s);
    }
       }
