package com.github.abdalimran.passobjecttoactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.github.abdalimran.passobjecttoactivity.myjavaclasses.*;

public class MainActivity extends Activity {

    private EditText name;
    private EditText id;
    private EditText mobile;
    private EditText address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.getname);
        id= (EditText) findViewById(R.id.getid);
        mobile= (EditText) findViewById(R.id.getmobile);
        address= (EditText) findViewById(R.id.getaddress);
    }

    public void showMagic(View view) {

        String pname=name.getText().toString();
        String pid=id.getText().toString();
        String pmobile=mobile.getText().toString();
        String paddress=address.getText().toString();

        PersonInfo pinfo=new PersonInfo(pname,pid,pmobile,paddress);

        Intent intent=new Intent(getApplicationContext(),AnotherActivity.class);
        intent.putExtra("PersonInfo",pinfo);
        startActivity(intent);
    }
}
