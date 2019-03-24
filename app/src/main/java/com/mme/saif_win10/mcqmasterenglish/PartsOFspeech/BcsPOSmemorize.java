package com.mme.saif_win10.mcqmasterenglish.PartsOFspeech;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mme.saif_win10.mcqmasterenglish.Parameter;
import com.mme.saif_win10.mcqmasterenglish.R;
import com.mme.saif_win10.mcqmasterenglish.memorizeROOMdatabase.MemorizeVersion1;


/**
 * A simple {@link Fragment} subclass.
 */
public class BcsPOSmemorize extends Fragment {
    View rootView;
    private RecyclerView mRecycler_BcsMemorize;
    private DatabaseReference mDatabase;

    public BcsPOSmemorize() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_bcs_option_memorize, container, false);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("bcs_pos_memorize");
        mDatabase.keepSynced(false);
        mRecycler_BcsMemorize = rootView.findViewById(R.id.mRecycler_BcsMemorize);
        mRecycler_BcsMemorize.setHasFixedSize(true);
        mRecycler_BcsMemorize.setLayoutManager(new LinearLayoutManager(getContext()));
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Parameter, BcsPOSoptionMcq.ParameterViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<Parameter, BcsPOSoptionMcq.ParameterViewHolder>
                        (Parameter.class, R.layout.recycler_view_for_mcq, BcsPOSoptionMcq.ParameterViewHolder.class, mDatabase) {
                    @Override
                    protected void populateViewHolder(BcsPOSoptionMcq.ParameterViewHolder viewHolder, Parameter model, int position) {
                        final String post_key = getRef(position).getKey();
                        viewHolder.setSource(model.getSource());
                        viewHolder.setTopic(model.getTopic());
                        viewHolder.setSum(model.getSum());
                        viewHolder.setTotal(model.getTotal());
                        viewHolder.mView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getActivity(), MemorizeVersion1.class);
                                intent.putExtra("key_name", post_key);
                                intent.putExtra("childName", "bcs_pos_memorize");
                                Toast.makeText(getContext(), "Please make sure you turn off the rotation of your device", Toast.LENGTH_LONG).show();
                                startActivity(intent);
                            }
                        });

                    }
                };
        mRecycler_BcsMemorize.setAdapter(firebaseRecyclerAdapter);
    }
}
