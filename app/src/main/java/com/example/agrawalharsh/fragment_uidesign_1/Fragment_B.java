package com.example.agrawalharsh.fragment_uidesign_1;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jheel on 7/23/2016.
 */
public class Fragment_B extends Fragment {
    TextView desc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_b,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        desc= (TextView) getActivity().findViewById(R.id.textView);

    }

    public void changeData(int i) {

        Resources res=getResources();
        String[] descriptions=res.getStringArray(R.array.description);
        desc.setText(descriptions[i]);
    }
}
