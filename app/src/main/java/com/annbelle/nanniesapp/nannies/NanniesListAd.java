package com.annbelle.nanniesapp.nannies;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.annbelle.nanniesapp.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NanniesListAd extends RecyclerView.Adapter<NanniesListAd.NannyViewHolder> {

    List<Nanny> nannies;
    Context context;

    NanniesListAd(Context context, List<Nanny> nannies) {
        this.context = context;
        this.nannies = nannies;
    }

    @NonNull
    @NotNull
    @Override
    public NannyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        //inflating the ui layout and creating Java View object out of it.
        return new NannyViewHolder(
            LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.nanny_list_item, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull NannyViewHolder holder, int position) {
        //showing data in the ui views.
        holder.setData(nannies.get(position));
    }

    @Override
    public int getItemCount() {
        return nannies.size();
    }

    class NannyViewHolder extends RecyclerView.ViewHolder {

        //declaring imageView reference for nanny profile image.
        ImageView nannyProfile;

        //declaring textView reference for nanny name.
        TextView nannyName;

        //declaring textView for nanny story
        TextView nannyStory;

        //declaring ImageButton for calling nanny.
        ImageButton callNanny;

        public NannyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            //referencing the views of each list and creating Java reference for each.
            nannyProfile = itemView.findViewById(R.id.image_nanny);
            nannyName = itemView.findViewById(R.id.txt_nanny_name);
            nannyStory = itemView.findViewById(R.id.txt_nanny_story);
            callNanny = itemView.findViewById(R.id.btn_call_nanny);
        }

        //connecting the data to the ui elements.
        void setData(Nanny nanny) {

            //setting name.
            nannyName.setText(nanny.getName());

            //setting story.
            nannyStory.setText(nanny.getStory());

            //setting Image.
            nannyProfile.setImageDrawable(ContextCompat.getDrawable(context, nanny.getImageRes()));

            //setting callNanny button click handler.
            callNanny.setOnClickListener(v -> {
                Toast.makeText(context, "Calling nanny", Toast.LENGTH_SHORT).show();
            });

            //Handling list item click handler.
            itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, ProfileActivity.class);
                context.startActivity(intent);
            });
        }
    }
}
