package com.example.android.android_me.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.fragment.app.Fragment;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    public BodyPartFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaneState){

        View rootView = inflater.inflate(R.layout.fragment_body_part, container,false);

        ImageView imageView = (ImageView)rootView.findViewById(R.id.body_part_imageView);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(6));

        return rootView;
    }
}
