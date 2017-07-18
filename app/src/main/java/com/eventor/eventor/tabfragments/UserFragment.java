package com.eventor.eventor.tabfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eventor.eventor.R;

/**
 * Created by lenovo on 11-03-2017.
 */

public class UserFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView=inflater.inflate(R.layout.profile_fragment,container,false);
        return rootView;
    }
}
