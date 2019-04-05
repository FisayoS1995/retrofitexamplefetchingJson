package com.example.retrofitexamplefetchingjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    HeroesAdapter heroesAdapter;
    List<Hero>heroList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Retrofit retrofit = new Retrofit.Builder()// first build your retrofit here
                .baseUrl(HeroApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        HeroApi heroApi = retrofit.create(HeroApi.class); // then insert your api call

        heroList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Call<List<Hero>> call = heroApi.getHeroes();

        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                List<Hero> heroes = response.body();


                for (Hero h : heroes){
                    Log.d("name", h.getName());
                    Log.d("name", h.getRealname());
                    Log.d("name", h.getImageurl());
                    Log.d("name", h.getCreatedby());
                    Log.d("name", h.getBio());
                    Log.d("name", h.getFirstappareance());
                    Log.d("name", h.getTeam());
                }


            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });


    }
}
