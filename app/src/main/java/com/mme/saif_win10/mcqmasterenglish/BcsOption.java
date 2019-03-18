package com.mme.saif_win10.mcqmasterenglish;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.BcsOptionRecyclerV;


/**
 * A simple {@link Fragment} subclass.
 */
public class BcsOption extends Fragment {
    View view;
    Button mBcs_Pos;


    public BcsOption() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_bcs_option, container, false);
        mBcs_Pos =  view.findViewById(R.id.mBcs_Pos);
        mBcs_Pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BcsOptionRecyclerV.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
