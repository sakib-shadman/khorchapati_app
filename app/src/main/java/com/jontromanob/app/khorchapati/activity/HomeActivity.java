package com.jontromanob.app.khorchapati.activity;

import android.os.Bundle;

import com.jontromanob.app.khorchapati.R;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_home);
        ButterKnife.bind (this);
    }
    @OnClick(R.id.btnMonthlyHisab)
    public void onClickMonthlyHisab(){

    }
}
