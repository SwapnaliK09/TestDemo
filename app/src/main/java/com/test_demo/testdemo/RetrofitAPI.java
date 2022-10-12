package com.test_demo.testdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitAPI {
    @GET("v2/list")
    Call<String> getUser(@Query("page") int page,
                         @Query("limit") int limit);

}
