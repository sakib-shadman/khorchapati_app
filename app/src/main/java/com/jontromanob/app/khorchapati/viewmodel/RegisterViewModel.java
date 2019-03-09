package com.jontromanob.app.khorchapati.viewmodel;

import android.os.AsyncTask;

import com.jontromanob.app.khorchapati.db.AppDatabase;
import com.jontromanob.app.khorchapati.model.User;

import androidx.lifecycle.ViewModel;

public class RegisterViewModel extends ViewModel {

    private User user;
    private AppDatabase appDatabase;
    private DataInsertion dataInsertion;

    public void setUser(AppDatabase appDatabase,String name, String mobile, String pasword,DataInsertion dataInsertion) {
        user = new User();
        user.setUserName(name);
        user.setUserPhone(mobile);
        user.setUserPassword(pasword);
        this.appDatabase = appDatabase;
        this.dataInsertion = dataInsertion;

    }

    public User getUser() {
        return this.user;
    }

    public void addUser() {

        new insertUser().execute();
    }

    private class insertUser extends AsyncTask<Void, Void, Void> {


        User mUser = new User();

        @Override
        protected void onPreExecute() {

            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void result) {
            if(mUser != null)
                dataInsertion.onSuccess();
            super.onPostExecute(result);
        }

        @Override
        protected Void doInBackground(Void... params) {
            //appDatabase.userModelDao().addUser(user);
            mUser = appDatabase.userModelDao().getSingleUser(user.getUserName(),user.getUserPassword());
            return null;
        }

    }

    public interface DataInsertion{
        void onSuccess();
        void onFailure();
    }
}
