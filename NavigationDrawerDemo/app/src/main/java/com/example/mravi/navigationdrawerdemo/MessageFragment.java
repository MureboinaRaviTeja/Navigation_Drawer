package com.example.mravi.navigationdrawerdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */


public class MessageFragment extends Fragment {

    public MessageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


//View rootView = inflater.inflate(R.layout.fragment_message,container,false);
        //      return rootView;


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message, container, false);
    }

}

