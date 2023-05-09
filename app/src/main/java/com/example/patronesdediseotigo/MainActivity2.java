package com.example.patronesdediseotigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.patronesdediseotigo.Decorator.Canales;
import com.example.patronesdediseotigo.Decorator.Dispositivos;
import com.example.patronesdediseotigo.Decorator.Plan;
import com.example.patronesdediseotigo.Decorator.PlanesHogar;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    String usuario;
    TextView txtPlanes;
    Button btnPlanIncial;
    Button btnPlanIntermedio;
    Button btnPlanTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtPlanes = findViewById(R.id.txtPlanes);
        btnPlanIncial = findViewById(R.id.btnPlanIncial);
        btnPlanIntermedio = findViewById(R.id.btnPlanIntermedio);
        btnPlanTotal = findViewById(R.id.btnPlanTotal);
        Intent user = getIntent();
        usuario = user.getStringExtra("usuario");
        txtPlanes.setText("Bienvenido "+ usuario);
        btnPlanIncial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("clave", "1");
                startActivity(intent);
            }
        });
        btnPlanIntermedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("clave", "2");
                startActivity(intent);
            }
        });
        btnPlanTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("clave", "3");
                startActivity(intent);
            }
        });
    }
}