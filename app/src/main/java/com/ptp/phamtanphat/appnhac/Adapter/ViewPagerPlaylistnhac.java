package com.ptp.phamtanphat.appnhac.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 24/4/2018.
 */

public class ViewPagerPlaylistnhac extends FragmentPagerAdapter {
    public final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    public ViewPagerPlaylistnhac(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
    public void AddFragment(Fragment fragment){
        fragmentArrayList.add(fragment);
    }
}
