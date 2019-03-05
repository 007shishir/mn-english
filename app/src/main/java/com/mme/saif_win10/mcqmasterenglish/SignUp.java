package com.mme.saif_win10.mcqmasterenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    TextView mTxt_SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Handling OnClick Event
        mTxt_SignIn = findViewById(R.id.mTxt_SignIn);

        mTxt_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, SignIn.class);
                startActivity(intent);
            }
        });
    }

//    @Override
//    public void onBackPressed() {
//        Intent intent = new Intent(SignUp.this, SignIn.class);
//        startActivity(intent);
//        super.onBackPressed();
//    }
}
