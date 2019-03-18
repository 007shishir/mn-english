package com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.mme.saif_win10.mcqmasterenglish.R;
import com.mme.saif_win10.mcqmasterenglish.mcqROOMdatabase.McqVersion1;

/**
 * A simple {@link Fragment} subclass.
 */
public class PosNoun extends Fragment {
    View view;
    Handler handler = new Handler();
    ProgressBar progressBar;


    public PosNoun() {
        // Required empty public constructor
    }


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_pos_noun, container, false);
        String url = "file:///android_asset/noun_part_1.html";

        WebView v = view.findViewById(R.id.mPos_wVone);
        progressBar = view.findViewById(R.id.progressBar);
        progressBarVISIBLE();
        v.getSettings().setJavaScriptEnabled(true);
        v.getSettings().setBuiltInZoomControls(true);

        v.loadUrl(url);
//        v.setWebViewClient(new MyBrowser());
        progressBarGONE();
        return view;
    }
    private class MyBrowser extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView v, String url) {
            v.loadUrl(url);
            return true;
        }
    }

    public void progressBarVISIBLE(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.VISIBLE);
                    }
                });
            }
        }).start();
    }

    public void progressBarGONE(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                    }
                });
            }
        }).start();
    }

}
