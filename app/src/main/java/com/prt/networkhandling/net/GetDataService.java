package com.prt.networkhandling.net;

import com.prt.networkhandling.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("json/json.json")
    Call<List<User>> userList();
}
