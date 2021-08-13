package com.example.newsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.Scanner;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PagerAdapter(@NonNull  FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case  0:
            return new HomeFragments();

            case  1:
                return new SportsFragments();

            case  2:
                return new HealthFragments();

            case  3:
                return new scienceFragments();

            case  4:
                return new EntertainmentFragments();

            case  5:
                return new TechnologyFragments();

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
