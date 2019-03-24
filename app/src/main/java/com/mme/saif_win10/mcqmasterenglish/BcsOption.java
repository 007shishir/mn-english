package com.mme.saif_win10.mcqmasterenglish;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mme.saif_win10.mcqmasterenglish.Idioms_Phrase.Bcs_IP_optionMcq;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.BcsPOSoptionMcq;


/**
 * A simple {@link Fragment} subclass.
 */
public class BcsOption extends Fragment {
    View view;
    Button mBcs_Pos;
    Button getmBcs_IP;


    public BcsOption() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_bcs_option, container, false);
        mBcs_Pos =  view.findViewById(R.id.mBcs_Pos);
        getmBcs_IP = view.findViewById(R.id.mBcs_IP);

        mBcs_Pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new BcsPOSoptionMcq());
                fr.addToBackStack(null).commit();
//                Intent intent = new Intent(getActivity(), BcsPOSoptionRecV.class);
//                startActivity(intent);
            }
        });
        getmBcs_IP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new Bcs_IP_optionMcq());
                fr.addToBackStack(null).commit();
//                Intent intent = new Intent(getActivity(), Bcs_IP_optionRecV.class);
//                startActivity(intent);
            }
        });

        return view;
    }

}
