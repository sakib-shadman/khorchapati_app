package com.jontromanob.app.khorchapati.retrofit;

import java.util.List;

import androidx.lifecycle.LiveData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by Hi on 1/25/2018.
 */

public interface AttendanceApiInterface {

    @Headers({"Content-Type: application/json"})
    @GET("api/AttendanceApi/AttendaneByDate")
    Call<List<MyAttendanceList>> getMyAttendanceList(
            @Header("Authorization") String authorization,
            @Query("fromDateString") String fromDateString,
            @Query("toDateString") String toDateString,
            @Query("employeeId") Integer employeeId
    );


}
