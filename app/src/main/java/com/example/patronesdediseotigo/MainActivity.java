package com.example.patronesdediseotigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.patronesdediseotigo.Singleton.Singleton;

public class MainActivity extends AppCompatActivity {
    EditText txtUser;
    EditText txtPassword;
    Button btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);
        btnGuardar = findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton instancia = Singleton.getInstance(txtUser.getText().toString(), txtPassword.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("usuario", instancia.getUsuario());
                startActivity(intent);
            }
        });
    }
}