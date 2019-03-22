package com.jontromanob.app.khorchapati.retrofit;



import com.jontromanob.app.khorchapati.model.LogInResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Hi on 1/5/2018.
 */

public interface LoginApiInterface {

    @FormUrlEncoded
    @POST("token")
    Call<LogInResponse> postLoginInfo(

            @Field("username") String username,
            @Field("password") String password,
            @Field("grant_type") String grant_type,
            @Field("companyId") Integer companyId

    );
}
