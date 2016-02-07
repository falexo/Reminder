package com.falexo.reminder.app.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by newman on 07.02.2016.
 */
public class AbstractTabFraments extends Fragment{
    private String title;
    protected View view;
    protected Context context;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
