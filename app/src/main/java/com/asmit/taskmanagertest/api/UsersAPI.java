package com.asmit.taskmanagertest.api;

import com.asmit.taskmanagertest.model.Users;
import com.asmit.taskmanagertest.serverresponse.ImageResponse;
import com.asmit.taskmanagertest.serverresponse.SignUpResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UsersAPI {

    @POST("users/signup")
    Call<SignUpResponse> registerUser(@Body Users users);


    @FormUrlEncoded
    @POST("users/login")
    Call<SignUpResponse>checkUser(@Field("username") String username, @Field("password") String password);

    @Multipart
    @POST("upload")
    Call<ImageResponse>uploadImage(@Part MultipartBody.Part img);
}
