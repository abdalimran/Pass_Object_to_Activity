package com.github.abdalimran.passobjecttoactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.abdalimran.passobjecttoactivity.myjavaclasses.PersonInfo;

public class AnotherActivity extends Activity {

    private TextView shwname;
    private TextView shwid;
    private TextView shwmobile;
    private TextView shwaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        shwname = (TextView) findViewById(R.id.shwname);
        shwid = (TextView) findViewById(R.id.shwid);
        shwmobile = (TextView) findViewById(R.id.shwmobile);
        shwaddress = (TextView) findViewById(R.id.shwaddress);

        PersonInfo showpinfo = (PersonInfo) getIntent().getSerializableExtra("PersonInfo");

        shwname.setText("Name: "+showpinfo.getName());
        shwid.setText("ID: "+showpinfo.getId());
        shwmobile.setText("Mobile: "+showpinfo.getMobile());
        shwaddress.setText("Address: "+showpinfo.getAddress());
    }
}
