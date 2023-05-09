package com.example.patronesdediseotigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.patronesdediseotigo.Decorator.Canales;
import com.example.patronesdediseotigo.Decorator.Dispositivos;
import com.example.patronesdediseotigo.Decorator.Plan;
import com.example.patronesdediseotigo.Decorator.PlanesHogar;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    private ListView factura;
    private Button btnCanales;
    private Button btnDispositivos;
    private TextView txtTotal;
    private ArrayList<String> datos;
    private ArrayAdapter<String> adapter;
    private Plan hogar;
    Button btnPagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        factura = findViewById(R.id.factura);
        btnCanales = findViewById(R.id.btnCanales);
        btnDispositivos = findViewById(R.id.btnDispositivos);
        txtTotal = findViewById(R.id.txtTotal);
        btnPagar = findViewById(R.id.btnPagar);
        Intent intent = getIntent();
        String plan = intent.getStringExtra("clave");
        hogar = new PlanesHogar(obtenerDescripcion(plan), obtenerPrecio(plan), obtenerCanales(plan));
        datos = new ArrayList<String>();
        datos.add(hogar.getDescripcion()+ "\nEl precio de este plan es: " + hogar.getPrecio());
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        factura.setAdapter(adapter);
        txtTotal.setText(hogar.getPrecio() + " Bs");
        btnDispositivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarDispositivos();
            }
        });
        btnCanales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarCanales();
            }
        });
        btnPagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "El pago se proceso correctamente", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    private void agregarCanales() {
        Plan canalesExtra = new Canales(hogar);
        datos.add("20 canales FULL HD PLUS\n Precio: 30.00" );
        hogar = canalesExtra;
        adapter.notifyDataSetChanged();
        txtTotal.setText(hogar.getPrecio() + " Bs");
    }

    private void agregarDispositivos() {
        Plan dispositivoExtra = new Dispositivos(hogar);
        datos.add("Dispositivo extra\n Precio 15.00");
        hogar = dispositivoExtra;
        adapter.notifyDataSetChanged();
        txtTotal.setText(hogar.getPrecio() + " Bs");
    }
    public String obtenerDescripcion(String plan){
        if (plan.equals("1")){
            return "56 canales SD, 40 MBPS de velocidad, Megas ilimitados y SMS ilimitados";
        } else if (plan.equals("2")) {
            return "102 canales SD, Tigo Sports HD app y canal, 80 MBPS de velocidad, Megas ilimitados, SMS ilimitados y 80 minutos en tu linea Tigo";
        } else if (plan.equals("3")) {
            return "115 canales SD, Tigo Sports HD app y canal y 78 canales (One Tv App), 120 MBPS de velocidad, Megas ilimitados, SMS ilimitados y 110 minutos en tu linea Tigo";
        }
        return null;
    }
    public double obtenerPrecio(String plan){
        if (plan.equals("1")){
            return 370.00;
        } else if (plan.equals("2")) {
            return 430.00;
        } else if (plan.equals("3")) {
            return 520.00;
        }
        return 0;
    }
    public int obtenerCanales(String plan){
        if (plan.equals("1")){
            return 56;
        } else if (plan.equals("2")) {
            return 102;
        } else if (plan.equals("3")) {
            return 115;
        }
        return 0;
    }
}