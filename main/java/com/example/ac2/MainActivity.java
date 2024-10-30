package com.example.ac2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac2.Adaptador.FilmeAdapter; // Certifique-se que o caminho está correto
import com.example.ac2.Models.Filme; // Certifique-se que o caminho está correto

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView; // RecyclerView para exibir a lista de filmes
    private FilmeAdapter filmeAdapter; // Adaptador para gerenciar os dados do RecyclerView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Define o layout da atividade

        // Inicializa o RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<Filme> filmes = getFilmes(); // Obtém a lista de filmes

        // Configura o adaptador e o layout do RecyclerView
        filmeAdapter = new FilmeAdapter(filmes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Define o layout como linear
        recyclerView.setAdapter(filmeAdapter); // Anexa o adaptador ao RecyclerView
    }

    // Método para criar uma lista de filmes fictícios
    private ArrayList<Filme> getFilmes() {
        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Super Mario Bros. Movie", 2023,
                "Mario e Luigi, dois encanadores, se aventuram em um mundo subterrâneo para resgatar a Princesa Peach e enfrentar Bowser.",
                "Aaron Horvath, Michael Jelenic", R.mipmap.imagem1)); // Troque por R.drawable.imagem1 se necessário

        filmes.add(new Filme("Sonic the Hedgehog 2", 2022,
                "Sonic e Tails se juntam para impedir que Dr. Robotnik e Knuckles conquistem uma esmeralda poderosa.",
                "Jeff Fowler", R.mipmap.imagem2)); // Troque por R.drawable.imagem2 se necessário

        filmes.add(new Filme("Minecraft: The Movie", 2025,
                "Um grupo de jovens se junta para salvar o mundo do Minecraft de uma grande ameaça, enquanto aprendem sobre amizade e coragem.",
                "Jeb Stuart", R.mipmap.imagem3)); // Troque por R.drawable.imagem3 se necessário

        return filmes; // Retorna a lista de filmes
    }
}
