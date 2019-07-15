package com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.mme.saif_win10.mcqmasterenglish.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PosAdverb extends Fragment {

    View view;
    public PosAdverb() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_pos_noun, container, false);
        String url = "file:///android_asset/adverbs.html";

        WebView v = view.findViewById(R.id.mPos_wVone);
        v.getSettings().setBuiltInZoomControls(true);

        v.loadUrl(url);
        return view;
    }

}
