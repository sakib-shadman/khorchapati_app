package com.jontromanob.app.khorchapati.activity;


import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.jontromanob.app.khorchapati.R;
import com.jontromanob.app.khorchapati.viewmodel.RegisterViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {


    @BindView(R.id.txtUserName)
    TextInputEditText txtUserName;
    @BindView(R.id.txtUserMobile)
    TextInputEditText txtUserMobile;
    @BindView(R.id.txtUserPassword)
    TextInputEditText txtUserPassword;


    private RegisterViewModel mViewModel;
    private String userName,userMobile,userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        init();

    }

    private void init(){

        mViewModel = ViewModelProviders.of(this).get(RegisterViewModel.class);
    }
    @OnClick(R.id.btnSubmit)
    public void onClickSubmitBtn(){

        if(inputValidated()){
            getInput();
        }
    }

    private void getInput(){
        userName = txtUserName.getText().toString().trim();
        userMobile = txtUserMobile.getText().toString().trim();
        userPassword = txtUserPassword.getText().toString().trim();
    }

    private boolean inputValidated(){

        if(txtUserName.getText().toString().isEmpty()){
            Toast.makeText(this, "Please insert username", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(txtUserMobile.getText().toString().isEmpty()){
            Toast.makeText(this, "Please insert mobile no.", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(txtUserPassword.getText().toString().isEmpty()){
            Toast.makeText(this, "Please insert password", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

}
