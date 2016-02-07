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
public class TodoFragment extends AbstractTabFraments {
    private static final int LAYOUT = R.layout.fragment_exam;

    public static TodoFragment getInstance(Context context) {
        Bundle args = new Bundle();
        TodoFragment fragment = new TodoFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_todo));
        return fragment;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
//        return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }
}
