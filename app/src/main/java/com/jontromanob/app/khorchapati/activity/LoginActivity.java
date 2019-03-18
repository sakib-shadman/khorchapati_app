package com.jontromanob.app.khorchapati.activity;


import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.jontromanob.app.khorchapati.R;
import com.jontromanob.app.khorchapati.db.AppDatabase;
import com.jontromanob.app.khorchapati.model.User;
import com.jontromanob.app.khorchapati.viewmodel.RegisterViewModel;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.txtUserName)
    TextInputEditText txtUserName;
    @BindView(R.id.txtUserPassword)
    TextInputEditText txtUserPassword;

    private RegisterViewModel mViewModel;
    private String userName, userMobile, userPassword;
    private AppDatabase appDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        init ();
    }

    private void init() {

        mViewModel = ViewModelProviders.of(this).get(RegisterViewModel.class);
        appDatabase = AppDatabase.getDatabase(getApplicationContext());

    }

    private void getInput() {
        userName = txtUserName.getText().toString().trim();
        userPassword = txtUserPassword.getText().toString().trim();
    }

    private boolean inputValidated() {

        if (txtUserName.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please insert username", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (txtUserPassword.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please insert password", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    @OnClick(R.id.btnSubmit)
    public void onClickSubmitBtn() {

        if (inputValidated()) {
            getInput();
            mViewModel.getSingleUser (appDatabase,userName,userPassword).observe (this, new Observer<List<User>> () {
                @Override
                public void onChanged(List<User> users) {
                     if(users.size () > 0){

                     } else {
                         Toast.makeText (LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show ();
                     }
                }
            });


        }
    }
}
