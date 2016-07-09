package com.hanbit.user.myapp160709.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanbit.user.myapp160709.R;

import java.util.ArrayList;

/**
 * Created by 1027 on 2016-07-09.
 */
public class ContactsAdapter extends BaseAdapter {
    private static ArrayList<ContactsBean> list;
    private LayoutInflater inflater;
    private Integer[] imgs ={
            R.drawable.cupcake,
            R.drawable.donut,
            R.drawable.eclair,
            R.drawable.froyo,
            R.drawable.gingerbread,
            R.drawable.honeycomb,
            R.drawable.icecream,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lollipop
    };

    //         생성자       초기화 작업
    public ContactsAdapter(Context context, ArrayList<ContactsBean>list) {
        this.list = list;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View v, ViewGroup g) {
        ViewHoler vh;
        if(v==null){
          //  v=inflater.inflate(0);
            vh = new ViewHoler();
            vh.tvName = (TextView) v.findViewById(R.id.name);
            vh.tvPhone = (TextView) v.findViewById(R.id.phone);
            vh.photo = (ImageView) v.findViewById(R.id.photo);
            v.setTag(vh);
        }else{
            vh = (ViewHoler)v.getTag();
        }
        vh.tvName.setText(list.get(i).getName());
        vh.tvPhone.setText(list.get(i).getPhone());
     //   vh.photo.setImageResources(0);
        return null;
    }
    static class ViewHoler{
        TextView tvName;
        TextView tvPhone;
        ImageView photo;
    }
}
