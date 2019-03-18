package com.mme.saif_win10.mcqmasterenglish.PartsOFspeech;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosNoun;
import com.mme.saif_win10.mcqmasterenglish.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BcsOptionResource extends Fragment implements View.OnClickListener {
    CardView mPos_noun1;
    View v;


    public BcsOptionResource() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_bcs_option_resource, container, false);
        mPos_noun1 = v.findViewById(R.id.mPos_noun1);
        mPos_noun1.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mPos_noun1:
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosNoun());
                fr.addToBackStack(null).commit();
                break;
            default:
                Toast.makeText(getContext(), "There might be some error", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
