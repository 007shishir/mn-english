package com.mme.saif_win10.mcqmasterenglish.PartsOFspeech;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.mme.saif_win10.mcqmasterenglish.BcsOption;
import com.mme.saif_win10.mcqmasterenglish.MemorizeOption;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosNoun;
import com.mme.saif_win10.mcqmasterenglish.R;
import com.mme.saif_win10.mcqmasterenglish.abstructClasses.Mcq_Database;

public class BcsPOSoptionRecV extends AppCompatActivity {

    private TextView mTextMessage;
    public static Mcq_Database mcq_database;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_mcq:
                    getSupportFragmentManager().beginTransaction().replace(R.id.mFL_bcsOR,
                            new BcsOption()).commit();
                    return true;
                case R.id.navigation_memorize:
                    getSupportFragmentManager().beginTransaction().replace(R.id.mFL_bcsOR,
                            new MemorizeOption()).commit();
                    return true;
                case R.id.navigation_resource:
//                     before adding any fragments to details_screen just checking if already fragment is presented then popping it and then will add the new fragment.
//                    if (getSupportFragmentManager().findFragmentById(R.id.mFL_bcsOR) != null) {
//                        Toast.makeText(getApplicationContext(), "framelayout is not null", Toast.LENGTH_SHORT).show();
//                        getSupportFragmentManager().beginTransaction().replace(R.id.mFL_bcsOR,
//                                new BcsOptionResource()).commit();
////                        getSupportFragmentManager().popBackStack();
//                    }
                    if (getSupportFragmentManager().findFragmentById(R.id.mFL_bcsOR) instanceof PosNoun){
                        Toast.makeText(getApplicationContext(), "filled with PosNoun", Toast.LENGTH_SHORT).show();
                    }else {
                        getSupportFragmentManager().beginTransaction().replace(R.id.mFL_bcsOR,
                                new BcsOptionResource()).commit();
                    }
//                    getSupportFragmentManager().beginTransaction().replace(R.id.mFL_bcsOR,
//                            new BcsOptionResource()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcs_option_recycler_v);

        //accessing mcq database directly, which is not good practice
        mcq_database = Room.databaseBuilder(getApplicationContext(), Mcq_Database.class, "McqDb").allowMainThreadQueries().build();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.mFL_bcsOR,
                    new BcsOption()).commit();
        }

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
