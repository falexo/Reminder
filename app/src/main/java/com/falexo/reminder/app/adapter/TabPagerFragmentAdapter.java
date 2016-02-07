package com.falexo.reminder.app.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.falexo.reminder.app.fragments.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by newman on 05.02.2016.
 */
public class TabPagerFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFraments> tabs;
    private Context context;

    public TabPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabs(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabs(Context context) {
        tabs = new HashMap();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
