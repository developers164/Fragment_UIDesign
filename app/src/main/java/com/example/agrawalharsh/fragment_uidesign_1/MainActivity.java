package com.example.agrawalharsh.fragment_uidesign_1;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void response(int i) {

        FragmentManager manager=getFragmentManager();
        Fragment_B frgb= (Fragment_B) manager.findFragmentById(R.id.fragment2);
        frgb.changeData(i);

    }
}
