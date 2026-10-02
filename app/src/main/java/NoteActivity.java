package com.example.diarioderede;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NoteActivity extends AppCompatActivity {

    private TextView tvRedeRegistada;
    private EditText etConteudoNota;
    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        tvRedeRegistada = findViewById(R.id.tvRedeRegistada);
        etConteudoNota = findViewById(R.id.etConteudoNota);
        btnGuardar = findViewById(R.id.btnGuardar);

        String conexaoRecebida = getIntent().getStringExtra("TIPO_REDE");
        if (conexaoRecebida == null) conexaoRecebida = "Desconhecido";

        tvRedeRegistada.setText("Rede detetada: " + conexaoRecebida);

        String finalConexao = conexaoRecebida;
        btnGuardar.setOnClickListener(v -> {
            String texto = etConteudoNota.getText().toString().trim();
            if (texto.isEmpty()) {
                Toast.makeText(this, "Por favor, escreva uma nota.", Toast.LENGTH_SHORT).show();
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());
                String dataHoraAtual = sdf.format(new Date());

                String notaCompleta = "[" + dataHoraAtual + " | " + finalConexao + "]\n" + texto;

                Intent returnIntent = new Intent();
                returnIntent.putExtra("NOVA_NOTA", notaCompleta);
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}