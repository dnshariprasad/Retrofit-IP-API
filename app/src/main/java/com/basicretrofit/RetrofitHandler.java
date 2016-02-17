package com.basicretrofit;


import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hari on 17/02/16.
 */
public class RetrofitHandler {
    private static RetrofitHandler ourInstance = new RetrofitHandler();

    public static RetrofitHandler getInstance() {
        return ourInstance;
    }

    private Retrofit ipApiRetrofit = new Retrofit.Builder()
            .baseUrl("http://ip-api.com")
            .addConverterFactory(StringConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private IpApiService ipApiService = ipApiRetrofit.create(IpApiService.class);

    private RetrofitHandler() {
    }

    Call<String> getLocationInfo() {
        return ipApiService.getLocationInfor();
    }
}
