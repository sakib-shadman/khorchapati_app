package com.jontromanob.app.khorchapati.viewmodel;

import com.jontromanob.app.khorchapati.model.User;

import androidx.lifecycle.ViewModel;

public class RegisterViewModel extends ViewModel {

    private User user;

    public void setUser(String name,String mobile,String pasword){
        user = new User();
        user.setUserName(name);
        user.setUserPhone(mobile);
        user.setUserPassword(pasword);
    }

    public User getUser(){ return this.user; }


}
