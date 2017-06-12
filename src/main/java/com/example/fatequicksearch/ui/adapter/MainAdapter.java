package com.example.fatequicksearch.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.fatequicksearch.R;
import com.example.fatequicksearch.global.FateApplication;

import java.util.ArrayList;

/**
 * Created by TJTJL on 2017/6/13.
 */

public class MainAdapter extends FragmentPagerAdapter {

    private String[] servantClass = FateApplication.context.getResources().getStringArray(R.array.Servantlass);
    private ArrayList<Fragment> data;

    public MainAdapter(FragmentManager fm,ArrayList<Fragment> data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    //让TabLayout和ViewPager联动的方法
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
