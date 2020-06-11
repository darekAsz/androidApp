package com.example.silka;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LibraryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_library, container, false);
        String[] definitionItems = {" superkomnepascja", "hantle", "kettle" };

        ListView listView = (ListView)view.findViewById(R.id.library_definitionListView);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                definitionItems);

        listView.setAdapter(listViewAdapter);
        getActivity().setTitle("asdsad");
        https://www.youtube.com/watch?v=wSCIuIbS-nk

        return view;
    }
}
