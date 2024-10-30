package com.example.ac2.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac2.Models.Filme;
import com.example.ac2.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder> {
    private List<Filme> listaFilmes;

    public FilmeAdapter(List<Filme> listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    @NonNull
    @Override
    public FilmeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_item_filme, parent, false);
        return new FilmeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeViewHolder holder, int position) {
        Filme filme = listaFilmes.get(position);
        holder.txtTitulo.setText(filme.getTitulo());
        holder.txtAno.setText(String.valueOf(filme.getAno()));
        holder.txtDiretor.setText(filme.getDiretor());
        holder.imgPoster.setImageResource(filme.getImagem());

        holder.btnSinopse.setOnClickListener(v -> {
            Toast.makeText(holder.itemView.getContext(), filme.getSinopse(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public static class FilmeViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitulo, txtAno, txtDiretor;
        ImageView imgPoster;
        Button btnSinopse;

        public FilmeViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtAno = itemView.findViewById(R.id.txtAno);
            txtDiretor = itemView.findViewById(R.id.txtDiretor);
            imgPoster = itemView.findViewById(R.id.imgPoster);
            btnSinopse = itemView.findViewById(R.id.btnSinopse);
        }
    }
}
