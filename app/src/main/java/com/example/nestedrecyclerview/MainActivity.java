package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;
    private LinearLayoutManager layoutManager;

    //https://steemit.com/utopian-io/@ideba/implement-a-nested-recycler-view-android
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         List<Data> dataList = new ArrayList<>();

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView = findViewById(R.id.rv_main);
        progressBar = findViewById(R.id.pb_home);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
      //  recyclerView.setAdapter(adapter);


        /*Call<HomeBodyResponse> responseCall = RetrofitSingleton.getInstance().getApi().getMovieByCategory();

        responseCall.enqueue(new Callback<HomeBodyResponse>() {
            @Override
            public void onResponse(Call<HomeBodyResponse> call, Response<HomeBodyResponse> response) {
                progressBar.setVisibility(View.GONE);



            }

            @Override
            public void onFailure(Call<HomeBodyResponse> call, Throwable t) {

                progressBar.setVisibility(View.GONE);

            }
        });*/
    }
}