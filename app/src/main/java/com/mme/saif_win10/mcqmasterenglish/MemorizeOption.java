package com.mme.saif_win10.mcqmasterenglish;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mme.saif_win10.mcqmasterenglish.Bcs_English_Mcq.BcsPOSoptionMcq;
import com.mme.saif_win10.mcqmasterenglish.Bcs_English_Mcq.Bcs_Clause_Corrections_Mcq;
import com.mme.saif_win10.mcqmasterenglish.Bcs_English_Mcq.Bcs_IP_optionMcq;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.BcsPOSmemorize;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.Bcs_Cls_Corr_memorize;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosNoun;


/**
 * A simple {@link Fragment} subclass.
 */
public class MemorizeOption extends Fragment implements View.OnClickListener {
    View view;
    TextView mTxt_mr_idioms, mTxt_cls_corr;
    FragmentTransaction fr;


    public MemorizeOption() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_memorize_option, container, false);
        mTxt_mr_idioms = view.findViewById(R.id.mTxt_mr_idioms);
        mTxt_cls_corr = view.findViewById(R.id.mTxt_cls_corr);

        mTxt_cls_corr.setOnClickListener(this);


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


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.mTxt_cls_corr:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new Bcs_Cls_Corr_memorize());
                fr.addToBackStack(null).commit();
                break;
            default:
                Toast.makeText(getContext(), "There might be some error", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
