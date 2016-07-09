package com.hanbit.user.myapp160709.contacts;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.hanbit.user.myapp160709.R;

import java.util.ArrayList;

public class ContactsActivity extends Activity implements AdapterView.OnItemClickListener {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        ArrayList<ContactsBean> list = null;
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(new ContactsAdapter(this, list));
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
