package com.jontromanob.app.khorchapati.db.dao;

import com.jontromanob.app.khorchapati.model.User;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
@Dao
public interface UserModelDao {


    @Query("select * from User where user_name = :userName AND user_password = :userPass")
    User getSingleUser(String userName,String userPass);

    @Insert
    void addUser(User user);

    @Delete
    void deleteUser(User user);
}
