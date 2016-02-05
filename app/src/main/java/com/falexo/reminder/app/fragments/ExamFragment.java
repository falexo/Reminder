package com.falexo.reminder.app.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.falexo.reminder.app.R;

/**
 * Created by newman on 05.02.2016.
 */
public class ExamFragment extends Fragment {

    private static final int LAYOUT = R.layout.fragment_exam;
    private View view;

    public static ExamFragment getInstance() {
        Bundle args = new Bundle();
        ExamFragment fragment = new ExamFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
//        return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }
}
