package com.example.diarioderede;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView tvNetworkStatus;
    private Button btnNovaNota;
    private ListView lvNotas;
    private ArrayList<String> listaNotas;
    private ArrayAdapter<String> adapter;

    private final ActivityResultLauncher<Intent> noteLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                    String novaNota = result.getData().getStringExtra("NOVA_NOTA");
                    if (novaNota != null) {
                        listaNotas.add(0, novaNota);
                        adapter.notifyDataSetChanged();
                    }
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNetworkStatus = findViewById(R.id.tvNetworkStatus);
        btnNovaNota = findViewById(R.id.btnNovaNota);
        lvNotas = findViewById(R.id.lvNotas);

        listaNotas = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaNotas);
        lvNotas.setAdapter(adapter);

        verificarRede();

        btnNovaNota.setOnClickListener(v -> {
            String tipoRede = NetworkHelper.getConnectionType(MainActivity.this);
            Intent intent = new Intent(MainActivity.this, NoteActivity.class);
            intent.putExtra("TIPO_REDE", tipoRede);
            noteLauncher.launch(intent);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        verificarRede();
    }

    private void verificarRede() {
        String conexao = NetworkHelper.getConnectionType(this);
        tvNetworkStatus.setText("Conexão Atual: " + conexao);
    }
}