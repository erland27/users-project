package com.erlandarmansyah.usersproject.service;

import com.erlandarmansyah.usersproject.model.user;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<user>> getusersList();
}