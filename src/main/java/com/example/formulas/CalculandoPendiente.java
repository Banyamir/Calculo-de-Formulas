package com.example.formulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculandoPendiente extends AppCompatActivity {

    //Declaramos Variables
    private EditText valorX1, valorX2, valorY1, valorY2;
    private TextView res;
    Button regresarVentana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculando_pendiente);

        //Hacemos referencia de los objetos Visuales
        valorX1=(EditText)findViewById(R.id.valorX1);
        valorX2=(EditText)findViewById(R.id.valorX2);
        valorY1=(EditText)findViewById(R.id.valorY1);
        valorY2=(EditText)findViewById(R.id.valorY2);
        res=(TextView)findViewById(R.id.res);

        regresarVentana=(Button)findViewById(R.id.regresarVentana);
        regresarVentana.setOnClickListener(new View.OnClickListener() {
            @Override

            //Método del boton que hará el salto de pagina utilizando el metodo Intent desde CalculandoPendiente
            //  hasta el Main Activity
            public void onClick(View v) {
                Intent i = new Intent(CalculandoPendiente.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
           //Metodo que ejecuta nuestro boton que hara la funcion de los calculos
    public void pendiente(View view){

        //como recibe los datos de tipo String los pasaremos a Tipo entero
        String uno = valorX1.getText().toString();
        String dos = valorY1.getText().toString();
        String tres = valorX2.getText().toString();
        String cuatro = valorY2.getText().toString();

        Double  x1=Double.parseDouble(uno);
        Double  y1=Double.parseDouble(dos);
        Double  x2=Double.parseDouble(tres);
        Double y2=Double.parseDouble(cuatro);

        //Realizamos el calculo de la pendiente con los valores agregados

        Double resul = ((y2-y1)/(x2-x1));

        //Pasamos el resultado de nuestra variable
        String t=String.valueOf(resul);

        //Hahora mandamos el resultado a nuestra salida TexView res para mostrarlo
        res.setText(t);

    }

}