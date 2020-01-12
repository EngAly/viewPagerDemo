package com.fci.engaly.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter  extends FragmentStatePagerAdapter{

    int [] images={R.drawable.camel,R.drawable.cow,R.drawable.crow,R.drawable.dog,R.drawable.a1,R.drawable.a2,R.drawable.a3,
            R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,};


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        FragmentDemo fragmentDemo=new FragmentDemo();
        Bundle bundle=new Bundle();
        bundle.putInt("image",images[i]);
        fragmentDemo.setArguments(bundle);
        return fragmentDemo;
    }

    @Override
    public int getCount() {
        return images.length;
    }
}
