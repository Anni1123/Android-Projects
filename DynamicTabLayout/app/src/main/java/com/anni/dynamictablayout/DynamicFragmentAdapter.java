package com.anni.shareimage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.anni.dynamictablayout.DynamicFragment;


public class DynamicFragmentAdapter extends FragmentStatePagerAdapter {
    public int mNumOfTabs;

    public DynamicFragmentAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    //get the current item with position number
    @Override
    public Fragment getItem(int position) {
        Bundle b = new Bundle();
        b.putInt("position", position);
        Fragment frag = DynamicFragment.newInstance();
        frag.setArguments(b);
        return frag;
    }

    //get total number of tabs
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
