package com.mme.saif_win10.mcqmasterenglish;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class MCQMasterEnglish extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
