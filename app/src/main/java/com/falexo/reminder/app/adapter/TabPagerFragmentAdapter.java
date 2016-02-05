package com.falexo.reminder.app.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.falexo.reminder.app.fragments.ExamFragment;

/**
 * Created by newman on 05.02.2016.
 */
public class TabPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "Таб №1",
                "Напоминания",
                "Таб №2"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExamFragment.getInstance();
//                break;
            case 1:
                return ExamFragment.getInstance();
            case 2:
                return ExamFragment.getInstance();
//                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
