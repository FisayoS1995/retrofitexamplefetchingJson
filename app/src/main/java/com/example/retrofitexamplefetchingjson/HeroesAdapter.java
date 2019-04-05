package com.example.retrofitexamplefetchingjson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesAdapter.HeroesViewHolder> {

    private Context mCtx;
    private List<Hero> heroList;

    public HeroesAdapter(Context mCtx, List<Hero> heroList) {
        this.mCtx = mCtx;
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public HeroesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCtx);
        View view = layoutInflater.inflate(R.layout.list_layout, null);
        HeroesViewHolder holder = new HeroesViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HeroesViewHolder heroesViewHolder, int i) {
        Hero hero = heroList.get(i);

        heroesViewHolder.tvName.setText(Hero.getName());
        heroesViewHolder.tvRealName.setText(Hero.getRealname());
        heroesViewHolder.tvTeam.setText(Hero.getTeam());
        heroesViewHolder.tvFirstAppearance.setText(Hero.getFirstappareance());
        heroesViewHolder.tvCreatedBy.setText(Hero.getCreatedby());
        heroesViewHolder.tvCreatedBy.setText(Hero.getCreatedby());
        heroesViewHolder.tvPublisher.setText(Hero.getPublisher());
        heroesViewHolder.tvBio.setText(Hero.getBio());
        heroesViewHolder.tvImageUrl.setText(Hero.getImageurl());


    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    class HeroesViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName, tvRealName, tvTeam, tvFirstAppearance, tvCreatedBy, tvPublisher, tvBio,tvImageUrl;

        public HeroesViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvRealName = itemView.findViewById(R.id.tvRealName);
            tvTeam = itemView.findViewById(R.id.tvTeam);
            tvFirstAppearance = itemView.findViewById(R.id.tvFirstAppearance);
            tvCreatedBy = itemView.findViewById(R.id.tvCreatedBy);
            tvPublisher = itemView.findViewById(R.id.tvPublisher);
            tvBio = itemView.findViewById(R.id.tvBio);
            tvImageUrl = itemView.findViewById(R.id.tvImageUrl);

        }
    }
}
