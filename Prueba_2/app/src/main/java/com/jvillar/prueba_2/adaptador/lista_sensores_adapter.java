package com.jvillar.prueba_2.adaptador;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jvillar.prueba_2.Entidades.Sensores;
import com.jvillar.prueba_2.R;

import java.util.ArrayList;

public class lista_sensores_adapter extends RecyclerView.Adapter<lista_sensores_adapter.SensoresViewHolder>{


    ArrayList<Sensores> listaSensores;

    public lista_sensores_adapter(ArrayList<Sensores> listaSensores){
        this.listaSensores = listaSensores;

    }

    @NonNull
    @Override
    public SensoresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_sensores, null, false);

        return new SensoresViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SensoresViewHolder holder, int position) {
        holder.viewNombre.setText(listaSensores.get(position).getNombre());
        holder.viewValor.setText(listaSensores.get(position).getValor());
        holder.viewTipo.setText(listaSensores.get(position).getTipo());
    }

    @Override
    public int getItemCount() {
        return listaSensores.size();
    }

    public class SensoresViewHolder extends RecyclerView.ViewHolder {

        TextView viewNombre, viewTipo, viewValor;

        public SensoresViewHolder(@NonNull View itemView) {
            super(itemView);

            viewNombre = itemView.findViewById(R.id.View_Nombre);
            viewTipo = itemView.findViewById(R.id.ViewTipo);
            viewValor = itemView.findViewById(R.id.ViewValor);
        }
    }
}
