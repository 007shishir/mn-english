package com.mme.saif_win10.mcqmasterenglish;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mme.saif_win10.mcqmasterenglish.Bcs_English_Mcq.BcsPOSoptionMcq;
import com.mme.saif_win10.mcqmasterenglish.Bcs_English_Mcq.Bcs_Clause_Corrections_Mcq;
import com.mme.saif_win10.mcqmasterenglish.Bcs_English_Mcq.Bcs_IP_optionMcq;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.BcsPOSmemorize;


/**
 * A simple {@link Fragment} subclass.
 */
public class MemorizeOption extends Fragment {
    View view;
    TextView mTxt_mr_idioms;


    public MemorizeOption() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_memorize_option, container, false);
        mTxt_mr_idioms = view.findViewById(R.id.mTxt_mr_idioms);
        mTxt_mr_idioms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new BcsPOSmemorize());
                fr.addToBackStack(null).commit();
            }
        });

        return view;
    }

}
