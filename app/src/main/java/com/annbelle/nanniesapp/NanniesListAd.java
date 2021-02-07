package com.annbelle.nanniesapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class NanniesListAd extends RecyclerView.Adapter<NanniesListAd.NannyViewHolder> {

    List<Nanny> nannies = new ArrayList<>();

    @NonNull
    @NotNull
    @Override
    public NannyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull NannyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return nannies.size();
    }

    class NannyViewHolder extends RecyclerView.ViewHolder {

        ImageView nannyProfile;
        TextView nannyName;
        TextView nannyDesc;
        ImageButton callNanny;

        public NannyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            nannyProfile = itemView.findViewById(R.id.image_nanny);
            nannyName = itemView.findViewById(R.id.txt_nanny_name);
            nannyDesc = itemView.findViewById(R.id.txt_nanny_desc);
            callNanny = itemView.findViewById(R.id.btn_call_nanny);
        }
    }
}
