package com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.mme.saif_win10.mcqmasterenglish.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PosPronoun extends Fragment {


    View view;

    public PosPronoun() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_pos_noun, container, false);
        String url = "file:///android_asset/pronoun.html";

        WebView v = view.findViewById(R.id.mPos_wVone);
        v.getSettings().setBuiltInZoomControls(true);

        v.loadUrl(url);
        return view;
    }

}
