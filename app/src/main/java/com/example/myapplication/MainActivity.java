package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variables vista
    private TextView txtSaludo;
    private Button btnReset;
    private Button btnSaludar;
    private EditText ptextNombre;


    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarvistas();

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!ptextNombre.getText().toString().equals("")){
                    txtSaludo.setText("Hola "+ptextNombre.getText()+"!");
                }
                else{
                    Toast.makeText(MainActivity.this, "No has introducido ningún nombre", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSaludo.setText("");
                ptextNombre.setText("");
            }
        });
    }

    private void iniciarvistas() {
        txtSaludo=findViewById(R.id.txtSaludo);
        btnReset=findViewById(R.id.btnResetMain);
        btnSaludar=findViewById(R.id.btnSaludarMain);
        ptextNombre=findViewById(R.id.ptextNombreMain);

    }
}