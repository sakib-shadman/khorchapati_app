package com.jontromanob.app.khorchapati.retrofit;

import java.util.List;

import androidx.lifecycle.LiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Hi on 5/22/2018.
 */

public class CallMayAttendanceList {


   /* public static void getMyAttandenceList(String authorization, String firstDate, String lastDate, Integer employeeId,
                                           final MyAttendanceCallback callback) {


        AttendanceApiInterface apiInterface = ApiClient.getClient ().create (AttendanceApiInterface.class);
        Call<LiveData<List<MyAttendanceList>>> call = apiInterface.getMyAttendanceList (authorization, firstDate, lastDate, employeeId);
        call.enqueue (new Callback<LiveData<List<MyAttendanceList>>> () {
            @Override
            public void onResponse(Call<LiveData<List<MyAttendanceList>>> call, Response<LiveData<List<MyAttendanceList>>> response) {
                if (response.body () != null) {
                   callback.onSuccess (response.body ());
                } else {
                    callback.onFailure ();
                }
            }

            @Override
            public void onFailure(Call<LiveData<List<MyAttendanceList>>> call, Throwable t) {
                callback.onFailure ();
            }
        });


    }

    public interface MyAttendanceCallback {
        void onSuccess(LiveData<List<MyAttendanceList>> myAttendanceList);

        void onFailure();

        void onNoList();
    }*/
}
