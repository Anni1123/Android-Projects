package com.anni.dynamictablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.anni.dynamictablayout.R;
import com.anni.shareimage.DynamicFragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class DynamicActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
        initViews();
    }
    private void initViews(){
        //initialise the layout
        viewPager = findViewById(R.id.viewpager);
        mTabLayout =  findViewById(R.id.tabs);
        //setOffscreenPageLimit means number of tabs to be shown in one page
        viewPager.setOffscreenPageLimit(5);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //setCurrentItem as the tab position
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        setDynamicFragmentToTabLayout();
    }
    //show all the tab using DynamicFragmnetAdapter

    private void setDynamicFragmentToTabLayout() {
        //here we have given 10 as the tab number
        //you can give any number ehre
        for (int i = 0; i < 10; i++) {
            //set the tab name as "Page: " + i
            mTabLayout.addTab(mTabLayout.newTab().setText("Page: " + i));
        }
        DynamicFragmentAdapter mDynamicFragmentAdapter = new DynamicFragmentAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        //set the adapter
        viewPager.setAdapter(mDynamicFragmentAdapter);
        //set the current item as 0 (when app opens for first time)
        viewPager.setCurrentItem(0);
    }
}
