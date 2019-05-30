package com.mme.saif_win10.mcqmasterenglish.PartsOFspeech;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosDeterminer;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosGender;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosNoun;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosNumber;
import com.mme.saif_win10.mcqmasterenglish.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BcsOptionResource extends Fragment implements View.OnClickListener {
    CardView mPos_noun1, mCard_Noun, mCard_Determiner, mCard_Gender, mCard_Number;
    View v;
    FragmentTransaction fr;


    public BcsOptionResource() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_bcs_option_resource, container, false);
        mPos_noun1 = v.findViewById(R.id.mPos_noun1);
        mCard_Noun = v.findViewById(R.id.mCard_Noun);
        mCard_Determiner = v.findViewById(R.id.mCard_Determiner);
        mCard_Gender = v.findViewById(R.id.mCard_gender);
        mCard_Number = v.findViewById(R.id.mCard_Number);

        mPos_noun1.setOnClickListener(this);
        mCard_Noun.setOnClickListener(this);
        mCard_Determiner.setOnClickListener(this);
        mCard_Gender.setOnClickListener(this);
        mCard_Number.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.mCard_Noun:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosNoun());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_Determiner:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosDeterminer());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_gender:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosGender());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_Number:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosNumber());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mPos_noun1:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosNoun());
                fr.addToBackStack(null).commit();
                break;
            default:
                Toast.makeText(getContext(), "There might be some error", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
