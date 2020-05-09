package com.mobile.mytodoapp.view;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mobile.mytodoapp.MainActivity;
import com.mobile.mytodoapp.R;

import androidx.fragment.app.Fragment;

public class TaskListFragment extends Fragment {
    public TaskListFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.task_list_fragment, container, false);
        Log.d("d","View List task created");
        ListView mlistView = view.findViewById(R.id.list_todo);
        MainActivity mainActivity = ((MainActivity)getActivity());
        mainActivity.setmTaskListView(mlistView);
        mainActivity.updateUI();
        return view;

    }
}
