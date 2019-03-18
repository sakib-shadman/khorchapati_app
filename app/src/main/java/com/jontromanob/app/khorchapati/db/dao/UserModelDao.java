package com.jontromanob.app.khorchapati.db.dao;

import android.icu.lang.UScript;

import com.jontromanob.app.khorchapati.model.User;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
@Dao
public interface UserModelDao {


    @Query("select * from User where user_name = :userName AND user_password = :userPass")
    LiveData<List<User>> getSingleUser(String userName, String userPass);


    @Query("select * from User")
    LiveData<List<User>> getAllUser();

    @Insert
    void addUser(User user);

    @Delete
    void deleteUser(User user);
}
