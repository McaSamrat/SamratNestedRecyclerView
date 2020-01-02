package com.example.nestedrecyclerview;

import retrofit2.Call;

public interface RetrofitApiClient {

    Call<HomeBodyResponse> getMovieByCategory();
}
