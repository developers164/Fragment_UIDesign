package com.example.agrawalharsh.fragment_uidesign_1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jheel on 7/23/2016.
 */
public class Fragment_A extends Fragment implements AdapterView.OnItemClickListener{
 ListView list;
    Communicator communicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicator= (Communicator) getActivity();
        list= (ListView) getActivity().findViewById(R.id.listView);

        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.menu,android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);

        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.response(position);


    }
}
