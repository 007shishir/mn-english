package com.mme.saif_win10.mcqmasterenglish;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.BcsPOSoptionRecV;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    Button mBtn_SignIn;
    Button mBtn_Bcs;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

                mBtn_SignIn = view.findViewById(R.id.mBtn_SignIn);
        mBtn_Bcs = view.findViewById(R.id.mBtn_Bcs);

        //onClick Event handler
        mBtn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SignIn.class);
                startActivity(intent);
            }
        });
        mBtn_Bcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentTransaction fr = getFragmentManager().beginTransaction();
//                fr.replace(R.id.fragment_container, new BcsOption());
//                fr.addToBackStack(null).commit();
                Intent intent = new Intent(getActivity(), BcsPOSoptionRecV.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
