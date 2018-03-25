package com.example.musketeers.realm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by PRAVEEN on 24-03-2018.
 */
public class registerfrag extends android.support.v4.app.Fragment {
    public registerfrag() {
        // Required empty public constructor
    }
    GPSTracker gps;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.registerayout, container, false);
    }



}