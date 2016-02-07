package com.falexo.reminder.app.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.falexo.reminder.app.R;

/**
 * Created by newman on 05.02.2016.
 */
public class IdeasFragment extends AbstractTabFraments {
    private static final int LAYOUT = R.layout.fragment_exam;


    public static IdeasFragment getInstance(Context context) {
        Bundle args = new Bundle();
        IdeasFragment fragment = new IdeasFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_ideas));
        return fragment;
    }

    public void setContext(Context context) {
        this.context = context;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
//        return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }
}
