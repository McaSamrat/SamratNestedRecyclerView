package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ViewUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.nestedrecyclerview.adapter.NestedRecyclerViewChildRecyclerAdapter;
import com.example.nestedrecyclerview.model.MyTeamList;
import com.example.nestedrecyclerview.response.NestedRecyclerViewResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        onClickListener();
        loadTeamList();
    }

    private void loadTeamList() {
        progressBar.setVisibility(View.VISIBLE);
        String url = "https://api.myjson.com/";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        WebClient webClient = retrofit.create(WebClient.class);
        webClient.responseService().enqueue(new Callback<NestedRecyclerViewResponse>() {
            @Override
            public void onResponse(Call<NestedRecyclerViewResponse> call, Response<NestedRecyclerViewResponse> response) {
                    if (response.isSuccessful()){
                        if (response.body() != null){
                            if (response.body().getResult() != null){
                                if (response.body().getResult().equalsIgnoreCase("success")){
                                    addRecyclerView(response.body().getMyTeamList());
                                }
                            }
                        }
                    }
            }

            @Override
            public void onFailure(Call<NestedRecyclerViewResponse> call, Throwable t) {

            }
        });
    }

    private void addRecyclerView(List<MyTeamList> myTeamList) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        //NestedRecyclerViewChildRecyclerAdapter nestedRecyclerViewChildRecyclerAdapter = new NestedRecyclerViewChildRecyclerAdapter(context,myTeamList);
    }

    private void onClickListener() {

    }

    private void initializeViews() {
        recyclerView = findViewById(R.id.mainRecyclerView);
        progressBar = findViewById(R.id.progressBar);
    }
}