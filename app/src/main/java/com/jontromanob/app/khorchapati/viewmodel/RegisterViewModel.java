package com.jontromanob.app.khorchapati.viewmodel;

import android.os.AsyncTask;

import com.facebook.stetho.server.http.HttpStatus;
import com.jontromanob.app.khorchapati.db.AppDatabase;
import com.jontromanob.app.khorchapati.model.LogInResponse;
import com.jontromanob.app.khorchapati.model.LoginApiResponse;
import com.jontromanob.app.khorchapati.model.Status;
import com.jontromanob.app.khorchapati.model.User;
import com.jontromanob.app.khorchapati.retrofit.ApiClient;
import com.jontromanob.app.khorchapati.retrofit.AttendanceApiInterface;
import com.jontromanob.app.khorchapati.retrofit.LoginApiInterface;
import com.jontromanob.app.khorchapati.retrofit.MyAttendanceList;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterViewModel extends ViewModel {

    private User user;
    private AppDatabase appDatabase;
    private DataInsertion dataInsertion;
    private LiveData<List<User>> allUsers;
    private MutableLiveData<List<MyAttendanceList>> mMyAttendanceList = new MutableLiveData<> ();
    private MutableLiveData<LoginApiResponse> logInResponseMutableLiveData = new MutableLiveData<> ();

    public void setUser(AppDatabase appDatabase, String name, String mobile, String pasword, DataInsertion dataInsertion) {
        user = new User ();
        user.setUserName (name);
        user.setUserPhone (mobile);
        user.setUserPassword (pasword);
        this.appDatabase = appDatabase;
        this.dataInsertion = dataInsertion;

    }

    public User getUser() {
        return this.user;
    }


    public LiveData<List<User>> getAllUsers(AppDatabase appDatabase) {
        if (this.appDatabase == null) {
            this.appDatabase = appDatabase;
        }
        allUsers = appDatabase.userModelDao ().getAllUser ();
        return allUsers;
    }

    public LiveData<List<User>> getSingleUser(AppDatabase appDatabase, String userName, String password) {
        if (this.appDatabase == null) {
            this.appDatabase = appDatabase;
        }
        allUsers = appDatabase.userModelDao ().getSingleUser (userName, password);
        return allUsers;
    }

    public void addUser() {

        new insertUser ().execute ();
    }

    public LiveData<List<MyAttendanceList>> getDataFromApi() {

        String authorization = "bearerrr NFgrXh-mwEFI3PdE0itqB5oK7ANPk9czUGwbuJ8xvRM-Fl6mPBACzHHKmjYCBtN7Wk4tPX5J4ahW7eEqlKoCHsOXJQ4l8qVgZiuKVnWD-b9IX-UwAb1T3HV_wqij-ARjvvYcicu_8MpVL5yKnaA46C1q5wLOgt4UFF6p9jrMUqaR7F7DEQkhNeWXicPQxjst7ikHnBdX34WnnSm_UaDtQgN1YfAEfdceUulBYyyRZBtECUPTqfnyDRsknFSy-26-RkEWCkLK2NgHBrT2x0u2l2_qPboTfbthckID61HutvTI-0qOVaRdrlyOOKClsat2H77j1bGKQWdSN8mA4VmCaeE1-13ZdrZas_25V5ce1kQ5uACSU6lLDAeBsjWUyqHfb1RZnLocPmEiQuHDPb9Bi4Gm0SAl4UGKag7FxHyDZ0CVXFUKaVT4Dmb-iJQimdBVVujZxlSSn2X-ni4gr20YVXCgKTF4MHD52cHZ_R7r7vsT3Uj-FHA9RFJiGB8mzXKSjrlOE7-xzPc-0K4lDzKAC1MIJW5aY0sbImdn41s2ot99o6-2zTJu2f-OX3FOb1LQRlRrru9NV9lsoZtYvh9Ox87Cv58";

   /*     CallMayAttendanceList.getMyAttandenceList(authorization, "06-09-2018", "07-09-2018", 43,
                new CallMayAttendanceList.MyAttendanceCallback() {
                    @Override
                    public void onSuccess(LiveData<List<MyAttendanceList>> myAttendanceList) {

                        if (myAttendanceList != null) {
                           mMyAttendanceList = myAttendanceList;
                        }
                    }

                    @Override
                    public void onFailure() {

                    }

                    @Override
                    public void onNoList() {

                    }
                });
        return mMyAttendanceList;*/
        final MutableLiveData<MyAttendanceList> data = new MutableLiveData<> ();
        AttendanceApiInterface apiInterface = ApiClient.getClient ().create (AttendanceApiInterface.class);
        Call<List<MyAttendanceList>> call = apiInterface.getMyAttendanceList (authorization, "06-09-2018", "07-09-2018", 43);
        call.enqueue (new Callback<List<MyAttendanceList>> () {
            @Override
            public void onResponse(Call<List<MyAttendanceList>> call, Response<List<MyAttendanceList>> response) {
                if (response.body () != null) {
                    mMyAttendanceList.setValue (response.body ());
                } else {
                    mMyAttendanceList.setValue (null);
                }

            }

            @Override
            public void onFailure(Call<List<MyAttendanceList>> call, Throwable t) {
                mMyAttendanceList.setValue (null);
            }
        });

        return mMyAttendanceList;

    }

    public LiveData<LoginApiResponse> executeLogIn() {

        LoginApiResponse loginApiResponse = new LoginApiResponse ();
        LoginApiInterface apiInterface = ApiClient.getClient ().create (LoginApiInterface.class);
        Call<LogInResponse> call = apiInterface.postLoginInfo ("shadman", "12345", "password", 2);
        call.enqueue (new Callback<LogInResponse> () {
            @Override
            public void onResponse(Call<LogInResponse> call, Response<LogInResponse> response) {
                if (response.code () == HttpStatus.HTTP_INTERNAL_SERVER_ERROR) {

                    loginApiResponse.setLogInResponse (null);
                    loginApiResponse.setStatus (Status.ERROR);
                    logInResponseMutableLiveData.setValue (loginApiResponse);
                } else if (response.body () != null) {
                    loginApiResponse.setLogInResponse (response.body ());
                    loginApiResponse.setStatus (Status.SUCCESS);
                    logInResponseMutableLiveData.setValue (loginApiResponse);

                } else {
                    loginApiResponse.setLogInResponse (null);
                    loginApiResponse.setStatus (Status.ERROR);
                    logInResponseMutableLiveData.setValue (loginApiResponse);
                }
            }

            @Override
            public void onFailure(Call<LogInResponse> call, Throwable t) {

                loginApiResponse.setLogInResponse (null);
                loginApiResponse.setStatus (Status.ERROR);
                logInResponseMutableLiveData.setValue (loginApiResponse);
            }
        });
        return logInResponseMutableLiveData;
    }

    public interface DataInsertion {
        void onSuccess();

        void onFailure();
    }

    private class insertUser extends AsyncTask<Void, Void, Void> {


        User mUser = new User ();

        @Override
        protected void onPreExecute() {

            super.onPreExecute ();
        }

        @Override
        protected void onPostExecute(Void result) {
            /*if(mUser != null)
                dataInsertion.onSuccess();*/
            super.onPostExecute (result);
        }

        @Override
        protected Void doInBackground(Void... params) {
            appDatabase.userModelDao ().addUser (user);
            return null;
        }

    }


}

