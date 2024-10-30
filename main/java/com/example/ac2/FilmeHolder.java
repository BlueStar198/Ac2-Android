package com.example.ac2;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class FilmeHolder extends RecyclerView.ViewHolder {
    public TextView txtTitulo, txtAno, txtDiretor;
    public ImageView imgPoster;
    public Button btnSinopse;

    public FilmeHolder(View itemView) {
        super(itemView);
        txtTitulo = itemView.findViewById(R.id.txtTitulo);
        txtAno = itemView.findViewById(R.id.txtAno);
        txtDiretor = itemView.findViewById(R.id.txtDiretor);
        imgPoster = itemView.findViewById(R.id.imgPoster);
        btnSinopse = itemView.findViewById(R.id.btnSinopse);
    }
}
