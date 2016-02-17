package com.basicretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Hari on 17/02/16.
 */
public interface IpApiService {
    @GET("/json")
    Call<String> getLocationInfor();
}
