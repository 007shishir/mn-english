package com.mme.saif_win10.mcqmasterenglish.PartsOFspeech;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosAdverb;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosArtGenNumCorr;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosClause1;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosClauses2;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosConInter;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosDeterminer;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosGender;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosIdmPhrase;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosIdmPhrase2;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosNoun;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosNumber;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosPrepCorr;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosPrepos;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosPrepos2;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosPronoun;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosSubVerbAgreement;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosVerb;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosVerb2;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosVerb3;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.PosVerbCorr;
import com.mme.saif_win10.mcqmasterenglish.PartsOFspeech.resourceFragment.Pos_Corr_Tense;
import com.mme.saif_win10.mcqmasterenglish.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BcsOptionResource extends Fragment implements View.OnClickListener {
    CardView mCard_Noun, mCard_Determiner, mCard_Gender, mCard_Number,
            mCard_Pronoun, mCard_verb, mCard_verb2, mCard_verb3, mCard_Adjective,
            mCard_Adverb, mCard_prepos, mCard_prepos2, mCard_Con_Int, mCard_Idm_phrase,
            mCard_Idm_phrase2, mCard_clauses1, mCard_clauses2, mCard_Corr_Tense,
            mCard_verbCorr, mCard_perpCorr, mCard_artGenNumCorr, mCard_subVerbAgreement;
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

        mCard_Pronoun = v.findViewById(R.id.mCard_Pronoun);
        mCard_Noun = v.findViewById(R.id.mCard_Noun);
        mCard_Determiner = v.findViewById(R.id.mCard_Determiner);
        mCard_Gender = v.findViewById(R.id.mCard_gender);
        mCard_Number = v.findViewById(R.id.mCard_Number);
        mCard_verb = v.findViewById(R.id.mCard_verb);
        mCard_verb2 = v.findViewById(R.id.mCard_verb2);
        mCard_verb3 = v.findViewById(R.id.mCard_verb3);
        mCard_Adjective = v.findViewById(R.id.mCard_adjective);
        mCard_Adverb = v.findViewById(R.id.mCard_adverb);
        mCard_prepos = v.findViewById(R.id.mCard_prepos);
        mCard_prepos2 = v.findViewById(R.id.mCard_prepos2);
        mCard_Con_Int = v.findViewById(R.id.mCard_con_inter);
        mCard_Idm_phrase = v.findViewById(R.id.mCard_phrase);
        mCard_Idm_phrase2 = v.findViewById(R.id.mCard_phrase2);
        mCard_clauses1 = v.findViewById(R.id.mCard_Clauses);
        mCard_clauses2 = v.findViewById(R.id.mCard_Clauses2);
        mCard_Corr_Tense = v.findViewById(R.id.mCard_Tense);

        mCard_verbCorr = v.findViewById(R.id.mCard_verbCorr);
        mCard_perpCorr = v.findViewById(R.id.mCard_perpCorr);
        mCard_artGenNumCorr = v.findViewById(R.id.mCard_artGenNumCorr);
        mCard_subVerbAgreement = v.findViewById(R.id.mCard_subVerbAgreement);

        mCard_Pronoun.setOnClickListener(this);
        mCard_Noun.setOnClickListener(this);
        mCard_Determiner.setOnClickListener(this);
        mCard_Gender.setOnClickListener(this);
        mCard_Number.setOnClickListener(this);
        mCard_verb.setOnClickListener(this);
        mCard_verb2.setOnClickListener(this);
        mCard_verb3.setOnClickListener(this);
        mCard_Adverb.setOnClickListener(this);
        mCard_Adjective.setOnClickListener(this);
        mCard_prepos.setOnClickListener(this);
        mCard_prepos2.setOnClickListener(this);
        mCard_Con_Int.setOnClickListener(this);
        mCard_Idm_phrase.setOnClickListener(this);
        mCard_Idm_phrase2.setOnClickListener(this);
        mCard_clauses1.setOnClickListener(this);
        mCard_clauses2.setOnClickListener(this);
        mCard_Corr_Tense.setOnClickListener(this);
        mCard_verbCorr.setOnClickListener(this);
        mCard_perpCorr.setOnClickListener(this);
        mCard_artGenNumCorr.setOnClickListener(this);
        mCard_subVerbAgreement.setOnClickListener(this);

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
            case R.id.mCard_Pronoun:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosPronoun());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_verb:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosVerb());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_verb2:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosVerb2());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_verb3:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosVerb3());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_adjective:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosVerb3());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_adverb:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosAdverb());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_prepos:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosPrepos());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_prepos2:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosPrepos2());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_con_inter:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosConInter());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_phrase:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosIdmPhrase());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_phrase2:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosIdmPhrase2());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_Clauses:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosClause1());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_Clauses2:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosClauses2());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_Tense:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new Pos_Corr_Tense());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_verbCorr:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosVerbCorr());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_perpCorr:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosPrepCorr());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_artGenNumCorr:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosArtGenNumCorr());
                fr.addToBackStack(null).commit();
                break;
            case R.id.mCard_subVerbAgreement:
                fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.mFL_bcsOR, new PosSubVerbAgreement());
                fr.addToBackStack(null).commit();
                break;
            default:
                Toast.makeText(getContext(), "There might be some error", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
