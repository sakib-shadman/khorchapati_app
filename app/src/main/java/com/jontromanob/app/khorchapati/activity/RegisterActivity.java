package com.jontromanob.app.khorchapati.activity;


import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.jontromanob.app.khorchapati.R;
import com.jontromanob.app.khorchapati.db.AppDatabase;
import com.jontromanob.app.khorchapati.model.User;
import com.jontromanob.app.khorchapati.retrofit.MyAttendanceList;
import com.jontromanob.app.khorchapati.viewmodel.RegisterViewModel;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity implements RegisterViewModel.DataInsertion {


    @BindView(R.id.txtUserName)
    TextInputEditText txtUserName;
    @BindView(R.id.txtUserMobile)
    TextInputEditText txtUserMobile;
    @BindView(R.id.txtUserPassword)
    TextInputEditText txtUserPassword;


    private RegisterViewModel mViewModel;
    private String userName, userMobile, userPassword;
    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        init();

    }

    private void init() {

        mViewModel = ViewModelProviders.of(this).get(RegisterViewModel.class);
        appDatabase = AppDatabase.getDatabase(getApplicationContext());
        mViewModel.getAllUsers (appDatabase).observe (this, new Observer<List<User>> () {
            @Override
            public void onChanged(List<User> users) {

            }
        });

        mViewModel.getDataFromApi ().observe (this, new Observer<List<MyAttendanceList>> () {
            @Override
            public void onChanged(List<MyAttendanceList> myAttendanceLists) {

                if(myAttendanceLists != null){

                }
            }
        });
    }

    @OnClick(R.id.btnSubmit)
    public void onClickSubmitBtn() {

        if (inputValidated()) {
            getInput();
            mViewModel.setUser(appDatabase, userName, userMobile, userPassword, this);
            //mViewModel.addUser();
            mViewModel.getSingleUser (appDatabase,userName,userPassword).observe (this, new Observer<List<User>> () {
                @Override
                public void onChanged(List<User> users) {

                }
            });


        }
    }

    private void getInput() {
        userName = txtUserName.getText().toString().trim();
        userMobile = txtUserMobile.getText().toString().trim();
        userPassword = txtUserPassword.getText().toString().trim();
    }

    private boolean inputValidated() {

        if (txtUserName.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please insert username", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (txtUserMobile.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please insert mobile no.", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (txtUserPassword.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please insert password", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure() {

    }
}
