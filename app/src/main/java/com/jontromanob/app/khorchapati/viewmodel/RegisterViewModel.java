package com.jontromanob.app.khorchapati.viewmodel;

import android.os.AsyncTask;

import com.jontromanob.app.khorchapati.db.AppDatabase;
import com.jontromanob.app.khorchapati.model.User;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class RegisterViewModel extends ViewModel {

    private User user;
    private AppDatabase appDatabase;
    private DataInsertion dataInsertion;
    private LiveData<List<User>> allUsers;

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
