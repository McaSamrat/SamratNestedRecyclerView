package com.example.nestedrecyclerview;

import com.example.nestedrecyclerview.response.NestedRecyclerViewResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WebClient {

    @GET("bins/rdi9w")
    Call<NestedRecyclerViewResponse> responseService();
}
