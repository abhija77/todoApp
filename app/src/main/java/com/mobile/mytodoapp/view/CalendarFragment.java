package com.mobile.mytodoapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobile.mytodoapp.R;

import androidx.fragment.app.Fragment;

public class CalendarFragment extends Fragment {
    public CalendarFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.calendar_fragment, container, false);
    }
}
