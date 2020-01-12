package com.fci.engaly.viewpagerdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDemo extends Fragment {

    ImageView imageView;

    public FragmentDemo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_fragment_demo, container, false);
        imageView=view.findViewById(R.id.imageView);
        imageView.setImageResource(getArguments().getInt("image"));
        return view;

    }

}
